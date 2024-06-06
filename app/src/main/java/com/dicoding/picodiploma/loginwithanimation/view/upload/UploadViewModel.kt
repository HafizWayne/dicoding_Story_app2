package com.dicoding.picodiploma.loginwithanimation.view.upload

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dicoding.picodiploma.loginwithanimation.data.pref.UserModel
import com.dicoding.picodiploma.loginwithanimation.data.repository.UserRepository
import java.io.File

class UploadViewModel(private val repository: UserRepository) : ViewModel()  {

    fun uploadImage(token: String, file: File, description: String) = repository.uploadImage(token, file, description)

    fun getSession(): LiveData<UserModel> {
        return repository.getSession().asLiveData()
    }
}
