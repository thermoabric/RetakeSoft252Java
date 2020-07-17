
package UserObj;
public class patientObj extends user{
    
    public String userID,password,firstname,lastname,mobilePhoneNumber,workPhoneNumber,addressLine,
        city,dateOfBirth,age,gender,patientNumber;

    public patientObj(String userID,String password,String firstname, String lastname,String mobilePhoneNumber, String workPhoneNumber, String addressLine, String city, String dateOfBirth, String age, String gender, String patientNumber) {
        this.userID = userID;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
  
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.workPhoneNumber = workPhoneNumber;
        this.addressLine = addressLine;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.gender = gender;
        this.patientNumber = patientNumber;
    }
    public patientObj(String userID,String password){
    
     this.userID = userID;
     this.password = password;
    
    
    
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userId) {
        this.userID = userId;
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

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
    
 
    
   
    
   
   

     
   
    
    
}

