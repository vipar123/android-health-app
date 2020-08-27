package moh.org.zm.smarthealthcommunity.activity.stableoncare;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import moh.org.zm.smarthealthcommunity.R;

public class DispensationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispensation);
        EditText quantity = findViewById(R.id.edQuantity);
      //  RadioGroup adherance = findViewById(R.id.clientdemonstrated);
       // RadioGroup askedchallenges = findViewById(R.id.askedchallenges);
        Spinner drugproduct= findViewById(R.id.spdrugProduct);
        Spinner frequency= findViewById(R.id.spFrequency);

        ArrayAdapter<CharSequence> drugProductAdapter = ArrayAdapter.createFromResource(this,
                R.array.drug_products, android.R.layout.simple_spinner_item);
        drugProductAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        drugproduct.setAdapter(drugProductAdapter);

        ArrayAdapter<CharSequence> frequencyAdapter = ArrayAdapter.createFromResource(this,
                R.array.frequency, android.R.layout.simple_spinner_item);
        frequencyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        frequency.setAdapter(frequencyAdapter);



    }
}
