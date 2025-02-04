package com.example.a767
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    fun generateColorPalette(): List<Int> {
        return listOf(
            Color.parseColor("#FF5733"),  // Красный оттенок
            Color.parseColor("#33FF57"),  // Зелёный оттенок
            Color.parseColor("#3357FF"),  // Синий оттенок
            Color.parseColor("#FFFF33"),  // Жёлтый
            Color.parseColor("#FF33FF"),  // Пурпурный
            Color.parseColor("#33FFFF")   // Голубой
        )
    }

    val colorsList = generateColorPalette()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rview)
        val colorAdapter = ColorAdapter(LayoutInflater.from(this))

        colorAdapter.submitList(colorsList)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = colorAdapter
    }
}