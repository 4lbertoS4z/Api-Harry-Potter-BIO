package com.example.harrypotterwiki.api


import com.example.harrypotterwiki.model.Staff
import com.example.harrypotterwiki.model.Student
import com.example.harrypotterwiki.settings.STAFF
import com.example.harrypotterwiki.settings.STUDENTS

import retrofit2.Call

import retrofit2.http.GET
import retrofit2.http.Path


interface ApiService {

    @GET(STUDENTS)
    fun getStudents(): Call<List<Student>>

    @GET(STAFF)
    fun getStaffs(): Call<List<Staff>>



}