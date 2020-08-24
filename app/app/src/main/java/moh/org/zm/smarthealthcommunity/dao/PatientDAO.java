package moh.org.zm.smarthealthcommunity.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import moh.org.zm.smarthealthcommunity.models.Appointment;
import moh.org.zm.smarthealthcommunity.models.Patient;

@Dao
public interface PatientDAO {
    @Query("SELECT * FROM PATIENT ORDER BY ID")
    List<Patient> loadAllPatient();

    @Insert
    void insertPatient(Patient patient);

    @Update
    void updatePatient(Patient patient);

    @Delete
    void delete(Patient patient);

    @Query("SELECT * FROM PATIENT WHERE id = :id")
    Patient loadPatientById(int id);
}
