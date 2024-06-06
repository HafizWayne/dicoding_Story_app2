package com.dicoding.picodiploma.loginwithanimation.view.signup

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.loginwithanimation.data.repository.UserRepository

class SignupViewModel(private val repository: UserRepository): ViewModel() {


    fun register(name: String, email: String, password: String) =
        repository.register(name,email, password)
}

