package com.example.ktragiuaki

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ktragiuaki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.login.setOnClickListener {
            val name = binding.name.text.toString()
            val email = binding.email.text.toString()
            val sdt = binding.phone.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putString("Names", name)
            bundle.putString("Emails",email)
            bundle.putString("Sdtt",sdt)
            intent.putExtras(bundle);
            startActivity(intent);
////            var arr = arrayOf<String>("Ha Noi", "BeginnersBook","new york", "jaos")
//            val s1 = "New York"
////
//            val cap = Data(s1)
////            val cap1 = Data(s1)
////            Main2.Datas.add(cap)
//            Main2.Datas.add(cap)
//            finish()
        }

    }
}