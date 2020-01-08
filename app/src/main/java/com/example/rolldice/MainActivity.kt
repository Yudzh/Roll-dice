package com.example.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Init button
        val button: Button = findViewById(R.id.button)
        //Set the action for the button
        button.setOnClickListener {
            //get random int
            val randomInt = Random().nextInt(6) + 1
            //get random image
            val imageView = when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            //set image
            image.setImageResource(imageView)
            //show int value
            Toast.makeText(this, randomInt.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}