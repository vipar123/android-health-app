package moh.org.zm.smarthealthcommunity.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import moh.org.zm.smarthealthcommunity.models.Appointment;
import moh.org.zm.smarthealthcommunity.models.HivTesting;

@Dao
public interface HivTestingDAO {
    @Query("SELECT * FROM HIVTESTING ORDER BY ID")
    List<HivTesting> loadAllHivTesting();

    @Insert
    void insertHivTesting(HivTesting hivTesting);

    @Update
    void updateHivTesting(HivTesting hivTesting);

    @Delete
    void delete(HivTesting hivTesting);

    @Query("SELECT * FROM HIVTESTING WHERE id = :id")
    Appointment loadHivTestingById(int id);
}
