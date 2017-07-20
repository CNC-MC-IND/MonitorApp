package kr.ac.kmu.ncs.cnc_mc_monitor.core;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import kr.ac.kmu.ncs.cnc_mc_monitor.R;
import kr.ac.kmu.ncs.cnc_mc_monitor.listPanel.ListActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtAddress;
    private Button btnConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        this.edtAddress = (EditText)findViewById(R.id.edt_address);
        this.btnConnect = (Button)findViewById(R.id.btn_connect);

        this.btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // HTTP Connecxion


                // Start a service that periodically updates the database


                // Print ListView Activity
                startActivity(new Intent(getBaseContext(), ListActivity.class));
            }
        });
    }
}