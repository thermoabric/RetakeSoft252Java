/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Block
 */
public class loginPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */
    public loginPage() {
        initComponents();    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userIdTxt = new javax.swing.JTextField();
        passwordIdTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Patient system");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");

        userIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIdTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Doctor", "Patient", "Secretary" }));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(165, 165, 165))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passwordIdTxt)
                                .addComponent(userIdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(126, 126, 126)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(passwordIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIdTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String userID;
        String password;
        String clearanceLevel;
        String patientApproved;
        boolean userCheck;
        boolean passwordCheck;
        boolean patientCheck;
        
        
        String user,pass,firstName,lastName,homeNumber,mobile,workNumber,addressLine,city,postcode,dataOfBirth,age,gender;
        
        
        userID = userIdTxt.getText();
        password = passwordIdTxt.getText();
        clearanceLevel = jComboBox1.getSelectedItem().toString();
         
         
        

       
         switch(clearanceLevel) {
            case "Administrator" :
                        try{
                            File file = new File("C:\\uniWork\\clinic\\clinic\\checks\\adminClearanceCheck.txt"); 
                            BufferedReader br = new BufferedReader(new FileReader(file));

                            while ((br.readLine()) != null) {
                                user = br.readLine();
                                pass = br.readLine();
                                if (userID.equals(user)){
                                    userCheck = true;
                                }
                                else {
                                    userCheck = false;
                                }
                                if (pass.equals(password)){
                                    passwordCheck = true;
                                }
                                else{
                                    passwordCheck = false;
                                }
                                if (Boolean.TRUE.equals(userCheck) && Boolean.TRUE.equals(passwordCheck)){
                                    adminLogPage open= new adminLogPage();
                                    open.setVisible(true);
                                this.dispose();
                                }
                            }
                        }
                        catch(Exception e) {
                            e.printStackTrace();
                        }
                        
            case "Doctor" :
                        try{
                            File file = new File("C:\\uniWork\\clinic\\clinic\\checks\\doctorClearanceCheck.txt"); 
                            BufferedReader br = new BufferedReader(new FileReader(file));
                            while ((br.readLine()) != null) {
                                user = br.readLine();
                                pass = br.readLine();

                                if (userID.equals(user)){
                                    userCheck = true;
                                }
                                else {
                                    userCheck = false;
                                }
                                if (pass.equals(password)){
                                    passwordCheck = true;
                                }
                                else{
                                    passwordCheck = false;
                                }
                                if (Boolean.TRUE.equals(userCheck) && Boolean.TRUE.equals(passwordCheck)){
                                   doctorLogPage open= new doctorLogPage();
                                    open.setVisible(true);
                                    this.dispose();
                                }
                            }
                        }
                        catch(Exception e) {
                            e.printStackTrace();
                        }
                        
            case "Patient" :            
                        try{
                            File file = new File("C:\\uniWork\\clinic\\clinic\\checks\\patientClearanceCheck.txt"); 
                            BufferedReader br = new BufferedReader(new FileReader(file));
                            while ((br.readLine()) != null) {
                                user = br.readLine();
                                pass = br.readLine();
                                patientApproved = br.readLine();
                                if (userID.equals(user)){
                                    userCheck = true;
                                }
                                else {
                                    userCheck = false;
                                }
                                
                                if (pass.equals(password)){
                                    passwordCheck = true;
                                }
                                else{
                                    passwordCheck = false;
                                }
                                if (patientApproved.equals(patientApproved)){
                                    patientCheck = true;
                                }
                                else {
                                    patientCheck = false;
                                }
                                if (Boolean.TRUE.equals(userCheck) && Boolean.TRUE.equals(passwordCheck)&& Boolean.TRUE.equals(patientCheck)){
                                patientLogPage open= new patientLogPage();
                                open.setVisible(true);
                                this.dispose();
                                }
                            }
                        }
                        catch(Exception e) {
                            e.printStackTrace();
                        }
             case "Secretary" :            
                        try{
                            File file = new File("C:\\uniWork\\clinic\\clinic\\checks\\patientClearanceCheck.txt"); 
                            BufferedReader br = new BufferedReader(new FileReader(file));
                            while ((br.readLine()) != null) {
                                user = br.readLine();
                                pass = br.readLine();
                               
                                if (userID.equals(user)){
                                    userCheck = true;
                                }
                                else {
                                    userCheck = false;
                                }
                                if (pass.equals(password)){
                                    passwordCheck = true;
                                }
                                else{
                                    passwordCheck = false;
                                }
                                if (Boolean.TRUE.equals(userCheck) && Boolean.TRUE.equals(passwordCheck)){
                                patientLogPage open= new patientLogPage();
                                open.setVisible(true);
                                this.dispose();
                                }
                            }
                        }
                        catch(Exception e) {
                            e.printStackTrace();
                        }       
                    
                    
                    
                    

             }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        registerPage open= new registerPage();
        open.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField passwordIdTxt;
    private javax.swing.JTextField userIdTxt;
    // End of variables declaration//GEN-END:variables
}
