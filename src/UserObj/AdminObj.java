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
public abstract class AdminObj {
    
    public String userID,password,firstName,lastName,clearance;
    public int ID;
   

    
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
    
    public String getClearance() {
        return clearance;
    }
    public int getID() {
        return ID;
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
    public void setClearance(String clearance) {
        
        this.clearance = clearance;
    }
    public void setID(int ID) {
        
        this.ID = ID;
    }

     
   
    
    
}
