package moh.org.zm.smarthealthcommunity.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.UUID;

import moh.org.zm.smarthealthcommunity.R;
import moh.org.zm.smarthealthcommunity.dao.HivTestingDAO;
import moh.org.zm.smarthealthcommunity.helpers.AppDatabase;
import moh.org.zm.smarthealthcommunity.helpers.AppExecutors;
import moh.org.zm.smarthealthcommunity.models.HivTesting;
import moh.org.zm.smarthealthcommunity.models.StableOnCare;

public class HIVTestingActivity extends AppCompatActivity {
    private AppDatabase db;
    private HivTestingDAO hivTestingDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hivtesting);
        Button saveHivTesting = findViewById(R.id.btnSaveHivTesting);
        final EditText dateOfVisit = findViewById(R.id.edDateOfVisit);
        final RadioGroup consent = findViewById(R.id.consentOnTest);
        final RadioGroup feedback = findViewById(R.id.feedbackOnHiv);
        final RadioGroup testreason = findViewById(R.id.whyTesting);
        final RadioGroup ifpositive = findViewById(R.id.ifPositive);
        final RadioGroup askquestions = findViewById(R.id.askQuestions);
        final Spinner bloodtest = findViewById(R.id.spBloodtest);
        final Spinner partnerStatus = findViewById(R.id.spPartnerStatus);
        final RadioGroup discloseto = findViewById(R.id.discloseTest);
        final RadioGroup windowperiod = findViewById(R.id.windowPeriod);
        final RadioGroup whyretest = findViewById(R.id.needToContinue);
        final RadioGroup postaskquestion = findViewById(R.id.askq);
        final RadioGroup referralconfirm = findViewById(R.id.referralconfirm);
        final RadioGroup refmalecircumcision = findViewById(R.id.refmalecircumcision);
        final RadioGroup refARTClinic = findViewById(R.id.refARTClinic);
        final RadioGroup refPartnerForART = findViewById(R.id.refPartnerForART);
        final RadioGroup refFP = findViewById(R.id.refFP);
        final RadioGroup refHTCAppointment = findViewById(R.id.refHTCAppointment);


        ArrayAdapter<CharSequence> bloodTestAdapter = ArrayAdapter.createFromResource(this,
                R.array.blood_test, android.R.layout.simple_spinner_item);
        bloodTestAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        bloodtest.setAdapter(bloodTestAdapter);

        ArrayAdapter<CharSequence> partnerStatusAdapter = ArrayAdapter.createFromResource(this,
                R.array.blood_test, android.R.layout.simple_spinner_item);
        partnerStatusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        partnerStatus.setAdapter(partnerStatusAdapter);


        db = AppDatabase.getInstance(getApplicationContext());

        saveHivTesting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final HivTesting hivTesting = new HivTesting(
                        UUID.randomUUID().toString(),
                        getSelectedRadioValue(consent.getCheckedRadioButtonId()),
                        getSelectedRadioValue(feedback.getCheckedRadioButtonId()),
                        getSelectedRadioValue(testreason.getCheckedRadioButtonId()),
                        getSelectedRadioValue(ifpositive.getCheckedRadioButtonId()),
                        getSelectedRadioValue(askquestions.getCheckedRadioButtonId()),
                        bloodtest.getSelectedItem().toString(),
                        partnerStatus.getSelectedItem().toString(),
                        getSelectedRadioValue(discloseto.getCheckedRadioButtonId()),
                        getSelectedRadioValue(windowperiod.getCheckedRadioButtonId()),
                        getSelectedRadioValue(postaskquestion.getCheckedRadioButtonId()),
                        getSelectedRadioValue(whyretest.getCheckedRadioButtonId()),
                        getSelectedRadioValue(referralconfirm.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refmalecircumcision.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refPartnerForART.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refARTClinic.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refFP.getCheckedRadioButtonId()),
                        getSelectedRadioValue(refHTCAppointment.getCheckedRadioButtonId()));
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
}