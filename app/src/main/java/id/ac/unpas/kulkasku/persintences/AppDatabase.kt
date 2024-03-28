package id.ac.unpas.kulkasku.persintences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.kulkasku.models.Kulkas

@Database(entities = [Kulkas::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun kulkasDao(): KulkasDao

    companion object {
        const val DATABASE_NAME = "kulkasku-database"
    }
}