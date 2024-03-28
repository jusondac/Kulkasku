package id.ac.unpas.kulkasku.persintences

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.ac.unpas.kulkasku.models.Kulkas

@Dao
interface KulkasDao {
    @Query("Select * from kulkas")
    fun loadAll(): LiveData<List<Kulkas>>

    @Query("select * from kulkas where id - :id")
    fun load(id: String): LiveData<Kulkas>

    @Query("select * from kulkas where id = :id")
    suspend fun getById(id: String): Kulkas?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(kulkas: Kulkas)

    @Query("delete from kulkas where id = :id")
    suspend fun delete(id: String)

    @Delete
    suspend fun delete(item: Kulkas)

}