package kr.ac.kmu.ncs.cnc_mc_monitor.detailActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import kr.ac.kmu.ncs.cnc_mc_monitor.R;
import kr.ac.kmu.ncs.cnc_mc_monitor.core.Constants;

/**
 * Created by NCS-KSW on 2017-07-20.
 */
public class DetailActivity extends Activity {

    private short machineID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        Intent intent = getIntent();
        machineID = intent.getShortExtra(Constants.INTENT_KEY_MACHINE_ID, (short) -1);
    }


}
