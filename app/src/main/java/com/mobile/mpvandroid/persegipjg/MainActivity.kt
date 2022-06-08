package com.mobile.mpvandroid.persegipjg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mobile.mpvandroid.R

class MainActivity : AppCompatActivity(), MainView {

    //persegi panjang
    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var btnLuas: Button
    private lateinit var btnKeliling: Button
    private lateinit var tvHasil: TextView

    //persegi
    private lateinit var etSisi: EditText
    private lateinit var btnLuasPersegi: Button
    private lateinit var btnKelilingPersegi: Button
    private lateinit var tvHasilpsg: TextView

    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter(this)
        //persegi panjang
        etPanjang = findViewById(R.id.etPjg)
        etLebar = findViewById(R.id.etLebar)
        btnLuas = findViewById(R.id.btnLuas)
        btnKeliling = findViewById(R.id.btnKeliling)
        tvHasil = findViewById(R.id.tvHasil)

        //persegi
        etSisi = findViewById(R.id.etsisi)
        btnLuasPersegi = findViewById(R.id.btnLuasPsg)
        btnKelilingPersegi = findViewById(R.id.btnKelilingPsg)
//        tvHasilpsg = findViewById(R.id.tvHasilPsg)

        //persegi panjang
        btnLuas.setOnClickListener{
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungLuasPersegiPanjang(panjang, lebar)
        }
        btnKeliling.setOnClickListener{
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegiPanjang(panjang, lebar)
        }

        //persegi
        btnLuasPersegi.setOnClickListener{
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungLuasPersegi(sisi)
        }
        btnKelilingPersegi.setOnClickListener{
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegi(sisi)
        }
    }


    //Persegi Panjang
    override fun updateLuas(luas: Float) {
        tvHasil.text = luas.toString()
    }
    override fun updateKeliling(keliling: Float) {
        tvHasil.text = keliling.toString()
    }
    override fun showError(errorMsg: String) {
        tvHasil.text = errorMsg
    }

}