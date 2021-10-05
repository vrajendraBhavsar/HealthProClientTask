package com.example.healthproclienttask.auth.ui

import androidx.lifecycle.ViewModel
import com.example.healthproclienttask.auth.usecase.AuthUseCase
import com.example.healthproclienttask.utility.NetworkUtility
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private val authUseCase: AuthUseCase) : ViewModel() {
//    private val acceptHeader = "application/json"
    private val responseType = "code"
    private val redirectUri = "https%3A%2F%2Ffinished"
    private val scope = "activity"

    @DelicateCoroutinesApi
    fun authorizationRequest() {
        GlobalScope.launch(Dispatchers.IO) {
//            tokenString =
                authUseCase.authorizationRequest(
//                acceptHeader,
                NetworkUtility.Client_ID,
                responseType,
                redirectUri,
                scope
            )
        }
//        return tokenString
    }
}