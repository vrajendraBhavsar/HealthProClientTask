package com.example.healthproclienttask.utility

import android.media.session.MediaSession

object NetworkUtility {
    const val AUTHORIZATION_URL = "http://www.fitbit.com/oauth/authorize?oauth_token=%s"

    fun getRequestTokenEndpoint(): String? {
        return "http://api.fitbit.com/oauth/request_token"
    }

    fun getAccessTokenEndpoint(): String? {
        return "http://api.fitbit.com/oauth/access_token"
    }

//    fun getAuthorizationUrl(requestToken: MediaSession.Token): String? {
//        return java.lang.String.format(AUTHORIZATION_URL, requestToken.get)
//    }
}