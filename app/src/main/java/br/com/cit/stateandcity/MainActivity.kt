package br.com.cit.stateandcity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.cit.stateandcity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       supportActionBar?.hide()

        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btCity.setOnClickListener {
            val intent = Intent(this@MainActivity, City::class.java)

            val city = "Florestal"

            intent.putExtra("city", city)

            startActivity(intent)
        }

        setContentView(binding.root)

    }
}