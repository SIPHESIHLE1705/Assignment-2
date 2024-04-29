package com.example.assignment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        / Get the button and text views
        val btnFeed =findViewById<Button>(R.id.btnFeed)
        val btnClean =findViewById<Button>(R.id.btnClean)
        val btnHappy =findViewById<Button>(R.id.btnPlay)
        val txtHunger =findViewById<EditText>(R.id.txtHunger_value)
        val txtHealth =findViewById<EditText>(R.id.txtHealth_value)
        val txtHappy =findViewById<EditText>(R.id.txtCleanliness_value)
        val petImage =findViewById<ImageView>(R.id.petImage)

        // Set the initial text values
        txtHunger.setText(petHunger.toString())
        txtHealth.setText(petHealth.toString())
        txtHappy.setText(petHealth.toString())

        //Handle button clicks
        btnFeed.setOnClickListener {

            petHunger -= 10
            petHealth += 10
            petHunger += 5
            txtHunger.setText(petHunger.toString())
            animateImageChange(petImage, R.drawable.cat_eating)


            btnClean.text = petCleanliness.toString()
            petCleanliness += 10
            petHealth += 10

            btnClean.setText(petCleanliness)


        }
        btnClean.setOnClickListener {
            petCleanliness += 10
            petHealth += 10

            txtHealth.setText(petCleanliness.toString())
            animateImageChange(petImage, R.drawable.cat_cleaning)

        }
        btnHappy.setOnClickListener {
            petHealth += 10
            petHunger += 5
            petCleanliness -= 5
            txtHappy.setText(petHealth.toString())
            animateImageChange(petImage, R.drawable.cat_playing)

        }

    }

    private fun animateImageChange(imageView: ImageView, newImageResource: Int) {
        val animate = AlphaAnimation(0.0f, 1.0f)
        animate.duration = 500
        animate.fillAfter = true
        imageView.startAnimation(animate)
        imageView.setImageResource(newImageResource)



    }

}


    }
}
