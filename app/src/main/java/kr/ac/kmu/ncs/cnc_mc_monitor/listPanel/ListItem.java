package kr.ac.kmu.ncs.cnc_mc_monitor.listPanel;

import android.graphics.Bitmap;

/**
 * Created by NCS-KSW on 2017-07-20.
 */
public class ListItem {
    private short machineID;
    private Bitmap thumnail;

    private ListItem(){}

    public ListItem(short machineID, Bitmap thumnail){
        this.machineID = machineID;
        this.thumnail = thumnail;
    }

    public void update(short machineID, Bitmap thumnail){
        this.machineID = machineID;
        this.thumnail = thumnail;
    }

    public short getMachineID() {
        return machineID;
    }

    public void setMachineID(short machineID) {
        this.machineID = machineID;
    }

    public Bitmap getThumnail() {
        return thumnail;
    }

    public void setThumnail(Bitmap thumnail) {
        this.thumnail = thumnail;
    }
}
