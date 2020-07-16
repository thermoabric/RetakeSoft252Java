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
  
    File file = new File("./checks\\patientRequests.txt");
    
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
        
        
        
   while ((br.readLine()) != null){
       username = br.readLine();
       password = br.readLine();
       firstname = br.readLine();
       lastname = br.readLine();
       mobilePhoneNumber = br.readLine();
       addressline = br.readLine();
       age = br.readLine();
       gender = br.readLine();
 
       
       
      // user createDoctor = new doctorObj(username, password,firstname,lastname,mobilePhoneNumber,addressline,age,gender);
       
      // addPatientToArray(createDoctor, patientObj);
       
   }
  }
  public void removeDoctor(user a, ArrayList doctor)
    {
        
        doctor.remove(a);
    }   
  public void readCurrentSecretarys(ArrayList<user> secretaryObj) throws Exception {
  
    File file = new File("./checks\\approvedSecretary.txt");
    
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
 
       
       
      // user createDoctor = new doctorObj(username, password,firstname,lastname,mobilePhoneNumber,addressline,age,gender);
       
      // addPatientToArray(createDoctor, patientObj);
       
   }
  }
  

    public void removeSecretary(user a, ArrayList secretary)
    {

        secretary.remove(a);
    }   
       
   } 
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
    
     
   
       
  







