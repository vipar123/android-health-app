package moh.org.zm.smarthealthcommunity.activity.stableoncare;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import moh.org.zm.smarthealthcommunity.R;

import static moh.org.zm.smarthealthcommunity.helpers.Constants.DP_FREQUENCY;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.DP_QUANTITY;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.DRUG_PRODUCT;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_COUGH;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_FEVER;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_HEADACHE;
import static moh.org.zm.smarthealthcommunity.helpers.Constants.HH_WEIGHT_LOSS;

public class DispensationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispensation);
        Button btnDispense = findViewById(R.id.btnDispense);
        final EditText quantity = findViewById(R.id.edQuantity);
        final Spinner drugProduct= findViewById(R.id.spdrugProduct);
        final Spinner frequency= findViewById(R.id.spFrequency);

        ArrayAdapter<CharSequence> drugProductAdapter = ArrayAdapter.createFromResource(this,
                R.array.drug_products, android.R.layout.simple_spinner_item);
        drugProductAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        drugProduct.setAdapter(drugProductAdapter);

        ArrayAdapter<CharSequence> frequencyAdapter = ArrayAdapter.createFromResource(this,
                R.array.frequency, android.R.layout.simple_spinner_item);
        frequencyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        frequency.setAdapter(frequencyAdapter);

        btnDispense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (true) {
                    Intent i = new Intent(DispensationActivity.this, ReferralActivity.class);
                    i.putExtra(DP_QUANTITY, quantity.getText());
                    i.putExtra(DRUG_PRODUCT,drugProduct.getSelectedItemId() );
                    i.putExtra(DP_FREQUENCY, frequency.getSelectedItemId());

                    startActivity(i);
                }

            }
        });


    }
}
