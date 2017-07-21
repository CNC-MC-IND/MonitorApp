package kr.ac.kmu.ncs.cnc_mc_monitor.db;

import java.sql.Date;

/**
 * Created by NCS-KSW on 2017-07-20.
 */
public class MachineDataSet {
    private short id;
    private byte lubricant_machine;
    private byte lubricant_saw;
    private byte pressure_air_main;
    private byte pressure_oil_hydraulic;
    private byte servo_cut;
    private byte servo_transfer;
    private byte spindle;
    private byte safety_door;
    private byte depletion;
    private short workload;
    private Date timestamp;

    private MachineDataSet(){}

    public MachineDataSet(short id, byte lubricant_machine, byte lubricant_saw, byte pressure_air_main, byte pressure_oil_hydraulic, byte servo_cut, byte servo_transfer, byte spindle, byte safety_door, byte depletion, short workload, Date timestamp) {
        this.id = id;
        this.lubricant_machine = lubricant_machine;
        this.lubricant_saw = lubricant_saw;
        this.pressure_air_main = pressure_air_main;
        this.pressure_oil_hydraulic = pressure_oil_hydraulic;
        this.servo_cut = servo_cut;
        this.servo_transfer = servo_transfer;
        this.spindle = spindle;
        this.safety_door = safety_door;
        this.depletion = depletion;
        this.workload = workload;
        this.timestamp = timestamp;
    }

    public void update(short id, byte lubricant_machine, byte lubricant_saw, byte pressure_air_main, byte pressure_oil_hydraulic, byte servo_cut, byte servo_transfer, byte spindle, byte safety_door, byte depletion, short workload, Date timestamp) {
        this.id = id;
        this.lubricant_machine = lubricant_machine;
        this.lubricant_saw = lubricant_saw;
        this.pressure_air_main = pressure_air_main;
        this.pressure_oil_hydraulic = pressure_oil_hydraulic;
        this.servo_cut = servo_cut;
        this.servo_transfer = servo_transfer;
        this.spindle = spindle;
        this.safety_door = safety_door;
        this.depletion = depletion;
        this.workload = workload;
        this.timestamp = timestamp;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public byte getLubricant_machine() {
        return lubricant_machine;
    }

    public void setLubricant_machine(byte lubricant_machine) {
        this.lubricant_machine = lubricant_machine;
    }

    public byte getLubricant_saw() {
        return lubricant_saw;
    }

    public void setLubricant_saw(byte lubricant_saw) {
        this.lubricant_saw = lubricant_saw;
    }

    public byte getPressure_air_main() {
        return pressure_air_main;
    }

    public void setPressure_air_main(byte pressure_air_main) {
        this.pressure_air_main = pressure_air_main;
    }

    public byte getPressure_oil_hydraulic() {
        return pressure_oil_hydraulic;
    }

    public void setPressure_oil_hydraulic(byte pressure_oil_hydraulic) {
        this.pressure_oil_hydraulic = pressure_oil_hydraulic;
    }

    public byte getServo_cut() {
        return servo_cut;
    }

    public void setServo_cut(byte servo_cut) {
        this.servo_cut = servo_cut;
    }

    public byte getServo_transfer() {
        return servo_transfer;
    }

    public void setServo_transfer(byte servo_transfer) {
        this.servo_transfer = servo_transfer;
    }

    public byte getSpindle() {
        return spindle;
    }

    public void setSpindle(byte spindle) {
        this.spindle = spindle;
    }

    public byte getSafety_door() {
        return safety_door;
    }

    public void setSafety_door(byte safety_door) {
        this.safety_door = safety_door;
    }

    public byte getDepletion() {
        return depletion;
    }

    public void setDepletion(byte depletion) {
        this.depletion = depletion;
    }

    public short getWorkload() {
        return workload;
    }

    public void setWorkload(short workload) {
        this.workload = workload;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
