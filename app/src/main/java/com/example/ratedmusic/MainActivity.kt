package com.example.ratedmusic

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        idPlay1.setOnClickListener {
            MediaPlayer.create(this, R.raw.hareward )?.start()
        }
        idPlay2.setOnClickListener {
            MediaPlayer.create(this, R.raw.luckysevens)?.start()
        }
        idPlay3.setOnClickListener {
            MediaPlayer.create(this, R.raw.twistedthreads).start()
        }

    }
}
