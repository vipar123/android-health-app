package moh.org.zm.smarthealthcommunity.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "appointment")
public class Appointment {

    @SerializedName("id")
    @Expose
    @PrimaryKey
    @NonNull
    private String id;
    @SerializedName("dateOfVisit")
    @Expose
    private String dateOfVisit;
    @SerializedName("servicePoint")
    @Expose
    private String servicePoint;
    @SerializedName("patientId")
    @Expose
    private String patientId;
    @SerializedName("facilityCode")
    @Expose
    private String facilityCode;
    @SerializedName("syncDate")
    @Expose
    private String syncDate;



    public Appointment(String id ,String facilityCode,String dateOfVisit,String servicePoint, String patientId) {
        this.id = id;
        this.dateOfVisit = dateOfVisit;
        this.servicePoint = servicePoint;
        this.patientId = patientId;
        this.facilityCode=facilityCode;

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(String dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getServicePoint() {
        return servicePoint;
    }

    public void setServicePoint(String servicePoint) {
        this.servicePoint = servicePoint;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

}