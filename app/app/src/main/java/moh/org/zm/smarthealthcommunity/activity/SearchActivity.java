package moh.org.zm.smarthealthcommunity.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import moh.org.zm.smarthealthcommunity.R;
import moh.org.zm.smarthealthcommunity.adapters.SearchAdapter;
import moh.org.zm.smarthealthcommunity.models.Patient;

public class SearchActivity  extends AppCompatActivity  implements SearchAdapter.ItemClickListener{
    SearchAdapter adapter;
    ArrayList<Patient> clientResults = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Button btnSearch = findViewById(R.id.search);
        final EditText searchQuery = findViewById(R.id.edSearchQuery);

        clientResults.add(new Patient("1","12121","John","Doe","M","",""));
        clientResults.add(new Patient("2","1122","John","Sinkala","M","",""));
        clientResults.add(new Patient("3","121212","John","Zulu","M","",""));
        clientResults.add(new Patient("4","212121","John","Phiri","M","",""));

        RecyclerView recyclerView = findViewById(R.id.rvSearchResults);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new SearchAdapter(this, clientResults);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = searchQuery.getText().toString();
                // TODO:: added call to api to look up client


            }
        });
    }

    @Override
    public void onItemClick(View view, int position) {
        new AlertDialog.Builder(SearchActivity.this)
                .setTitle("Information")
                .setMessage("Clicked a dude!"+clientResults.get(position).getFirstName())
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton(android.R.string.no, null)
                .show();
    }
}