package id.ac.unpas.kulkasku.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Kulkas(
    @PrimaryKey
    val id: String,
    val title: String,
    val description: String,
    val dueDate: String
)