package com.example.harrypotterwiki.api


import com.example.harrypotterwiki.model.Student
import com.example.harrypotterwiki.settings.STUDENTS

import com.example.harrypotterwiki.settings.STUDENTS_URL

import retrofit2.Call

import retrofit2.http.GET
import retrofit2.http.Path


interface ApiService {

    @GET(STUDENTS)
    fun getStudents(): Call<List<Student>>



}