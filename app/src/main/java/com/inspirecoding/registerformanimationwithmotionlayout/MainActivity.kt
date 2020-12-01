package com.inspirecoding.registerformanimationwithmotionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionScene
import com.inspirecoding.registerformanimationwithmotionlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etName.setOnFocusChangeListener { etName, isFocused ->
            if(isFocused) binding.motionLayout.transitionToState(R.id.nameSelected)
        }
        binding.etEmail.setOnFocusChangeListener { etEmail, isFocused ->
            if(isFocused) binding.motionLayout.transitionToState(R.id.emailSelected)
        }
        binding.etPassword.setOnFocusChangeListener { etPassword, isFocused ->
            if(isFocused) binding.motionLayout.transitionToState(R.id.passwordSelected)
        }

    }
}