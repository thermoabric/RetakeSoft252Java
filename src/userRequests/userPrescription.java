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
public class userPrescription {
    
     public String userID,password,firstname,lastname,addressLine,
        age,gender,patientNumber,doctorfirstname,doctorlastname,doctoraddressline,notes,meds,quantity,dosage;
    
    
    
    public userPrescription(String userID,String password,String firstname, String lastname, String addressLine, String gender,
            String age, String patientNumber,String doctorfirstname,String doctorlastname, 
            String doctoraddressline,String notes,String meds, String quantity, String dosage){
        this.userID = userID;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.addressLine = addressLine;
        this.gender = gender;
        this.age = age;
        this.patientNumber = patientNumber;
        this.doctorfirstname = doctorfirstname;
        this.doctorlastname = doctorlastname;
        this.doctoraddressline = doctoraddressline;
        this.notes = notes;
        this.meds = meds;
        this.quantity = quantity;
        this.dosage = dosage;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getDoctorfirstname() {
        return doctorfirstname;
    }

    public void setDoctorfirstname(String doctorfirstname) {
        this.doctorfirstname = doctorfirstname;
    }

    public String getDoctorlastname() {
        return doctorlastname;
    }

    public void setDoctorlastname(String doctorlastname) {
        this.doctorlastname = doctorlastname;
    }

    public String getDoctoraddressline() {
        return doctoraddressline;
    }

    public void setDoctoraddressline(String doctoraddressline) {
        this.doctoraddressline = doctoraddressline;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMeds() {
        return meds;
    }

    public void setMeds(String meds) {
        this.meds = meds;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    


}
