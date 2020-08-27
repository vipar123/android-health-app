package moh.org.zm.smarthealthcommunity.activity.stableoncare;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import java.util.UUID;

import moh.org.zm.smarthealthcommunity.R;
import moh.org.zm.smarthealthcommunity.helpers.AppDatabase;
import moh.org.zm.smarthealthcommunity.helpers.AppExecutors;
import moh.org.zm.smarthealthcommunity.models.StableOnCare;

public class ReferralActivity extends AppCompatActivity {

    private AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referral);
        db = AppDatabase.getInstance(getApplicationContext());
        final RadioGroup referralconfirm = findViewById(R.id.referralconfirm);
        final RadioGroup refmalecircumcision = findViewById(R.id.refmalecircumcision);
        final RadioGroup refARTClinic = findViewById(R.id.refARTClinic);
        final RadioGroup refPartnerForART = findViewById(R.id.refPartnerForART);
        final RadioGroup refFP = findViewById(R.id.refFP);
        final RadioGroup refHTCAppointment = findViewById(R.id.refHTCAppointment);
        Button saveRecord = findViewById(R.id.btnSave);

        saveRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 /*   final StableOnCare stableOnCare = new StableOnCare(
                    UUID.randomUUID().toString(),
                        "",
                        "",
                        getSelectedRadioValue(fever.getCheckedRadioButtonId()),
                        getSelectedRadioValue(cough.getCheckedRadioButtonId()),
                        getSelectedRadioValue(weightloss.getCheckedRadioButtonId()),
                        getSelectedRadioValue(headache.getCheckedRadioButtonId()),
                        bloodpressure.getText().toString(),
                        temperature.getText().toString(),
                        "",
                        getSelectedRadioValue(clientdemonstrated.getCheckedRadioButtonId()),
                        getSelectedRadioValue(askedchallenges.getCheckedRadioButtonId()),
                        quantity.getText().toString(),
                        "",
                        "",
                        "",
                        getSelectedRadioValue(referralconfirm.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refmalecircumcision.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refARTClinic.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refPartnerForART.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refFP.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refHTCAppointment.getCheckedRadioButtonId()));
*/

               AppExecutors.getInstance().diskIO().execute(new Runnable() {
                    @Override
                    public void run() {
                        //db.stableOnCareDAO().insertStableOnCare(stableOnCare);
                        //    if (!intent.hasExtra(Constants.UPDATE_Person_Id)) {
                        //      db.PatientDAO().insertPerson(patient);
                        // } else {
                        //   patient.setId(mPersonId);
                        //  db.PatientDAO().updatePatient(patient);
                        // }
                        //finish();
                    }
                });
            }
        });
    }
}
