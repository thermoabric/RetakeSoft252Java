/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userRequests;

/**
 *
 * @author Block
 */
public class userAppointments {
    
    public String appointmentDate;
    public String username;
    public String password;
    public String paitientName;
    public String paitientNumber;
    public String doctorName;
    public String timeOfAppointment;

    public userAppointments(String appointmentDate, String username,String password, String paitientName,String paitientNumber, String doctorName, String timeOfAppointment) {
        this.appointmentDate = appointmentDate;
        this.username = username;
        this.password = password;
        this.paitientName = paitientName;
        this.paitientNumber = paitientNumber;
        this.doctorName = doctorName;
        this.timeOfAppointment = timeOfAppointment;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPaitientName() {
        return paitientName;
    }

    public void setPaitientName(String paitientName) {
        this.paitientName = paitientName;
    }

    public String getPaitientNumber() {
        return paitientNumber;
    }

    public void setPaitientNumber(String paitientNumber) {
        this.paitientNumber = paitientNumber;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getTimeOfAppointment() {
        return timeOfAppointment;
    }

    public void setTimeOfAppointment(String timeOfAppointment) {
        this.timeOfAppointment = timeOfAppointment;
    }
    
}
