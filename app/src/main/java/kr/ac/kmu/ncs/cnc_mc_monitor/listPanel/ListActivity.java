package kr.ac.kmu.ncs.cnc_mc_monitor.listPanel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kmu.ncs.cnc_mc_monitor.R;
import kr.ac.kmu.ncs.cnc_mc_monitor.core.Constants;
import kr.ac.kmu.ncs.cnc_mc_monitor.detailActivity.DetailActivity;

/**
 * Created by NCS-KSW on 2017-07-20.
 */
public class ListActivity  extends Activity{

    private List<ListItem> mListItems;

    private ListView lvMachine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        init();
    }

    private void init(){
        this.mListItems = new ArrayList<>();
        this.lvMachine = (ListView)findViewById(R.id.lv_machine);
        this.lvMachine.setAdapter(new ListAdapter());
        this.lvMachine.setOnItemClickListener(new ListViewItemClicked());
    }

    /**
     * Set adapter to make dynamical ListView
     */
    class ListAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return mListItems.size();
        }

        @Override
        public Object getItem(int position) {
            return mListItems.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        /**
         * Call back method by ListView
         * @param position : Item index on the ListView
         * @param view : ListView item
         * @param parent
         * @return
         */
        @Override
        public View getView(int position, View view, ViewGroup parent) {
            ListItem inflatedItem = mListItems.get(position);

            try{
                if(inflatedItem == null)
                    throw new NullPointerException();

                if(view == null){
                    LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
                    view = inflater.inflate(R.layout.list_item, parent, false);
                }

                // init elements
                ImageView imgThumnail = (ImageView)view.findViewById(R.id.img_thumnail);
                TextView tvTitle = (TextView)view.findViewById(R.id.tv_title);
                ProgressBar pbarWorkload = (ProgressBar)view.findViewById(R.id.pbar_workload);
                TextView tvWorkload = (TextView)view.findViewById(R.id.tv_workload);

                // set to elements
                imgThumnail.setImageBitmap(inflatedItem.getThumnail());
                tvTitle.setText("#" + inflatedItem.getMachineID());
                /***
                 * Still in the dark
                 * ***/

            } catch (NullPointerException e){
                return null;
            }

            return view;
        }
    }

    class ListViewItemClicked implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            ListItem selectedItem = mListItems.get(position);

            Intent intent = new Intent(getBaseContext(), DetailActivity.class);
            intent.putExtra(Constants.INTENT_KEY_MACHINE_ID, selectedItem.getMachineID());

            startActivity(intent);
        }
    }
}
