/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Interfaces.loginPage;
import Interfaces.registerPage1;
import javax.swing.JOptionPane;


/**
 *
 * @author Block
 */
public class Clinic {
    
    
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new loginPage().setVisible(true);
        
        
        
        // TODO code application logic here
    }
    
}
