package moh.org.zm.smarthealthcommunity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.util.List;

import moh.org.zm.smarthealthcommunity.R;
import moh.org.zm.smarthealthcommunity.helpers.AppDatabase;
import moh.org.zm.smarthealthcommunity.helpers.AppExecutors;
import moh.org.zm.smarthealthcommunity.models.Appointment;
import moh.org.zm.smarthealthcommunity.models.HivTesting;
import moh.org.zm.smarthealthcommunity.models.Patient;
import moh.org.zm.smarthealthcommunity.models.StableOnCare;

public class HomeActivity extends AppCompatActivity {

    private AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        db = AppDatabase.getInstance(getApplicationContext());

        Button sync = findViewById(R.id.btnSync);
        Button register = findViewById(R.id.btnRegister);
        Button search = findViewById(R.id.btnSearch);
        Button logout = findViewById(R.id.btnLogout);

        sync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, PatientRegistrationActivity.class);
                // i.putExtra("key", value);
                startActivity(i);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, SearchActivity.class);
                // i.putExtra("key", value);
                startActivity(i);
            }
        });


        AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {
                List<StableOnCare> stableOnCareList = db.stableOnCareDAO().loadAllStableOnCare();
                List<Patient> patientList = db.patientDAO().loadAllPatient();
                List<HivTesting> hivTestingList = db.hivTestingDAO().loadAllHivTesting();
                List<Appointment> appointmentList = db.appointmentDAO().loadAllAppointments();
                Gson gson = new Gson();
                Log.d("HomeActivity", gson.toJson(stableOnCareList));
                Log.d("HomeActivity", gson.toJson(patientList));
                Log.d("HomeActivity", gson.toJson(hivTestingList));
                Log.d("HomeActivity", gson.toJson(appointmentList));
            }
        });


    }
}
