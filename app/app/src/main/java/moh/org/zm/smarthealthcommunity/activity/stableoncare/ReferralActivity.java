package moh.org.zm.smarthealthcommunity.activity.stableoncare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import java.util.UUID;

import moh.org.zm.smarthealthcommunity.R;
import moh.org.zm.smarthealthcommunity.helpers.AppDatabase;
import moh.org.zm.smarthealthcommunity.helpers.AppExecutors;
import moh.org.zm.smarthealthcommunity.models.StableOnCare;

import static moh.org.zm.smarthealthcommunity.helpers.Constants.DP_FREQUENCY;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.DP_QUANTITY;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.DRUG_PRODUCT;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_COUGH;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_FEVER;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_HEADACHE;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_WEIGHT_LOSS;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.PE_BLOOD_PRESSURE;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.PE_TEMPERATURE;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.PE_URINE_PROTEIN;


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

        final Intent intent = getIntent();

        saveRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    final StableOnCare stableOnCare = new StableOnCare(
                    UUID.randomUUID().toString(),
                        "",
                        "",
                        intent.getStringExtra(HH_FEVER),
                            intent.getStringExtra(HH_COUGH),
                            intent.getStringExtra(HH_WEIGHT_LOSS),
                            intent.getStringExtra(HH_HEADACHE),
                            intent.getStringExtra(PE_BLOOD_PRESSURE),
                            intent.getStringExtra(PE_TEMPERATURE),
                            intent.getStringExtra(PE_URINE_PROTEIN),
                            "",
                            "",
                            intent.getStringExtra(DRUG_PRODUCT),
                            intent.getStringExtra(DP_QUANTITY),
                            intent.getStringExtra(DP_FREQUENCY),
                        "",
                        getSelectedRadioValue(referralconfirm.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refmalecircumcision.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refARTClinic.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refPartnerForART.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refFP.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refHTCAppointment.getCheckedRadioButtonId()));


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

            public String getSelectedRadioValue(int id) {
                RadioButton selectedRadioButton = findViewById(id);
                if (selectedRadioButton != null) {
                    return selectedRadioButton.getText().toString();
                }
                return "";
            }
        });
    }
}
