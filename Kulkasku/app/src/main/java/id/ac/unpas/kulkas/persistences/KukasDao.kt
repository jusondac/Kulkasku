package id.ac.unpas.kulkas.persistences

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.ac.unpas.kulkas.models.Kulkas

@Dao
interface KulkasDao {

    @Query("select * from kukas")
    fun loadAll(): LiveData<List<Kulkas>>

    @Query("select * from kulkas where id = :id")
    fun load(id: String): LiveData<Kulkas>

    @Query("select * from kulkas where id = :id")
    suspend fun getById(id: String): Kulkas?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(vararg items: Kulkas)

    @Query("delete from Kulkas where id = :id")
    suspend fun delete(id: String)

    @Delete
    suspend fun delete(item: Kulkas)
}