package moh.org.zm.smarthealthcommunity.activity.stableoncare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import moh.org.zm.smarthealthcommunity.R;

import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_COUGH;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_FEVER;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_HEADACHE;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_WEIGHT_LOSS;

public class PhysicalExamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_exam);
        Button btnNext = findViewById(R.id.btnNext);
        EditText bloodPressure = findViewById(R.id.edBloodPressure);
        EditText temperature = findViewById(R.id.edtemperature);



       Spinner urineprotein= findViewById(R.id.spUrineProtein);

        ArrayAdapter<CharSequence> urineproteinAdapter = ArrayAdapter.createFromResource(this,
                R.array.urineprotein, android.R.layout.simple_spinner_item);
        urineproteinAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        urineprotein.setAdapter(urineproteinAdapter);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (true) {
                    Intent i = new Intent(PhysicalExamActivity.this, DispensationActivity.class);
                    i.putExtra(HH_FEVER, getSelectedRadioValue(fever.getCheckedRadioButtonId()));
                    i.putExtra(HH_COUGH, getSelectedRadioValue(cough.getCheckedRadioButtonId()));
                    i.putExtra(HH_WEIGHT_LOSS, getSelectedRadioValue(weightloss.getCheckedRadioButtonId()));
                    i.putExtra(HH_HEADACHE, getSelectedRadioValue(headache.getCheckedRadioButtonId()));
                    startActivity(i);
                }

            }
        });

}
}