package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setuplistner()
    }

    private fun setuplistner(){
        var views  : List<View> = listOf(dataBinding.box1Txt, dataBinding.box2Txt,
            dataBinding.box3Txt, dataBinding.box4Txt, dataBinding.box5Txt)

        views.forEach{
            it.setOnClickListener{
                changeColour(it)
            }
        }
    }

    private fun changeColour(view : View){
        when(view.id){
            R.id.box1_txt -> view.setBackgroundColor(Color.CYAN)
            R.id.box2_txt -> view.setBackgroundColor(Color.BLUE)
            R.id.box3_txt -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box4_txt -> view.setBackgroundColor(Color.RED)
            else -> view.setBackgroundColor(Color.GREEN)
        }

    }
}