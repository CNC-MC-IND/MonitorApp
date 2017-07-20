package kr.ac.kmu.ncs.cnc_mc_monitor.core;

/**
 * Created by NCS-KSW on 2017-07-20.
 */
public class Constants {

    /**
     * For listPanel.ListActivity
     */
    public static final String INTENT_KEY_MACHINE_ID = "machinID";

    /**
     * Protocol
     {
     "id": 17834,
     "lubricant_machine": 1,
     "lubricant_saw": 1,
     "pressure_air_main": 1,
     "pressure_oil_hydraulic": 1,
     "servo_cut": 0,
     "servo_transfer": 1,
     "spindle": 1,
     "safety_door": 0,
     "depletion": 1,
     "workload": 41
     }
     */

    /**
     * For db.DbHelper
     */
    public static final String DB_ID = "id";
    public static final String DB_LUBRICANT_MACHINE = "lubricant_machine";
    public static final String DB_LUBRICANT_SAW = "lubricant_saw";
    public static final String DB_PRESSURE_AIR_MAIN = "pressure_air_main";
    public static final String DB_PRESSURE_OIL_HYDRAULIC = "pressure_oil_hydraulic";
    public static final String DB_SERVO_CUT = "servo_cut";
    public static final String DB_SERVO_TRANSFER = "servo_transfer";
    public static final String DB_SPINDLE = "spindle";
    public static final String DB_SAFETY_DOOR = "safety_door";
    public static final String DB_DEPLETION = "depletion";
    public static final String DB_WORKLOAD = "workload";


}
