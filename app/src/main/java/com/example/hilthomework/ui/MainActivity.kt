package com.example.hilthomework.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.example.hilthomework.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val vm by viewModels<ImageUrlViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Glide.with(this)
        vm.liveData.observe(this) {
            Glide.with(this)
                .load(it.imageURL)
                .into(findViewById(R.id.ivImage))
        }
        vm.getImageUrl()
    }

}