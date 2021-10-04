package com.example.healthproclienttask.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthproclienttask.R
import com.example.healthproclienttask.auth.ui.LoginFragment
import com.example.healthproclienttask.databinding.ActivityAuthBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(binding.container.id, LoginFragment.newInstance())
                .commit()
        }
    }
}