package com.example.mobinaabasi.ApiBio

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("poets")
    fun getData():Call<List<MyDataItem>>


    @GET("hafez/faal")
    fun getData2():Call<MyDataItem2>
}