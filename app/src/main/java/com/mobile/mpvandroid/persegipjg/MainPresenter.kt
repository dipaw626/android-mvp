package com.mobile.mpvandroid.persegipjg

class MainPresenter(private val mainView: MainView) {

    //persegi panjang
    fun hitungLuasPersegiPanjang(panjang: Float, lebar: Float) {

        if (panjang == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (lebar == 0F) {
            mainView.showError("Lebar tidak boleh 0")
            return
        }
        val luas = panjang * lebar
        mainView.updateLuas(luas)
    }
    fun hitungKelilingPersegiPanjang(panjang: Float, lebar: Float) {

            if (panjang == 0F) {
                mainView.showError("Panjang tidak boleh 0")
                return
            }
            if (lebar == 0F) {
                mainView.showError("Lebar tidak boleh 0")
                return
            }
        val keliling = 2 * (panjang + lebar)
        mainView.updateKeliling(keliling)
    }

    //persegi
    fun hitungLuasPersegi(sisi: Float) {
        if (sisi == 0F) {
            mainView.showError("Sisi tidak boleh 0")
            return
        }
        val luaspsg = sisi*sisi
        mainView.updateLuas(luaspsg)
    }
    fun hitungKelilingPersegi(sisi: Float) {
        if (sisi == 0F) {
            mainView.showError("Sisi tidak boleh 0")
            return
        }
        val kelilingpsg = 4*sisi
        mainView.updateKeliling(kelilingpsg)
    }

}