package com.example.healthproclienttask.auth.nework

import com.example.healthproclienttask.utility.NetworkUtility
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

//https://www.fitbit.com/oauth2/authorize?response_type=code&client_id=23BKYF&redirect_uri=https%3A%2F%2Ffinished&scope=activity
interface AuthApiService {
//    @Headers("Content-Type: application/json")
    @POST(NetworkUtility.AUTHORIZATION_URL)
    suspend fun authorizationRequest(
//        @Header("accept") type: String,
        @Query("client_id") clientId: String,
        @Query("response_type") responseType: String,
        @Query("redirect_uri") redirectUri: String,
        @Query("scope") scope: String
    )
}