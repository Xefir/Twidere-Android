package org.mariotaku.twidere.util.media.preview.provider;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.mariotaku.restfu.http.RestHttpClient;
import org.mariotaku.twidere.model.ParcelableMedia;
import org.mariotaku.twidere.util.media.preview.PreviewMediaExtractor;

import java.util.Locale;

/**
 * Created by darkwhite on 1/16/16.
 */
public class TwitterMediaProvider implements Provider {
    @Override
    public boolean supports(@NonNull String link) {
        final String authority = PreviewMediaExtractor.getAuthority(link);
        return authority != null && authority.endsWith(".twimg.com");
    }

    @Nullable
    @Override
    public ParcelableMedia from(@NonNull String link) {
        final String path = PreviewMediaExtractor.getPath(link);
        if (path == null) return null;
        final ParcelableMedia media = new ParcelableMedia();
        media.url = link;
        if (path.startsWith("/tweet_video/")) {
            // Video is not supported yet
            return null;
        } else if (path.startsWith("/media/")) {
            media.type = ParcelableMedia.Type.TYPE_IMAGE;
            media.preview_url = String.format(Locale.ROOT, "%s:medium", link);
            media.media_url = String.format(Locale.ROOT, "%s:orig", link);
        } else {
            media.type = ParcelableMedia.Type.TYPE_IMAGE;
            media.preview_url = link;
            media.media_url = link;
        }

        return media;
    }

    @Nullable
    @Override
    public ParcelableMedia from(@NonNull String link, @NonNull RestHttpClient client, @Nullable Object extra) {
        return from(link);
    }

}