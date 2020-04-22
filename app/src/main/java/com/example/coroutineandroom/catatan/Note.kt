package com.example.coroutineandroom.catatan

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(
    var title: String,
    var description: String,
    var priority: Int,
    var phonenumber: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}