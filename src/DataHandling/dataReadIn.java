/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataHandling;
import UserObj.user;
import UserObj.secretaryObj;
import UserObj.patientObj;
import UserObj.doctorObj;
import UserObj.AdminObj;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import userRequests.userPrescription;
import userRequests.userAppointments;
import userRequests.medicationStocks;









/**
 *
 * @author Block
 */
public class dataReadIn {
    
    private ArrayList<user> AdminObj;
    private ArrayList<user> doctorObj;
    private ArrayList<user> patientObj;
    private ArrayList<user> secretaryObj;
    
    
    public void addPatientToArray(user a,ArrayList patientObj){
    
        patientObj.add(a);
    
    
    }
    public void removePatientToArray(user a,ArrayList patientObj){
    
        patientObj.remove(a);
    
    
    }
    
  public void readPatientReqest(ArrayList<user> patientObj) throws Exception {
  
    File file = new File("./checks\\patientRequestsAccount.txt");
    
    BufferedReader br = new BufferedReader(new FileReader(file));
        String username;
        String password;
        String firstname;
        String lastname;
        String mobilePhoneNumber;
        String workPhoneNumber;
        String addressline;
        String city;
        String dateOfBirth;
        String age;
        String gender;
        String patientNumber;
        
        
   while ((br.readLine()) != null){
       username = br.readLine();
       password = br.readLine();
       firstname = br.readLine();
       lastname = br.readLine();
       mobilePhoneNumber = br.readLine();
       workPhoneNumber = br.readLine();
       addressline = br.readLine();
       city = br.readLine();
       dateOfBirth = br.readLine();
       age = br.readLine();
       gender = br.readLine();
       patientNumber = br.readLine();
       
       
       user createPatient = new patientObj(username, password,firstname,lastname,mobilePhoneNumber,workPhoneNumber,addressline,city,dateOfBirth,age,gender,patientNumber);
       
       addPatientToArray(createPatient, patientObj);
       
   }
  }
  public void readCurrentPatients(ArrayList<user> patientObj) throws Exception {
  
    File file = new File("./checks\\approvedPatients.txt");
    
    BufferedReader br = new BufferedReader(new FileReader(file));
        String username;
        String password;
        String firstname;
        String lastname;
        String mobilePhoneNumber;
        String workPhoneNumber;
        String addressline;
        String city;
        String dateOfBirth;
        String age;
        String gender;
        String patientNumber;
        
        
   while ((br.readLine()) != null){
       username = br.readLine();
       password = br.readLine();
       firstname = br.readLine();
       lastname = br.readLine();
       mobilePhoneNumber = br.readLine();
       workPhoneNumber = br.readLine();
       addressline = br.readLine();
       city = br.readLine();
       dateOfBirth = br.readLine();
       age = br.readLine();
       gender = br.readLine();
       patientNumber = br.readLine();
       
       
       user createPatient = new patientObj(username, password,firstname,lastname,mobilePhoneNumber,workPhoneNumber,addressline,city,dateOfBirth,age,gender,patientNumber);
       
       addPatientToArray(createPatient, patientObj);
       
   }
  }
  public void readAccountDeletionRequests(ArrayList<user> patientObj) throws Exception {
  
    File file = new File("./checks\\patientAccountRequestTermination.txt");
    
    BufferedReader br = new BufferedReader(new FileReader(file));
        String username;
        String password;
    
        
   while ((br.readLine()) != null){
       username = br.readLine();
       password = br.readLine();
      
       
       user createPatient = new patientObj(username, password);
       
       addPatientToArray(createPatient, patientObj);
       
   }
  }   
  
  public void readCurrentDoctors(ArrayList<user> doctorObj) throws Exception {
  
    File file = new File("./checks\\approvedDoctors.txt");
    
    BufferedReader br = new BufferedReader(new FileReader(file));
        String username;
        String password;
        String firstname;
        String lastname;
        String mobilePhoneNumber;
        String addressline;
        String age;
        String gender;
        String ratings;
        String comments;
        String adminFeedback;
        
        
        
   while ((br.readLine()) != null){
       username = br.readLine();
       password = br.readLine();
       firstname = br.readLine();
       lastname = br.readLine();
       mobilePhoneNumber = br.readLine();
       addressline = br.readLine();
       age = br.readLine();
       gender = br.readLine();
       ratings = br.readLine();
       comments = br.readLine();
       adminFeedback = br.readLine();
 
       
       
      user createDoctor = new doctorObj(username, password,firstname,lastname,mobilePhoneNumber,addressline,age,gender,ratings,comments,adminFeedback);
       
      addDoctorToArray(createDoctor, doctorObj);
       
   }
  }
  public void removeDoctor(user a, ArrayList doctor) {
        
        doctor.remove(a);
    } 
  public void addDoctorToArray(user a, ArrayList doctor){
        doctor.add(a);
    }  
  
