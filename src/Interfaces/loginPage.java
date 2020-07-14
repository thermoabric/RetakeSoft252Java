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
        login = new javax.swing.JButton();
        register = new javax.swing.JButton();

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

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        register.setActionCommand("register");
        register.setLabel("register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
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
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(register)))
                        .addGap(35, 35, 35))))
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
                    .addComponent(login)
                    .addComponent(register))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIdTxtActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
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
                            File file = new File("./checks\\adminclearanceCheck.txt"); 
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
                                    adminLogedInScreen open= new adminLogedInScreen();
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
                            File file = new File("./checks\\doctorClearanceCheck.txt"); 
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
                                   doctorLogedInScreen open= new doctorLogedInScreen();
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
                            File file = new File("./checks\\patientClearanceCheck.txt"); 
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
                                patientLogedInScreen open= new patientLogedInScreen();
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
                            File file = new File("./checks\\secretaryClearanceCheck.txt"); 
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
                                patientLogedInScreen open= new patientLogedInScreen();
                                open.setVisible(true);
                                this.dispose();
                                }
                            }
                        }
                        catch(Exception e) {
                            e.printStackTrace();
                        }       
                    
                    
                    
                    

             }
        
         
        
        
    }//GEN-LAST:event_loginActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed

        registerPage1 open = new registerPage1();
        open.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login;
    private javax.swing.JTextField passwordIdTxt;
    private javax.swing.JButton register;
    private javax.swing.JTextField userIdTxt;
    // End of variables declaration//GEN-END:variables
}
