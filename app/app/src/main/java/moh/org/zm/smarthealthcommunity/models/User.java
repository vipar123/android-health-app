package moh.org.zm.smarthealthcommunity.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "user")
public class User {

    @SerializedName("username")
    @Expose
    @PrimaryKey
    @NonNull
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("facilityCode")
    @Expose
    private String facilityCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

}