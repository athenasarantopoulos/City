package br.com.cit.stateandcity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.cit.stateandcity.databinding.ActivityCityBinding
import br.com.cit.stateandcity.databinding.ActivityMainBinding

class City : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city)

        val binding = ActivityCityBinding.inflate(layoutInflater)

        if(intent.extras != null){
            val city = intent.getStringExtra("city")

            if(city != null){
                binding.tvCity.text = city.toString()
            }
        }

        binding.btState.setOnClickListener{
            val intent = Intent(this@City, MainActivity::class.java)

            startActivity(intent)
        }

        setContentView(binding.root)
    }
}