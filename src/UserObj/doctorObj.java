/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserObj;

/**
 *
 * @author Block
 */
public class doctorObj extends user{
    
    String userId,password,firstname,lastname,mobileNumber,addressline,age,gender;
   

    public doctorObj(String userId,String password,String firstname,String lastname,String mobileNumber ,String addressline,String age,String gender) {
        this.userId = userId;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobileNumber = mobileNumber;
        this.addressline = addressline;
        this.age = age;
        this.gender = gender;
    }

   
  

    public String getAddressline() {
        return addressline;
    }

    public void setAddressline(String addressline) {
        this.addressline = addressline;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobilenumber) {
        this.mobileNumber = mobilenumber;
    }
   

    
 
    
   

     
   
    
    
}

