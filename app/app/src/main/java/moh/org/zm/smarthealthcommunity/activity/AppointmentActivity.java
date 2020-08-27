package moh.org.zm.smarthealthcommunity.activity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;

import moh.org.zm.smarthealthcommunity.R;
import moh.org.zm.smarthealthcommunity.activity.stableoncare.DispensationActivity;
import moh.org.zm.smarthealthcommunity.activity.stableoncare.PhysicalExamActivity;
import moh.org.zm.smarthealthcommunity.dao.AppointmentDAO;
import moh.org.zm.smarthealthcommunity.helpers.AppDatabase;
import moh.org.zm.smarthealthcommunity.helpers.AppExecutors;
import moh.org.zm.smarthealthcommunity.models.Appointment;
import moh.org.zm.smarthealthcommunity.models.Patient;

public class AppointmentActivity extends AppCompatActivity {
    private AppDatabase db;
    private ProgressDialog dialog;
    private AppointmentDAO appointmentDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        Button addAppointment = findViewById(R.id.btnAddAppointment);
        dialog = new ProgressDialog(AppointmentActivity.this);
        final EditText dateOfAppointment = findViewById(R.id.edDOA);
        final Spinner servicePoint = findViewById(R.id.spService);


        ArrayAdapter<CharSequence> servicePointAdapter = ArrayAdapter.createFromResource(this,
                R.array.service_points, android.R.layout.simple_spinner_item);
        servicePointAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        servicePoint.setAdapter(servicePointAdapter);


        db = AppDatabase.getInstance(getApplicationContext());

        final Calendar myCalendar = Calendar.getInstance();

        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

            private void updateLabel() {
                String myFormat = "MM/dd/yy"; //In which you need put here
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
                dateOfAppointment.setText(sdf.format(myCalendar.getTime()));
            }

        };

        dateOfAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(AppointmentActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        addAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setMessage("Saving..please wait");
                dialog.show();
                final Appointment appointment = new Appointment(
                        UUID.randomUUID().toString(),
                        " ",
                        dateOfAppointment.getText().toString(),
                        servicePoint.getSelectedItem().toString(),
                        "");
                AppExecutors.getInstance().diskIO().execute(new Runnable() {
                    @Override
                    public void run() {
                        db.appointmentDAO().insertAppointment(appointment);
                        if (dialog.isShowing()) dialog.dismiss();

                    }
                });
                new AlertDialog.Builder(AppointmentActivity.this)
                        .setTitle("Appointment")
                        .setMessage("Appointment successfully saved!")
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(AppointmentActivity.this, ClientRecordActivity.class);
                                startActivity(i);
                            }
                        })
                        .show();
            }
        });


    }

}

