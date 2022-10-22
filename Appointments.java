/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jigne
 */
public class Appointments {
    int id;
    int patientID;
    String patientName;
    String patientEmail;
    String appointmentDoctor;
    String reason;
    String date;
    String time;

    public Appointments(int id, int patientID, String patientName, String patientEmail, String appointmentDoctor, String reason, String date, String time) {
        this.id = id;
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientEmail = patientEmail;
        this.appointmentDoctor = appointmentDoctor;
        this.reason = reason;
        this.date = date;
        this.time = time;
    }
    
}
