package moh.org.zm.smarthealthcommunity.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "stableoncare")
public class StableOnCare {

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
    @SerializedName("historyDoYouHaveFever")
    @Expose
    private String historyDoYouHaveFever;
    @SerializedName("historyDoYouHaveCough")
    @Expose
    private String historyDoYouHaveCough;
    @SerializedName("historyAreYouLosingWeight")
    @Expose
    private String historyAreYouLosingWeight;
    @SerializedName("historyDoYouHaveHeadache")
    @Expose
    private String historyDoYouHaveHeadache;
    @SerializedName("examBp")
    @Expose
    private String examBp;
    @SerializedName("examTemperature")
    @Expose
    private String examTemperature;
    @SerializedName("examUrineProtein")
    @Expose
    private String examUrineProtein;
    @SerializedName("adhereClientHasDemonstrated")
    @Expose
    private String adhereClientHasDemonstrated;
    @SerializedName("adhereClientHasBeenAskedAboutChallenges")
    @Expose
    private String adhereClientHasBeenAskedAboutChallenges;
    @SerializedName("drugProduct")
    @Expose
    private String drugProduct;
    @SerializedName("drugQuantity")
    @Expose
    private String drugQuantity;
    @SerializedName("drugFrequency")
    @Expose
    private String drugFrequency;
    @SerializedName("dateOfRefill")
    @Expose
    private String dateOfRefill;
    @SerializedName("referralConfirmatory")
    @Expose
    private String referralConfirmatory;
    @SerializedName("referralMaleCircumcision")
    @Expose
    private String referralMaleCircumcision;
    @SerializedName("referralARTClinic")
    @Expose
    private String referralARTClinic;
    @SerializedName("referralPartnerForART")
    @Expose
    private String referralPartnerForART;
    @SerializedName("referralFP")
    @Expose
    private String referralFP;
    @SerializedName("referralHTCAppointment")
    @Expose
    private String referralHTCAppointment;
    @SerializedName("patientId")
    @Expose
    private String patientId;
    @SerializedName("facilityCode")
    @Expose
    private String facilityCode;
    @SerializedName("syncDate")
    @Expose
    private String syncDate;

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

    public String getHistoryDoYouHaveFever() {
        return historyDoYouHaveFever;
    }

    public void setHistoryDoYouHaveFever(String historyDoYouHaveFever) {
        this.historyDoYouHaveFever = historyDoYouHaveFever;
    }

    public String getHistoryDoYouHaveCough() {
        return historyDoYouHaveCough;
    }

    public void setHistoryDoYouHaveCough(String historyDoYouHaveCough) {
        this.historyDoYouHaveCough = historyDoYouHaveCough;
    }

    public String getHistoryAreYouLosingWeight() {
        return historyAreYouLosingWeight;
    }

    public void setHistoryAreYouLosingWeight(String historyAreYouLosingWeight) {
        this.historyAreYouLosingWeight = historyAreYouLosingWeight;
    }

    public String getHistoryDoYouHaveHeadache() {
        return historyDoYouHaveHeadache;
    }

    public void setHistoryDoYouHaveHeadache(String historyDoYouHaveHeadache) {
        this.historyDoYouHaveHeadache = historyDoYouHaveHeadache;
    }

    public String getExamBp() {
        return examBp;
    }

    public void setExamBp(String examBp) {
        this.examBp = examBp;
    }

    public String getExamTemperature() {
        return examTemperature;
    }

    public void setExamTemperature(String examTemperature) {
        this.examTemperature = examTemperature;
    }

    public String getExamUrineProtein() {
        return examUrineProtein;
    }

    public void setExamUrineProtein(String examUrineProtein) {
        this.examUrineProtein = examUrineProtein;
    }

    public String getAdhereClientHasDemonstrated() {
        return adhereClientHasDemonstrated;
    }

    public void setAdhereClientHasDemonstrated(String adhereClientHasDemonstrated) {
        this.adhereClientHasDemonstrated = adhereClientHasDemonstrated;
    }

    public String getAdhereClientHasBeenAskedAboutChallenges() {
        return adhereClientHasBeenAskedAboutChallenges;
    }

    public void setAdhereClientHasBeenAskedAboutChallenges(String adhereClientHasBeenAskedAboutChallenges) {
        this.adhereClientHasBeenAskedAboutChallenges = adhereClientHasBeenAskedAboutChallenges;
    }

    public String getDrugProduct() {
        return drugProduct;
    }

    public void setDrugProduct(String drugProduct) {
        this.drugProduct = drugProduct;
    }

    public String getDrugQuantity() {
        return drugQuantity;
    }

    public void setDrugQuantity(String drugQuantity) {
        this.drugQuantity = drugQuantity;
    }

    public String getDrugFrequency() {
        return drugFrequency;
    }

    public void setDrugFrequency(String drugFrequency) {
        this.drugFrequency = drugFrequency;
    }

    public String getDateOfRefill() {
        return dateOfRefill;
    }

    public void setDateOfRefill(String dateOfRefill) {
        this.dateOfRefill = dateOfRefill;
    }

    public String getReferralConfirmatory() {
        return referralConfirmatory;
    }

    public void setReferralConfirmatory(String referralConfirmatory) {
        this.referralConfirmatory = referralConfirmatory;
    }

    public String getReferralMaleCircumcision() {
        return referralMaleCircumcision;
    }

    public void setReferralMaleCircumcision(String referralMaleCircumcision) {
        this.referralMaleCircumcision = referralMaleCircumcision;
    }

    public String getReferralARTClinic() {
        return referralARTClinic;
    }

    public void setReferralARTClinic(String referralARTClinic) {
        this.referralARTClinic = referralARTClinic;
    }

    public String getReferralPartnerForART() {
        return referralPartnerForART;
    }

    public void setReferralPartnerForART(String referralPartnerForART) {
        this.referralPartnerForART = referralPartnerForART;
    }

    public String getReferralFP() {
        return referralFP;
    }

    public void setReferralFP(String referralFP) {
        this.referralFP = referralFP;
    }

    public String getReferralHTCAppointment() {
        return referralHTCAppointment;
    }

    public void setReferralHTCAppointment(String referralHTCAppointment) {
        this.referralHTCAppointment = referralHTCAppointment;
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
