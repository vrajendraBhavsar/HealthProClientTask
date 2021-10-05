package com.example.healthproclienttask.auth.usecase

import com.example.healthproclienttask.auth.repository.AuthRepository
import javax.inject.Inject

class AuthUseCase @Inject constructor(private val authRepository: AuthRepository) {
    suspend fun authorizationRequest(
//        acceptHeader: String,
        clientId: String,
        responseType: String,
        redirectUri: String,
        scope: String
    ) {
        authRepository.authorizationRequest( clientId, responseType, redirectUri, scope)
    }
}