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
public class medicationStocks {
    public String medicationname;
    public String quanity;
    

    public medicationStocks(String medicationname ,String quanity) {
        this.medicationname = medicationname;
        this.quanity = quanity;
        
    }

    public String getMedicationname() {
        return medicationname;
    }

    public void setMedicationname(String medicationname) {
        this.medicationname = medicationname;
    }

    public String getQuanity() {
        return quanity;
    }

    public void setQuanity(String quanity) {
        this.quanity = quanity;
    }
}
