# android-health-app
mobile data collection health app


Room implementation

[Room Repo](https://github.com/ashishrawat2911/RoomDemo/tree/master/app/src/main/java/com/ashish/roomdemo/database)

[Room Tutorial](https://medium.com/mindorks/using-room-database-android-jetpack-675a89a0e942)

[Express Tutorial](https://dev.to/lennythedev/quick-rest-api-with-node-and-express-in-5-minutes-336j)

[RecyclerView](https://stackoverflow.com/questions/40584424/simple-android-recyclerview-example)
API endpoints

```
/ping 
/login 
/register
/sync
/facility
```



```
    public Person(int id, String name, String email, String number, String pincode, String city) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.number = number;
        this.pincode = pincode;
        this.city = city;
    }
  ```


```
 public void synchroniseData() {
        Gson gson = new Gson();
        dialog.setMessage(getString(R.string.sync_message));
        dialog.show();
        try {

            final SyncAPIMainRequest request = new SyncAPIMainRequest(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

            ArrayList<Object> eMHealthFacilityFormList = new ArrayList<>();
            ArrayList<Object> eMNationalCentralFormList = new ArrayList<>();
            ArrayList<Object> eMPrivateWholesalersFormList = new ArrayList<>();
            ArrayList<Object> hivTBFormDataList = new ArrayList<>();
            ArrayList<Object> labHealthFacilityFormList = new ArrayList<>();
            ArrayList<Object> labNationalCentralFormList = new ArrayList<>();
            ArrayList<Object> labPrivateWholesalersFormList = new ArrayList<>();

            Cursor unsyncedForms = db.getAllUnsycedForms();
            Cursor totalIdentifications = db.getAllIdentifications();
            Log.d("MainActivityApiCall", "Total IdentificationActivity Records Unsynced: " + unsyncedForms.getCount());
            Log.d("MainActivityApiCall", "Total IdentificationActivity Records: " + totalIdentifications.getCount());


            if (unsyncedForms.getCount() > 0) {
                while (unsyncedForms.moveToNext()) {

                    FormsPayload currentPayload = new FormsPayload(new FormIdentification(), new ArrayList<Object>());
                    FormIdentification currentIdentification = new FormIdentification();

                    ArrayList<Object> currentFormItems = new ArrayList<>();
                    currentIdentification.setFormID(unsyncedForms.getString(1));
                    currentIdentification.setNameOfOutletManager(unsyncedForms.getString(2));
                    currentIdentification.setUserId(unsyncedForms.getString(3));
                    currentIdentification.setDate(unsyncedForms.getString(4));
                    currentIdentification.setCountryID(unsyncedForms.getString(5));
                    currentIdentification.setDistrict(unsyncedForms.getString(6));
                    currentIdentification.setMedicineOutlet(unsyncedForms.getString(7));
                    currentIdentification.setProvider(unsyncedForms.getString(8));
                    currentIdentification.setStatus(unsyncedForms.getString(9));
                    currentIdentification.setDistance(unsyncedForms.getString(10));
                    currentIdentification.setFormType(unsyncedForms.getString(11));
                    currentIdentification.setLevelOfCare(unsyncedForms.getString(12));
                    //set different types of data
                    AgencyLevel agencyLevel = AgencyLevel.getAgencyEnum(currentIdentification.getFormType());
                    currentIdentification.setAgencyLevel(AgencyLevel.valueOfEnum(agencyLevel));

        
                request.seteMHealthFacilityFormData(eMHealthFacilityFormList);
                request.seteMNationalCentralFormDataa(eMNationalCentralFormList);
                request.seteMPrivateWholesalersFormData(eMPrivateWholesalersFormList);
                request.sethivTBFormData(hivTBFormDataList);
                request.setlabHealthFacilityFormData(labHealthFacilityFormList);
                request.setlabNationalCentralFormData(labNationalCentralFormList);
                request.setlabPrivateWholesalersFormData(labPrivateWholesalersFormList);
                if (request.geteMHealthFacilityFormDataa().size() != 0
                        || request.geteMNationalCentralFormData().size() != 0
                        || request.geteMPrivateWholesalersFormData().size() != 0
                        || request.gethivTBFormData().size() != 0
                        || request.getlabHealthFacilityFormData().size() != 0
                        || request.getlabNationalCentralFormData().size() != 0
                        || request.getlabPrivateWholesalersFormData().size() != 0
                ) {
                    initializeRetrofit();
                    apiInterface = retrofit.create(SyncToAPIService.class);
                    Call<SyncDataResponse> call = apiInterface.uploadFormData(request);
                    Log.d(TAG, gson.toJson(request));

                    call.enqueue(new Callback<SyncDataResponse>() {
                        @Override
                        public void onResponse(Call<SyncDataResponse> call, Response<SyncDataResponse> response) {

                            Log.d(TAG, response.body().getMessage());

                            if (response.code() == 200 || response.code() == 201) {
                                Log.d(TAG, String.valueOf(response.body().getListOfSynced().size()));
                                if (dialog.isShowing()) dialog.dismiss();


                                if (response.body() != null) {
                                    Log.d(TAG, response.body().getStatus().toString());

                                    alertDialog(response.body().getMessage(), getString(R.string.ok));
                                } else {
                                    alertDialog(getString(R.string.upload_error_attempt), getString(R.string.ok));
                                }


                            } else {
                                alertDialog(getString(R.string.upload_error_attempt), getString(R.string.ok));
                            }

                        }

                        @Override
                        public void onFailure(Call<SyncDataResponse> call, Throwable t) {
                            if (dialog.isShowing()) dialog.dismiss();
                            alertDialog(getString(R.string.upload_error_attempt), getString(R.string.ok));

                        }
                    });
                } else {
                    if (dialog.isShowing()) dialog.dismiss();
                    alertDialog(getString(R.string.request_incomplete), getString(R.string.ok));
                }

            } else {
                if (dialog.isShowing()) dialog.dismiss();
                alertDialog(getString(R.string.upload_up_to_date), getString(R.string.ok));
            }


        } catch (Exception ex) {
            if (dialog.isShowing()) dialog.dismiss();
        }
    }

    private static void initializeRetrofit() {
        if (retrofit == null) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.BASE_API_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
    }
```
