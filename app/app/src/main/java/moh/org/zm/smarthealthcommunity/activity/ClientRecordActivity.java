package moh.org.zm.smarthealthcommunity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import moh.org.zm.smarthealthcommunity.R;
import moh.org.zm.smarthealthcommunity.helpers.AppDatabase;

public class ClientRecordActivity extends AppCompatActivity {
    private AppDatabase db ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_record);

        db = AppDatabase.getInstance(getApplicationContext());

        Button gotoHivtesting = findViewById(R.id.btngotoHivTesting);
        Button gotoStableOnCare = findViewById(R.id.btngotostableoncare);
        Button gotoAppointment = findViewById(R.id.btngotoaddappointment);


        gotoHivtesting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRecordActivity.this, HIVTestingActivity.class);
                // i.putExtra("key", value);
                startActivity(i);
            }
        });

        gotoStableOnCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRecordActivity.this, StableOnCareActivity.class);
                // i.putExtra("key", value);
                startActivity(i);
            }
        });

        gotoAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRecordActivity.this, AppointmentActivity.class);
                // i.putExtra("key", value);
                startActivity(i);
            }
        });



    }
}
