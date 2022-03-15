package com.example.ktragiuaki

import Adapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ktragiuaki.databinding.ActivityMain2Binding
import com.example.ktragiuaki.databinding.ActivityMainBinding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private lateinit var adapter:Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        val bundle = intent.extras
        if (bundle != null) {
            val value1 = bundle.getString("Names", "")
            val value2 = bundle.getString("Emails", "")
            val value3 = bundle.getString("Sdtt", "")
            binding.textView.text = value1
            binding.textView2.text = value2
            binding.textView3.text = value3


        }
        adapter = Adapter(list)
        binding.recycle.adapter = adapter
        binding.recycle.setHasFixedSize(true)
        binding.recycle.layoutManager = LinearLayoutManager(this)
    }}

