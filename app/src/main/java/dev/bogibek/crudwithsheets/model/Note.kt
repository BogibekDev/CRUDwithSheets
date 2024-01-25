package dev.bogibek.crudwithsheets.model

data class Note(
    val title: String,
    val description: String,
    val id: String = "INCREMENT",
    val created: Int? = null,
    val updated: Int? = null,
    val deleted: Int? = null,
    val duplicates: Int? = null,

)
