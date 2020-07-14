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
public abstract class AdminObj extends user {
    
    public String clearance;
    public int ID;
   

    
   
    
    public String getClearance() {
        return clearance;
    }
    public int getID() {
        return ID;
    }

   
    
    
   
    public void setClearance(String clearance) {
        
        this.clearance = clearance;
    }
    public void setID(int ID) {
        
        this.ID = ID;
    }

     
   
    
    
}
