package at.ac.univie.a1209967.millionsongdataset.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import at.ac.univie.a1209967.millionsongdataset.R;

public class UsermenuActivity extends AppCompatActivity {

    Button backBtn;
    Button settingsBtn;
    Button persBtn;
    Button impBtn;
    Button moreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usermenu);

        settingsBtn = (Button) findViewById(R.id.settingsBtn);
        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "to be implemented ...", Toast.LENGTH_LONG).show();
            }
        });

        persBtn = (Button) findViewById(R.id.persBtn);
        persBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "to be implemented ...", Toast.LENGTH_LONG).show();
            }
        });

        impBtn = (Button) findViewById(R.id.impBtn);
        impBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "to be implemented ...", Toast.LENGTH_LONG).show();
            }
        });

        moreBtn = (Button) findViewById(R.id.moreBtn);
        moreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "to be implemented ...", Toast.LENGTH_LONG).show();
            }
        });

        backBtn = (Button) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
