package com.ikyzostudios.tp2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ikyzostudios.tp2.databinding.ActivityMainBinding
import com.ikyzostudios.tp2.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivitySecondBinding= DataBindingUtil.setContentView(
            this, R.layout.activity_second)
        var name: String?=intent.getStringExtra("Username")
        binding.tvName.text=name




    }

}
