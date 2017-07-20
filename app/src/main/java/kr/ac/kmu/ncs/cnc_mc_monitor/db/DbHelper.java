package kr.ac.kmu.ncs.cnc_mc_monitor.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import kr.ac.kmu.ncs.cnc_mc_monitor.core.Constants;

/**
 * Created by NCS-KSW on 2017-07-20.
 */
public class DbHelper extends SQLiteOpenHelper {

    private static final String machineTable = "machines";
    private static final String DB_NAME = "CNC_MC.db";
    private static final int DB_VERSION = 2;

    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        creatTable(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public void creatTable(SQLiteDatabase db) {
        String query = "CREATE TABLE " + machineTable + " (" +
                Constants.DB_ID + " TEXT PRIMARY KEY, " +
                Constants.DB_LUBRICANT_MACHINE + " TEXT, " +
                Constants.DB_LUBRICANT_SAW  + " TEXT, " +
                Constants.DB_PRESSURE_AIR_MAIN + " TEXT, " +
                Constants.DB_PRESSURE_OIL_HYDRAULIC + " TEXT, " +
                Constants.DB_SERVO_CUT + " TEXT, " +
                Constants.DB_SERVO_TRANSFER + " TEXT, " +
                Constants.DB_SPINDLE + " TEXT, " +
                Constants.DB_SAFETY_DOOR + " TEXT, " +
                Constants.DB_DEPLETION + " TEXT, " +
                Constants.DB_WORKLOAD + " TEXT" +
                ");";
        db.execSQL(query);
    }

    public boolean insertMachine(String id,
                                 String lubricant_machine, String lubricant_saw,
                                 String pressure_air_main, String pressure_oil_hydraulic,
                                 String servo_cut, String servo_transfer,
                                 String spindle, String safety_door,
                                 String depletion, String workload) {
        SQLiteDatabase db = getWritableDatabase();

        try {
            db.execSQL("INSERT INTO " + machineTable + " VALUES(" +
                    "'" + id + "', " +
                    "'" + lubricant_machine + "', " +
                    "'" + lubricant_saw + "', " +
                    "'" + pressure_air_main + "', " +
                    "'" + pressure_oil_hydraulic + "', " +
                    "'" + servo_cut + "', " +
                    "'" + servo_transfer + "', " +
                    "'" + spindle + "', " +
                    "'" + safety_door + "', " +
                    "'" + depletion + "', " +
                    "'" + workload + "'" +
                    ");");
        } catch (SQLiteConstraintException ex) {
            db.close();
            return false;
        }

        db.close();
        return true;
    }

    public boolean deleteMachine(String id) {
        SQLiteDatabase db = getWritableDatabase();
        try {
            db.execSQL("DELETE FROM " + machineTable + " WHERE id='" + id + "';");
        } catch (SQLiteConstraintException ex) {
            db.close();
            return false;
        }
        db.close();
        return true;
    }

    public boolean IsExist(String id) {
        SQLiteDatabase db = getWritableDatabase();

        Cursor cursor = db.rawQuery("SELECT COUNT(*) FROM " + machineTable + " WHERE id='" + id + "';", null);
        return cursor.getCount() > 0;
    }

    public Cursor getMachineCursor() {
        SQLiteDatabase db = getWritableDatabase();
        return db.rawQuery("SELECT * FROM " + machineTable, null);
    }
}
