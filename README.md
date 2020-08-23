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
