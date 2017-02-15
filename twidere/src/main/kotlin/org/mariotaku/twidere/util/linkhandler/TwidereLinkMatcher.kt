package org.mariotaku.twidere.util.linkhandler

import android.content.UriMatcher
import android.net.Uri
import org.mariotaku.twidere.Constants.*

/**
 * Created by Mariotaku on 2017/1/18.
 */
object TwidereLinkMatcher {

    private val matcher = UriMatcher(UriMatcher.NO_MATCH).apply {
        addURI(AUTHORITY_STATUS, null, LINK_ID_STATUS)
        addURI(AUTHORITY_USER, null, LINK_ID_USER)
        addURI(AUTHORITY_USER_TIMELINE, null, LINK_ID_USER_TIMELINE)
        addURI(AUTHORITY_USER_MEDIA_TIMELINE, null, LINK_ID_USER_MEDIA_TIMELINE)
        addURI(AUTHORITY_USER_FOLLOWERS, null, LINK_ID_USER_FOLLOWERS)
        addURI(AUTHORITY_USER_FRIENDS, null, LINK_ID_USER_FRIENDS)
        addURI(AUTHORITY_USER_FAVORITES, null, LINK_ID_USER_FAVORITES)
        addURI(AUTHORITY_USER_BLOCKS, null, LINK_ID_USER_BLOCKS)
        addURI(AUTHORITY_MESSAGES, null, LINK_ID_MESSAGES)
        addURI(AUTHORITY_MESSAGES, PATH_MESSAGES_CONVERSATION, LINK_ID_MESSAGES_CONVERSATION)
        addURI(AUTHORITY_MESSAGES, PATH_MESSAGES_CONVERSATION_NEW, LINK_ID_MESSAGES_CONVERSATION_NEW)
        addURI(AUTHORITY_MESSAGES, PATH_MESSAGES_CONVERSATION_INFO, LINK_ID_MESSAGES_CONVERSATION_INFO)
        addURI(AUTHORITY_INTERACTIONS, null, LINK_ID_INTERACTIONS)
        addURI(AUTHORITY_PUBLIC_TIMELINE, null, LINK_ID_PUBLIC_TIMELINE)
        addURI(AUTHORITY_USER_LIST, null, LINK_ID_USER_LIST)
        addURI(AUTHORITY_GROUP, null, LINK_ID_GROUP)
        addURI(AUTHORITY_USER_LIST_TIMELINE, null, LINK_ID_USER_LIST_TIMELINE)
        addURI(AUTHORITY_USER_LIST_MEMBERS, null, LINK_ID_USER_LIST_MEMBERS)
        addURI(AUTHORITY_USER_LIST_SUBSCRIBERS, null, LINK_ID_USER_LIST_SUBSCRIBERS)
        addURI(AUTHORITY_USER_LIST_MEMBERSHIPS, null, LINK_ID_USER_LIST_MEMBERSHIPS)
        addURI(AUTHORITY_USER_LISTS, null, LINK_ID_USER_LISTS)
        addURI(AUTHORITY_USER_GROUPS, null, LINK_ID_USER_GROUPS)
        addURI(AUTHORITY_SAVED_SEARCHES, null, LINK_ID_SAVED_SEARCHES)
        addURI(AUTHORITY_USER_MENTIONS, null, LINK_ID_USER_MENTIONS)
        addURI(AUTHORITY_INCOMING_FRIENDSHIPS, null, LINK_ID_INCOMING_FRIENDSHIPS)
        addURI(AUTHORITY_ITEMS, null, LINK_ID_ITEMS)
        addURI(AUTHORITY_STATUS_RETWEETERS, null, LINK_ID_STATUS_RETWEETERS)
        addURI(AUTHORITY_STATUS_FAVORITERS, null, LINK_ID_STATUS_FAVORITERS)
        addURI(AUTHORITY_SEARCH, null, LINK_ID_SEARCH)
        addURI(AUTHORITY_MUTES_USERS, null, LINK_ID_MUTES_USERS)
        addURI(AUTHORITY_MAP, null, LINK_ID_MAP)
        addURI(AUTHORITY_SCHEDULED_STATUSES, null, LINK_ID_SCHEDULED_STATUSES)

        addURI(AUTHORITY_ACCOUNTS, null, LINK_ID_ACCOUNTS)
        addURI(AUTHORITY_DRAFTS, null, LINK_ID_DRAFTS)
        addURI(AUTHORITY_FILTERS, null, LINK_ID_FILTERS)
        addURI(AUTHORITY_FILTERS, PATH_FILTERS_IMPORT_BLOCKS, LINK_ID_FILTERS_IMPORT_BLOCKS)
        addURI(AUTHORITY_FILTERS, PATH_FILTERS_IMPORT_MUTES, LINK_ID_FILTERS_IMPORT_MUTES)
        addURI(AUTHORITY_FILTERS, PATH_FILTERS_SUBSCRIPTIONS, LINK_ID_FILTERS_SUBSCRIPTIONS)
        addURI(AUTHORITY_FILTERS, PATH_FILTERS_SUBSCRIPTIONS_ADD, LINK_ID_FILTERS_SUBSCRIPTIONS_ADD)
        addURI(AUTHORITY_PROFILE_EDITOR, null, LINK_ID_PROFILE_EDITOR)
    }

    fun match(uri: Uri): Int {
        return matcher.match(uri)
    }
}