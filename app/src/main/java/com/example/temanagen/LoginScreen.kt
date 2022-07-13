package com.example.temanagen

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.view.ViewStub
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Spinner
import androidx.constraintlayout.motion.utils.ViewState
import androidx.fragment.app.Fragment
import android.view.ViewGroup




class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

//        val editTextEmail=findViewById<EditText>(R.id.editTextEmail)
////        val spinnerPhonecountry=findViewById<Spinner>(R.id.spinnerPhoneCountry)
////        val editTextPhone=findViewById<EditText>(R.id.editTextPhone)
        val navDaftar=findViewById<Button>(R.id.navDaftar)
        val navMasuk=findViewById<Button>(R.id.navLogin)
//        val btnSubmit=findViewById<Button>(R.id.btnSubmit)
//        val layoutDaftar=findViewById<ViewStub>(R.id.daftarLayout)
//
        navDaftar.setOnClickListener {
            var row = navDaftar.getParent() as ViewGroup
            (row.getChildAt(0) as Button).setTextColor(resources.getColor(R.color.black))
            row.getChildAt(1).visibility=View.VISIBLE

            row = navMasuk.getParent() as ViewGroup
            (row.getChildAt(0) as Button).setTextColor(resources.getColor(R.color.text_gray))
            row.getChildAt(1).visibility=View.INVISIBLE

            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            val fragment=DaftarFragment()

            transaction.replace(R.id.fragment, fragment)
            transaction.commit()
        }

        navMasuk.setOnClickListener {
            var row = navDaftar.getParent() as ViewGroup
            (row.getChildAt(0) as Button).setTextColor(resources.getColor(R.color.text_gray))
            row.getChildAt(1).visibility=View.INVISIBLE

            row = navMasuk.getParent() as ViewGroup
            (row.getChildAt(0) as Button).setTextColor(resources.getColor(R.color.black))
            row.getChildAt(1).visibility=View.VISIBLE

            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            val fragment=LoginFragment()

            transaction.replace(R.id.fragment, fragment)
            transaction.commit()
        }
    }
}