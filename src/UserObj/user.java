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
public class user {
    
    public String userID,password,firstName,lastName;
    
    public String getUserID() {
        return userID;
    }
    public String getPassword() {
        return password;
    }
    
    public String getfirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    
     public void setUserID(String userID) {
        this.userID = userID; 
    }


    public void setPassword(String password) {
        
        this.password = password;
    }
    
     public void setFirstName(String firstName) {
        
        this.firstName = firstName;
    }
     
    public void setLastName(String lastName) {
        
        this.lastName = lastName;
    }
    
    
    
}
