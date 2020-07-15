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
import 








/**
 *
 * @author Block
 */
public class dataReadIn {
    
    private ArrayList<user> AdminObj;
    private ArrayList<user> doctorObj;
    private ArrayList<user> patientObj;
    private ArrayList<user> secretaryObj;
    
    
    
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
        String approved; 
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
       approved = br.readLine();
       
     
   
   }
  
  
  }
    
     
   
       
}  







