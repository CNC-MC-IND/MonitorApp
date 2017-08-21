package kr.ac.kmu.ncs.cnc_mc_monitor.core;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import kr.ac.kmu.ncs.cnc_mc_monitor.R;

/**
 * Created by kimsiyoung on 2017-08-08.
 */
public class FindPasswdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.findpasswd_activity);

        android.support.v7.app.ActionBar ab =getSupportActionBar();
        ab.setTitle(Constants.ORGINIZATION);
    }
}
