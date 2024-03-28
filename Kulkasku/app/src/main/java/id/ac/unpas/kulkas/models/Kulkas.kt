package id.ac.unpas.kulkas.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Kulkas(
    @PrimaryKey
    val id: String,
    val name: String,
    val description: String,
    val price: Integer,
    val Expiration: String
)
