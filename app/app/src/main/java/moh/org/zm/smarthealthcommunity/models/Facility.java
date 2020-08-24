package moh.org.zm.smarthealthcommunity.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "facility" +
        "")
public class Facility {

    @SerializedName("facilityName")
    @Expose
    @PrimaryKey
    @NonNull
    private String facilityName;
    @SerializedName("facilityCode")
    @Expose
    private String facilityCode;

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

}
