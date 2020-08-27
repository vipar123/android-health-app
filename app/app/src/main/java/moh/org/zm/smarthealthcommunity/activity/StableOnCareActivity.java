package moh.org.zm.smarthealthcommunity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import moh.org.zm.smarthealthcommunity.R;
import moh.org.zm.smarthealthcommunity.activity.stableoncare.PhysicalExamActivity;
import moh.org.zm.smarthealthcommunity.activity.stableoncare.ReferralActivity;
import moh.org.zm.smarthealthcommunity.dao.StableOnCareDAO;
import moh.org.zm.smarthealthcommunity.helpers.AppDatabase;

import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_COUGH;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_FEVER;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_HEADACHE;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_WEIGHT_LOSS;


public class StableOnCareActivity extends AppCompatActivity {
    private AppDatabase db;
    private StableOnCareDAO stableOnCareDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stable_on_care);
        Button btnNext = findViewById(R.id.btnNext);

        final RadioGroup fever = findViewById(R.id.fever);
        final RadioGroup cough = findViewById(R.id.cough);
        final RadioGroup weightloss = findViewById(R.id.weightloss);
        final RadioGroup headache = findViewById(R.id.headache);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (true) {
                    Intent i = new Intent(StableOnCareActivity.this, PhysicalExamActivity.class);
                    i.putExtra(HH_FEVER, getSelectedRadioValue(fever.getCheckedRadioButtonId()));
                    i.putExtra(HH_COUGH, getSelectedRadioValue(cough.getCheckedRadioButtonId()));
                    i.putExtra(HH_WEIGHT_LOSS, getSelectedRadioValue(weightloss.getCheckedRadioButtonId()));
                    i.putExtra(HH_HEADACHE, getSelectedRadioValue(headache.getCheckedRadioButtonId()));
                    startActivity(i);
                } else {
                    Intent i = new Intent(StableOnCareActivity.this, ReferralActivity.class);
                    startActivity(i);
                }
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