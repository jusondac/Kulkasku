package id.ac.unpas.kulkasku.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.room.Room
import id.ac.unpas.kulkasku.persintences.AppDatabase

@Composable
fun KulkasScreen() {
    val context = LocalContext.current

    val db = Room.databaseBuilder(context, AppDatabase::class.java, AppDatabase.DATABASE_NAME).build()
    val kulkasDao = db.kulkasDao()


}