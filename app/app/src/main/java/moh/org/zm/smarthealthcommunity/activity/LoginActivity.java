package moh.org.zm.smarthealthcommunity.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import moh.org.zm.smarthealthcommunity.R;
import moh.org.zm.smarthealthcommunity.helpers.AppDatabase;

import static moh.org.zm.smarthealthcommunity.helpers.Constants.USER_FACILITY_CODE;

public class LoginActivity  extends AppCompatActivity {
    private AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button login = findViewById(R.id.btnLogin);
        final EditText username = findViewById(R.id.edUsername);
        final EditText password = findViewById(R.id.edPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("12345")){
                    Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    i.putExtra(USER_FACILITY_CODE, "5040-016");
                    startActivity(i);
                }else{
                    new AlertDialog.Builder(LoginActivity.this)
                            .setTitle("Invalid Login")
                            .setMessage("Wrong username/password combination")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .setNegativeButton(android.R.string.no, null)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }
            }
        });
    }

}