  public void readCurrentSecretarys(ArrayList<user> secretaryObj) throws Exception {
  
    File file = new File("./checks\\approvedSecretarys.txt");
    
    BufferedReader br = new BufferedReader(new FileReader(file));
        String username;
        String password;
        String firstname;
        String lastname;
        
        
        
        
   while ((br.readLine()) != null){
       username = br.readLine();
       password = br.readLine();
       firstname = br.readLine();
       lastname = br.readLine();
       
 
       
       
      user createSecretary = new secretaryObj(username, password,firstname,lastname);
       
      addSecretaryToArray(createSecretary, secretaryObj);
       
       
   }
  }

   public void removeSecretary(user a, ArrayList secretary){
        secretary.remove(a);
    }   
       
   public void addSecretaryToArray(user a, ArrayList secretary){
        secretary.add(a);
    }
   public void addPrescription(userRequests.userPrescription a, ArrayList perscriptions)
        {
            
            perscriptions.add(a);
           
        }
    public void removePrescription(userRequests.userPrescription a, ArrayList perscriptions)
    {
       
        perscriptions.remove(a);
    }
   public void readCurrentPresciptions(ArrayList<userPrescription> prescriptions) throws Exception {
  
    File file = new File("./checks\\prescriptions.txt");
    
    BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String username,password,firstname,lastname,addressline,gender,
        age,patientnumber,doctorfirstname,doctorlastname,doctoraddressline,notes,meds,quantity,dosage;    
        
        while ((br.readLine()) != null) {
             username = br.readLine();
             password = br.readLine();
             firstname = br.readLine();
             lastname = br.readLine();
             addressline = br.readLine();
             gender = br.readLine();
             age = br.readLine();
             patientnumber = br.readLine();
             doctorfirstname = br.readLine();
             doctorlastname = br.readLine();
             doctoraddressline = br.readLine();
             notes = br.readLine();
             meds = br.readLine();
             quantity = br.readLine();
             dosage = br.readLine();
            
            userRequests.userPrescription a = new userPrescription(username, password, firstname, lastname, addressline, gender,age,patientnumber,doctorfirstname,doctorlastname,doctoraddressline,notes,meds,quantity,dosage);
            
            addPrescription(a, prescriptions);
        }
       
       
   }
   public void addAppointment(userRequests.userAppointments a, ArrayList appointments)
        {
            
            appointments.add(a);
           
        }
   public void removeAppointments(userRequests.userAppointments a, ArrayList appointments)
    {
       
        appointments.remove(a);
    }
   public void readCurrentAppointments(ArrayList<userAppointments> appointments) throws Exception {
  
    File file = new File("./checks\\appointments.txt");
    
    BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String date, username,firstname,patientnumber,doctornumber,time;    
        
        while ((br.readLine()) != null) {
             date = br.readLine();
             username = br.readLine();
             firstname = br.readLine();
             patientnumber = br.readLine();
             doctornumber = br.readLine();
             time = br.readLine();
             
            
            userRequests.userAppointments a = new userAppointments(date,username, firstname,patientnumber,doctornumber,time);
            addAppointment(a, appointments);
        }
     
   
  }
public void readRequestedAppointments(ArrayList<userAppointments> appointments) throws Exception {
  
    File file = new File("./checks\\patientAppointmentRequest.txt");
    
    BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String date, username,firstname,patientnumber,doctornumber,time;    
        
        while ((br.readLine()) != null) {
             date = br.readLine();
             username = br.readLine();
             firstname = br.readLine();
             patientnumber = br.readLine();
             doctornumber = br.readLine();
             time = br.readLine();
             
            
            userRequests.userAppointments a = new userAppointments(date,username, firstname,patientnumber,doctornumber,time);
            addAppointment(a, appointments);
        }







}
   
   
   public void readCurrentMeds(ArrayList<medicationStocks> meds) throws Exception {
  
    File file = new File("./checks\\medicines.txt");
    
    BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        String med, quatity;  
        
        while ((br.readLine()) != null) {
             med = br.readLine();
             quatity = br.readLine();
            
             
            
            userRequests.medicationStocks a = new medicationStocks(med,quatity);
            addMedication(a, meds);
        }
   }
public void addMedication(userRequests.medicationStocks a, ArrayList medicationStocks)
        {
            
            medicationStocks.add(a);
           
        }

 public void removeMedication(userRequests.medicationStocks a, ArrayList medicationStocks)
    {
       
        medicationStocks.remove(a);
    }
  }
   
  
