package moh.org.zm.smarthealthcommunity.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import moh.org.zm.smarthealthcommunity.models.Appointment;
import moh.org.zm.smarthealthcommunity.models.StableOnCare;

@Dao
public interface StableOnCareDAO {
    @Query("SELECT * FROM STABLEONCARE ORDER BY ID")
    List<StableOnCare> loadAllStableOnCare();

    @Insert
    void insertStableOnCare(StableOnCare stableOnCare);

    @Update
    void updateStableOnCare(StableOnCare stableOnCare);

    @Delete
    void delete(StableOnCare stableOnCare);

    @Query("SELECT * FROM STABLEONCARE WHERE id = :id")
    StableOnCare loadStableOnCareById(int id);
}
