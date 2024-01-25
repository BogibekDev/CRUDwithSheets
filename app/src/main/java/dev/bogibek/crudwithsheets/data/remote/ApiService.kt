package dev.bogibek.crudwithsheets.data.remote

import dev.bogibek.crudwithsheets.model.Note
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path


interface ApiService {

    @GET(" ")
    fun getAllNotes(): Call<ArrayList<Note>>

    @GET("search?id={id}")
    fun getNoteById(
        @Path("id") id: String
    ): Call<ArrayList<Note>>

    @POST(" ")
    fun addNote(
        @Body note: Note
    ): Call<Note>

    @PATCH("id/{id}")
    fun updateNoteById(
        @Path("id") id: String,
        @Body note: Note
    ): Call<Note>


    @DELETE("id/{id}")
    fun deleteNoteById(
        @Path("id") id: String,
    ): Call<Note>


    @DELETE("duplicates")
    fun deleteDuplicateNotes():Call<Note>

    @DELETE("all")
    fun deleteAllNotes():Call<Note>

}