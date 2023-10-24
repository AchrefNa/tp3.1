package com.ikyzostudios.tp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.ikyzostudios.tp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var name:EditText
    lateinit var password:EditText
    lateinit var number:EditText
    lateinit var email:EditText
    lateinit var submit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)
        binding.etButton.setOnClickListener {
            if (binding.etName.text.toString().isNotEmpty() &&
                binding.edPassword.text.toString().isNotEmpty() &&
                binding.etNumber.text.toString().isNotEmpty() &&
                binding.etEmail.text.toString().isNotEmpty()
            ) {



               /* val text = "OK!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(this, text, duration)
                toast.show()*/
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                val userName=binding.etName.text.toString()
                intent.putExtra("Username", userName)
                startActivity(intent)
            } else {
                val text = "Vous-avez une case empty!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(this, text, duration)
                toast.show()

            }
        }
        /*
                name=findViewById(R.id.et_name)
                password=findViewById(R.id.ed_password)
                number=findViewById(R.id.et_number)
                email=findViewById(R.id.et_email)
                submit=findViewById(R.id.et_button)


                submit.setOnClickListener {
                    if (name.text.toString().isNotEmpty()&& password.text.toString().isNotEmpty()&&number.text.toString().isNotEmpty()&&email.text.toString().isNotEmpty()){

                        val text = "OK!${name.text}"
                        val duration = Toast.LENGTH_SHORT

                        val toast = Toast.makeText(this, text, duration)
                        toast.show()
                    }else{
                        val text = "Vous-avez une case empty!"
                        val duration = Toast.LENGTH_SHORT

                        val toast = Toast.makeText(this, text, duration)
                        toast.show()

                    }
        */


        }

    }
