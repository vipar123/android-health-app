# android-health-app
mobile data collection health app


Room implementation

[Room Repo](https://github.com/ashishrawat2911/RoomDemo/tree/master/app/src/main/java/com/ashish/roomdemo/database)

[Room Tutorial](https://medium.com/mindorks/using-room-database-android-jetpack-675a89a0e942)


```
user
{
    "username","johndoe",
    "password","default",
    "facilityCode":"504086"
}

facility
{
    "facilityName":"Levy Mwanawasa Teaching Hospital",
    "facilityCode":"504086"
}

patient
{
    "id","addasddasdasdasdasdasdasd",
    "patientNupn":"5040860-54545",
    "firstName":"John",
    "lastName":"Doe",
    "gender":"M",
    "dateOfBirth":"10/10/1990",
    "nrc":"111111/11/11",
    "syncDate":""
}

appointment
{
    "id","addasddasdasdasdasdasdasd",
    "dateOfVisit","20/08/2020",
    "servicePoint":"VCT",
    "patientId":"5040860-54545",
    "facilityCode":"504086",
    "syncDate":""
}

hivtesting
{
    "id","addasddasdasdasdasdasdasd",
    "dateOfVisit","20/08/2020",
    "consentToTestToday":"YES",
    "pretestClientHasGivenFeedbackOnHiv":"YES",
    "pretestClientHasSaidWhyTesting":"YES",
    "pretestClientExplainedIfPositiveResult":"YES",
    "pretestClientExplainedIfNegativeResult":"YES",
    "pretestClientAskedToAsk":"YES",
    "rapidBloodHivTest":"POSITIVE":
    "retestDateIfHivNegative":"12/08/2020",
    "hivStatusOfPartnerKnown":"YES",
    "hivStatusOfPartner":"POSITIVE",
    "postTestWhoToDiscloseTo":"YES",
    "postTestToExplainWindowPeriod":"YES",
    "postTestToExplainWhyTheyNeedToContinue":"YES",
    "postTestToAskQuestions":"YES",
    "referralConfirmatory":"YES",
    "referralMaleCircumcision":"YES",
    "referralARTClinic":"NO",
    "referralPartnerForART":"NO",
    "referralFP":"NO",
    "referralHTCAppointment":"NO",
    "facilityCode":"504086",
    "patientId":"5040860-54545",
    "nextAppointment":"23/08/2020",
    "syncDate":""
}

stableoncare
{
    "dateOfVisit","20/08/2020",
    "servicePoint":"VCT",
    "historyDoYouHaveFever":"",
    "historyDoYouHaveCough":"",
    "historyAreYouLosingWeight":"",
    "historyDoYouHaveHeadache":"",
    "examBp":"110/90",
    "examTemperature":"36",
    "examUrineProtein":"NEGATIVE",
	"adhereClientHasDemonstrated":"YES",
    "adhereClientHasBeenAskedAboutChallenges":"YES",
    "drugProduct":"TAF_EFV_DTG",
    "drugQuantity":"30",
    "drugFrequency":"OD",
    "dateOfRefill":"12/08/2020",
    "referralConfirmatory":"YES",
    "referralMaleCircumcision":"YES",
    "referralARTClinic":"NO",
    "referralPartnerForART":"NO",
    "referralFP":"NO",
    "referralHTCAppointment":"NO",
    "patientId":"5040860-54545",
    "facilityCode":"504086",
    "syncDate":""
}

```


Classes

```
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Facility {

@SerializedName("facilityName")
@Expose
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

------------------------------------------------------
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

@SerializedName("username")
@Expose
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
-----------------------------------------

-----------------------------------com.example.Patient.java-----------------------------------

package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Patient {

@SerializedName("id")
@Expose
private String id;
@SerializedName("patientNupn")
@Expose
private String patientNupn;
@SerializedName("firstName")
@Expose
private String firstName;
@SerializedName("lastName")
@Expose
private String lastName;
@SerializedName("gender")
@Expose
private String gender;
@SerializedName("dateOfBirth")
@Expose
private String dateOfBirth;
@SerializedName("nrc")
@Expose
private String nrc;
@SerializedName("syncDate")
@Expose
private String syncDate;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getPatientNupn() {
return patientNupn;
}

public void setPatientNupn(String patientNupn) {
this.patientNupn = patientNupn;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getGender() {
return gender;
}

public void setGender(String gender) {
this.gender = gender;
}

public String getDateOfBirth() {
return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}

public String getNrc() {
return nrc;
}

public void setNrc(String nrc) {
this.nrc = nrc;
}

public String getSyncDate() {
return syncDate;
}

public void setSyncDate(String syncDate) {
this.syncDate = syncDate;
}

}
---------------------------------------
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Appointment {

@SerializedName("id")
@Expose
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

---------------------------------------------

-----------------------------------com.example.HivTesting.java-----------------------------------

package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HivTesting {

@SerializedName("id")
@Expose
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
------------------------------------------------
-----------------------------------com.example.StableOnCare.java-----------------------------------

package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StableOnCare {

@SerializedName("id")
@Expose
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


```

```
<?xml version="1.0" encoding="utf-8"?>
<RadioGroup xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical">
    <RadioButton android:id="@+id/radio_pirates"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/pirates"
        android:onClick="onRadioButtonClicked"/>
    <RadioButton android:id="@+id/radio_ninjas"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/ninjas"
        android:onClick="onRadioButtonClicked"/>
</RadioGroup>
```
Important libraries

```
    implementation 'androidx.recyclerview:recyclerview:1.0.0'
    implementation 'com.squareup.retrofit2:retrofit:2.4.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.4.0'
    implementation 'com.squareup.retrofit2:retrofit-adapters:2.4.0'
    implementation 'com.squareup.okhttp3:okhttp:3.1.2'

```


