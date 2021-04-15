package com.example.testing.testone

import junit.framework.TestCase
import org.junit.Before
import org.mockito.Mockito.mock

class MainViewModelTest : TestCase() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var cuboidModel: CuboidModel
    private val dummyLength = 12.0
    private val dummyWidth = 7.0
    private val dummyHeight = 6.0
    private val dummyCircumference = 100.0
    private val dummySurfaceArea = 396.0
    private val dummyVolume = 504.0

    @Before
    fun beforeTest(){
        cuboidModel = mock(CuboidModel::class.java)
        mainViewModel = MainViewModel(cuboidModel)
    }
    fun testGetCircumferences() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth,dummyLength,dummyHeight)
        assertEquals(dummyCircumference,mainViewModel.getCircumferences(),0.0001)
    }

    fun testGetSurfaceArea() {
        cuboidModel =  CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth,dummyLength,dummyHeight)

        assertEquals(dummySurfaceArea,mainViewModel.getSurfaceArea(),0.0001)
    }

    fun testGetVolume() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth,dummyLength,dummyHeight)

        assertEquals(dummyVolume,mainViewModel.getVolume(),0.0001)
    }


}