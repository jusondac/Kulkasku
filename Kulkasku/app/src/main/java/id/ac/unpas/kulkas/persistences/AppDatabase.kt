package id.ac.unpas.kulkas.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.kulkas.models.Kulkas


@Database(entities = [Kulkas::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun KulkasDao(): KulkasDao

    companion object {
        const val DATABASE_NAME = "kulkasku-database"
    }
}