package moh.org.zm.smarthealthcommunity.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.UUID;

import moh.org.zm.smarthealthcommunity.R;
import moh.org.zm.smarthealthcommunity.dao.PatientDAO;
import moh.org.zm.smarthealthcommunity.helpers.AppDatabase;
import moh.org.zm.smarthealthcommunity.helpers.AppExecutors;
import moh.org.zm.smarthealthcommunity.models.Patient;

public class PatientRegistrationActivity extends AppCompatActivity {
    private AppDatabase db;
    private PatientDAO patientDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_registration);
        Button saveRegistration = findViewById(R.id.btnPatientRegistration);
        final EditText firstName = findViewById(R.id.edFname);
        final EditText lastName = findViewById(R.id.edLname);
        final Spinner gender = findViewById(R.id.spGender);
        final EditText dob = findViewById(R.id.edDOB);
        final EditText nrc = findViewById(R.id.edNRC);

        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(this,
                R.array.gender, android.R.layout.simple_spinner_item);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gender.setAdapter(genderAdapter);

        db = AppDatabase.getInstance(getApplicationContext());

        saveRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Patient patient = new Patient(
                        UUID.randomUUID().toString(),
                        "",
                        firstName.getText().toString(),
                        lastName.getText().toString(),

                        dob.getText().toString(),
                        nrc.getText().toString(),
                        gender.getSelectedItem().toString());

                AppExecutors.getInstance().diskIO().execute(new Runnable() {
                    @Override
                    public void run() {
                        db.patientDAO().insertPatient(patient);
                        //    if (!intent.hasExtra(Constants.UPDATE_Person_Id)) {
                        //      db.PatientDAO().insertPerson(patient);
                        // } else {
                        //   patient.setId(mPersonId);
                        //  db.PatientDAO().updatePatient(patient);
                        // }
                        finish();
                    }
                });
            }
        });
    }
}