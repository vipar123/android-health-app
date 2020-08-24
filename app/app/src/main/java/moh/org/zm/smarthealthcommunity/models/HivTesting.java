package moh.org.zm.smarthealthcommunity.models;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "hivtesting")
public class HivTesting {

    @SerializedName("id")
    @Expose
    @PrimaryKey
    @NonNull
    private String id;
    @SerializedName("dateOfVisit")
    @Expose
    private String dateOfVisit;
    @SerializedName("consentToTestToday")
    @Expose
    private String consentToTestToday;
    @SerializedName("pretestClientHasGivenFeedbackOnHiv")
    @Expose
    private String pretestClientHasGivenFeedbackOnHiv;
    @SerializedName("pretestClientHasSaidWhyTesting")
    @Expose
    private String pretestClientHasSaidWhyTesting;
    @SerializedName("pretestClientExplainedIfPositiveResult")
    @Expose
    private String pretestClientExplainedIfPositiveResult;
    @SerializedName("pretestClientExplainedIfNegativeResult")
    @Expose
    private String pretestClientExplainedIfNegativeResult;
    @SerializedName("pretestClientAskedToAsk")
    @Expose
    private String pretestClientAskedToAsk;
    @SerializedName("rapidBloodHivTest")
    @Expose
    private String rapidBloodHivTest;
    @SerializedName("retestDateIfHivNegative")
    @Expose
    private String retestDateIfHivNegative;
    @SerializedName("hivStatusOfPartnerKnown")
    @Expose
    private String hivStatusOfPartnerKnown;
    @SerializedName("hivStatusOfPartner")
    @Expose
    private String hivStatusOfPartner;
    @SerializedName("postTestWhoToDiscloseTo")
    @Expose
    private String postTestWhoToDiscloseTo;
    @SerializedName("postTestToExplainWindowPeriod")
    @Expose
    private String postTestToExplainWindowPeriod;
    @SerializedName("postTestToExplainWhyTheyNeedToContinue")
    @Expose
    private String postTestToExplainWhyTheyNeedToContinue;
    @SerializedName("postTestToAskQuestions")
    @Expose
    private String postTestToAskQuestions;
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
    @SerializedName("facilityCode")
    @Expose
    private String facilityCode;
    @SerializedName("patientId")
    @Expose
    private String patientId;
    @SerializedName("nextAppointment")
    @Expose
    private String nextAppointment;
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

    public String getConsentToTestToday() {
        return consentToTestToday;
    }

    public void setConsentToTestToday(String consentToTestToday) {
        this.consentToTestToday = consentToTestToday;
    }

    public String getPretestClientHasGivenFeedbackOnHiv() {
        return pretestClientHasGivenFeedbackOnHiv;
    }

    public void setPretestClientHasGivenFeedbackOnHiv(String pretestClientHasGivenFeedbackOnHiv) {
        this.pretestClientHasGivenFeedbackOnHiv = pretestClientHasGivenFeedbackOnHiv;
    }

    public String getPretestClientHasSaidWhyTesting() {
        return pretestClientHasSaidWhyTesting;
    }

    public void setPretestClientHasSaidWhyTesting(String pretestClientHasSaidWhyTesting) {
        this.pretestClientHasSaidWhyTesting = pretestClientHasSaidWhyTesting;
    }

    public String getPretestClientExplainedIfPositiveResult() {
        return pretestClientExplainedIfPositiveResult;
    }

    public void setPretestClientExplainedIfPositiveResult(String pretestClientExplainedIfPositiveResult) {
        this.pretestClientExplainedIfPositiveResult = pretestClientExplainedIfPositiveResult;
    }

    public String getPretestClientExplainedIfNegativeResult() {
        return pretestClientExplainedIfNegativeResult;
    }

    public void setPretestClientExplainedIfNegativeResult(String pretestClientExplainedIfNegativeResult) {
        this.pretestClientExplainedIfNegativeResult = pretestClientExplainedIfNegativeResult;
    }

    public String getPretestClientAskedToAsk() {
        return pretestClientAskedToAsk;
    }

    public void setPretestClientAskedToAsk(String pretestClientAskedToAsk) {
        this.pretestClientAskedToAsk = pretestClientAskedToAsk;
    }

    public String getRapidBloodHivTest() {
        return rapidBloodHivTest;
    }

    public void setRapidBloodHivTest(String rapidBloodHivTest) {
        this.rapidBloodHivTest = rapidBloodHivTest;
    }

    public String getRetestDateIfHivNegative() {
        return retestDateIfHivNegative;
    }

    public void setRetestDateIfHivNegative(String retestDateIfHivNegative) {
        this.retestDateIfHivNegative = retestDateIfHivNegative;
    }

    public String getHivStatusOfPartnerKnown() {
        return hivStatusOfPartnerKnown;
    }

    public void setHivStatusOfPartnerKnown(String hivStatusOfPartnerKnown) {
        this.hivStatusOfPartnerKnown = hivStatusOfPartnerKnown;
    }

    public String getHivStatusOfPartner() {
        return hivStatusOfPartner;
    }

    public void setHivStatusOfPartner(String hivStatusOfPartner) {
        this.hivStatusOfPartner = hivStatusOfPartner;
    }

    public String getPostTestWhoToDiscloseTo() {
        return postTestWhoToDiscloseTo;
    }

    public void setPostTestWhoToDiscloseTo(String postTestWhoToDiscloseTo) {
        this.postTestWhoToDiscloseTo = postTestWhoToDiscloseTo;
    }

    public String getPostTestToExplainWindowPeriod() {
        return postTestToExplainWindowPeriod;
    }

    public void setPostTestToExplainWindowPeriod(String postTestToExplainWindowPeriod) {
        this.postTestToExplainWindowPeriod = postTestToExplainWindowPeriod;
    }

    public String getPostTestToExplainWhyTheyNeedToContinue() {
        return postTestToExplainWhyTheyNeedToContinue;
    }

    public void setPostTestToExplainWhyTheyNeedToContinue(String postTestToExplainWhyTheyNeedToContinue) {
        this.postTestToExplainWhyTheyNeedToContinue = postTestToExplainWhyTheyNeedToContinue;
    }

    public String getPostTestToAskQuestions() {
        return postTestToAskQuestions;
    }

    public void setPostTestToAskQuestions(String postTestToAskQuestions) {
        this.postTestToAskQuestions = postTestToAskQuestions;
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

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getNextAppointment() {
        return nextAppointment;
    }

    public void setNextAppointment(String nextAppointment) {
        this.nextAppointment = nextAppointment;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

}