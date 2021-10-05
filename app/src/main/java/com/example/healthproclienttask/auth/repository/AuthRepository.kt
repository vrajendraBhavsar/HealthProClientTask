package com.example.healthproclienttask.auth.repository

import com.example.healthproclienttask.auth.nework.AuthApiService
import javax.inject.Inject

class AuthRepository @Inject constructor(private val authApiService: AuthApiService) {
    suspend fun authorizationRequest(
//        acceptHeader: String,
        clientId: String,
        responseType: String,
        redirectUri: String,
        scope: String
    ) {
         authApiService.authorizationRequest(clientId, responseType, redirectUri, scope)
    }
}