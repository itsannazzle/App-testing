package com.example.testing.testone

internal class MainViewModel(private val cuboidModel: CuboidModel) {
    fun getCircumferences() = cuboidModel.getCircumference()
    fun getSurfaceArea() = cuboidModel.getSurfaceArea()
    fun getVolume() = cuboidModel.getVolume()
    fun save(w: Double,l: Double,h: Double) = cuboidModel.save(w,l,h)
}