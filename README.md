# android-health-app
mobile data collection health app


Room implementation

[Room Repo](https://github.com/ashishrawat2911/RoomDemo/tree/master/app/src/main/java/com/ashish/roomdemo/database)

[Room Tutorial](https://medium.com/mindorks/using-room-database-android-jetpack-675a89a0e942)

```
    public void onSaveButtonClicked() {
        final Person person = new Person(
                name.getText().toString(),
                email.getText().toString(),
                phoneNumber.getText().toString(),
                pincode.getText().toString(),
                city.getText().toString());

        AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {
                if (!intent.hasExtra(Constants.UPDATE_Person_Id)) {
                    mDb.personDao().insertPerson(person);
                } else {
                    person.setId(mPersonId);
                    mDb.personDao().updatePerson(person);
                }
                finish();
            }
        });
    }
  ```

