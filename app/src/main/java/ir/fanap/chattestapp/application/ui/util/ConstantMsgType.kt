package ir.fanap.chattestapp.application.ui.util

import android.support.annotation.StringDef

class ConstantMsgType {

    companion object {
        const val SEND_LOCATION_MESSAGE = "SEND_LOCATION_MESSAGE"
        const val SEARCH_CONTACT = "SEARCH_CONTACT"
        const val GET_DELIVER_LIST = "GET_DELIVER_LIST"
        const val GET_SEEN_LIST = "GET_SEEN_LIST"
        const val CREATE_THREAD_WITH_MSG_MESSAGE = "CREATE_THREAD_WITH_MSG_MESSAGE"
        const val CREATE_THREAD_WITH_MSG = "CREATE_THREAD_WITH_MSG"
        const val UPDATE_CONTACT = "UPDATE_CONTACT"
        const val SEND_MESSAGE = "SEND_MESSAGE"
        const val GET_THREAD = "GET_THREAD"
        const val ADD_CONTACT = "ADD_CONTACT"
        const val REMOVE_CONTACT = "REMOVE_CONTACT"
        const val UNBLOCK_CONTACT = "UNBLOCK_CONTACT"
        const val BLOCK_CONTACT = "BLOCK_CONTACT"
        const val GET_CONTACT = "GET_CONTACT"
        const val CREATE_THREAD = "CREATE_THREAD"
        const val CREATE_THREAD_CHANNEL = "CREATE_THREAD_CHANNEL"
        const val CREATE_THREAD_CHANNEL_GROUP = "CREATE_THREAD_CHANNEL_GROUP"
        const val CREATE_THREAD_PUBLIC_GROUP = "CREATE_THREAD_PUBLIC_GROUP"
        const val CREATE_THREAD_OWNER_GROUP = "CREATE_THREAD_OWNER_GROUP"
        const val REMOVE_PARTICIPANT = "REMOVE_PARTICIPANT"
        const val ADD_PARTICIPANT = "ADD_PARTICIPANT"
        const val FORWARD_MESSAGE = "FORWARD_MESSAGE"
        const val FORWARD_MESSAGE_ID = "FORWARD_MESSAGE_ID"
        const val FORWARD_MESSAGE_THREAD_ID = "FORWARD_MESSAGE_ID"
        const val REPLY_MESSAGE = "REPLY_MESSAGE"
        const val REPLY_MESSAGE_ID = "REPLY_MESSAGE_ID"
        const val REPLY_MESSAGE_THREAD_ID = "REPLY_MESSAGE_THREAD_ID"
        const val LEAVE_THREAD = "LEAVE_THREAD"
        const val MUTE_THREAD = "MUTE_THREAD"
        const val UNMUTE_THREAD = "UNMUTE_THREAD"
        const val DELETE_MESSAGE = "DELETE_MESSAGE"
        const val DELETE_MESSAGE_ID = "DELETE_MESSAGE_ID"
        const val EDIT_MESSAGE = "EDIT_MESSAGE"
        const val EDIT_MESSAGE_ID = "EDIT_MESSAGE_ID"
        const val GET_HISTORY = "GET_HISTORY"
        const val SEND_FILE_MESSAGE = "SEND_FILE_MESSAGE"
        const val REPLY_FILE_MESSAGE = "REPLY_FILE_MESSAGE"
        const val CREATE_THREAD_WITH_FORW_MSG = "CREATE_THREAD_WITH_FORW_MSG"
        const val CREATE_THREAD_WITH_FORW_MSG_CONTCT_ID = "CREATE_THREAD_WITH_FORW_MSG_CONTCT_ID"
        const val CREATE_THREAD_WITH_FORW_MSG_ID = "CREATE_THREAD_WITH_FORW_MSG_ID"
        const val GET_PARTICIPANT = "GET_PARTICIPANT"
        const val CLEAR_HISTORY = "CLEAR_HISTORY"
        const val GET_ADMINS_LIST = "GET_ADMINS_LIST"
        const val ADD_ADMIN_ROLES = "ADD_ADMIN_ROLES"
        const val REMOVE_ADMIN_ROLES = "REMOVE_ADMIN_ROLES"
        const val DELETE_MULTIPLE_MESSAGE = "DELETE_MULTIPLE_MESSAGE"
    }

    @StringDef(
        UPDATE_CONTACT,
        GET_THREAD
        , ADD_CONTACT
        , UNBLOCK_CONTACT
        , BLOCK_CONTACT
        , GET_CONTACT
        , CREATE_THREAD
        , CREATE_THREAD_CHANNEL,
        CREATE_THREAD_CHANNEL_GROUP,
        CREATE_THREAD_PUBLIC_GROUP,
        CREATE_THREAD_OWNER_GROUP,
        REMOVE_PARTICIPANT,
        ADD_PARTICIPANT,
        FORWARD_MESSAGE,
        FORWARD_MESSAGE_ID,
        FORWARD_MESSAGE_THREAD_ID,
        REPLY_MESSAGE,
        REPLY_MESSAGE_ID,
        REPLY_MESSAGE_THREAD_ID,
        LEAVE_THREAD,
        UNMUTE_THREAD,
        MUTE_THREAD,
        REMOVE_CONTACT,
        DELETE_MESSAGE_ID,
        EDIT_MESSAGE_ID,
        EDIT_MESSAGE,
        REPLY_FILE_MESSAGE,
        CREATE_THREAD_WITH_FORW_MSG,
        CREATE_THREAD_WITH_FORW_MSG_ID,
        GET_PARTICIPANT,
        DELETE_MESSAGE,
        CLEAR_HISTORY,
        GET_ADMINS_LIST,
        ADD_ADMIN_ROLES,
        REMOVE_ADMIN_ROLES,
        DELETE_MULTIPLE_MESSAGE,
        CREATE_THREAD_WITH_MSG,
        CREATE_THREAD_WITH_MSG_MESSAGE,
        GET_SEEN_LIST,
        GET_DELIVER_LIST,
        SEARCH_CONTACT,
        SEND_LOCATION_MESSAGE
    )

    @Retention(AnnotationRetention.SOURCE)
    annotation class CONSTANT
}