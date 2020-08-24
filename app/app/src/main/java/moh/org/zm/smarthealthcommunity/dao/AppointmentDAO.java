package moh.org.zm.smarthealthcommunity.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import moh.org.zm.smarthealthcommunity.models.Appointment;

@Dao
public interface AppointmentDAO {
    @Query("SELECT * FROM APPOINTMENT ORDER BY ID")
    List<Appointment> loadAllAppointments();

    @Insert
    void insertAppointment(Appointment appointment);

    @Update
    void updateAppointment(Appointment appointment);

    @Delete
    void delete(Appointment appointment);

    @Query("SELECT * FROM APPOINTMENT WHERE id = :id")
    Appointment loadAppointmentById(int id);
}
