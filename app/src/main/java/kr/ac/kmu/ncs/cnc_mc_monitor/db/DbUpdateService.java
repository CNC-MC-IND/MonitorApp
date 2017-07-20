package kr.ac.kmu.ncs.cnc_mc_monitor.db;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by NCS-KSW on 2017-07-20.
 */
public class DbUpdateService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
