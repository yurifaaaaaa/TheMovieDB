package com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.themoviedb.R

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
    }
}