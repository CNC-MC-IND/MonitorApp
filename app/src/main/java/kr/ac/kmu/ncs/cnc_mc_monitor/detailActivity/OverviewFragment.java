package kr.ac.kmu.ncs.cnc_mc_monitor.detailActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import kr.ac.kmu.ncs.cnc_mc_monitor.R;
import kr.ac.kmu.ncs.cnc_mc_monitor.db.DbHelper;

/**
 * Created by NCS-KSW on 2017-07-20.
 */
public class OverviewFragment extends Fragment {
    /**
     * Singleton Pattern
     */
    private static OverviewFragment instance;

    private OverviewFragment(){}

    public static OverviewFragment getInstance(){
        if(instance == null)
            instance = new OverviewFragment();
        return instance;
    }

    /**
     * Fragment routine
     */
    private DbHelper helper;

    private View view;
    private TextView tvSample;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        helper = new DbHelper(getContext());

        view = inflater.inflate(R.layout.overview_fragment, container, false);
        tvSample = (TextView)view.findViewById(R.id.tv_sample);

        return view;
    }
}
