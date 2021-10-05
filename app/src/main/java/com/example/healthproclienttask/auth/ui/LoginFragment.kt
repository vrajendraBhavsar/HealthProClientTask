package com.example.healthproclienttask.auth.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.healthproclienttask.R
import com.example.healthproclienttask.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding
    val TAG = "HEALTHPROTEST"

    companion object {
        fun newInstance() = LoginFragment()
    }

    val authViewModel by viewModels<AuthViewModel>() //vm

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.btnAuth.setOnClickListener {
//            val clientToken = authViewModel.authorizationRequest()
//            if (clientToken != "") {
//                Toast.makeText(requireContext(), clientToken, Toast.LENGTH_SHORT).show()
//                Log.d(TAG, "onActivityCreated: $clientToken")
//            } else {
//                Toast.makeText(requireContext(), "Couldn't get token..", Toast.LENGTH_SHORT).show()
//            }
            GetUrlFromIntent()
        }
    }
    fun GetUrlFromIntent() {
        val url: String = "https://www.fitbit.com/oauth2/authorize?response_type=code&client_id=23BKYF&redirect_uri=https%3A%2F%2Ffinished&scope=activity"
        val intent: Intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}