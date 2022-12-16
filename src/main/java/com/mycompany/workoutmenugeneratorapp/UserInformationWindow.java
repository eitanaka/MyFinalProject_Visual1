/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.workoutmenugeneratorapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author eitanaka
 */
public class UserInformationWindow extends javax.swing.JFrame {
   private LogInWindow logInWin;
   private WeeklyMenuWindow weeklyMenuWin;    
   private DailyMenuWindow dailyMenuWin;
   private ArrayList<ArrayList<WorkoutMenuItem>> weeklyMenu;  
    /**
     * Creates new form UserInformationWindow
     */
    public UserInformationWindow() {
        initComponents();                 
    }        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLable = new javax.swing.JLabel();
        userInfoLabel = new javax.swing.JLabel();
        bodyInfoLabel = new javax.swing.JLabel();
        goalLabel = new javax.swing.JLabel();
        frequencyLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        heightField = new javax.swing.JTextField();
        weightField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        maleBox = new javax.swing.JCheckBox();
        femaleBox = new javax.swing.JCheckBox();
        fatLossBox = new javax.swing.JCheckBox();
        muscleBox = new javax.swing.JCheckBox();
        healthyBox = new javax.swing.JCheckBox();
        dayLabel = new javax.swing.JLabel();
        sundayBox = new javax.swing.JCheckBox();
        mondayBox = new javax.swing.JCheckBox();
        tuesdayBox = new javax.swing.JCheckBox();
        wednesdayBox = new javax.swing.JCheckBox();
        thursdayBox = new javax.swing.JCheckBox();
        fridayBox = new javax.swing.JCheckBox();
        saturdayBox = new javax.swing.JCheckBox();
        generateMenuBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        equipmentLabel = new javax.swing.JLabel();
        gymBox = new javax.swing.JCheckBox();
        homeBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Information");

        titleLable.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        titleLable.setText("Workout Generator");

        userInfoLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        userInfoLabel.setText("User Information:");

        bodyInfoLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        bodyInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bodyInfoLabel.setText("Body Information:");

        goalLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        goalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goalLabel.setText("Your Goal:");

        frequencyLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        frequencyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frequencyLabel.setText("Frequency:");

        heightLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        heightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heightLabel.setText("Height:");

        weightLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        weightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weightLabel.setText("Weight:");

        heightField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        heightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightFieldActionPerformed(evt);
            }
        });

        weightField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        ageLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        ageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ageLabel.setText("Age:");

        ageField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        ageField.setToolTipText("");

        genderLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        genderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genderLabel.setText("Gender:");

        maleBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        maleBox.setText("Male");
        maleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleBoxActionPerformed(evt);
            }
        });

        femaleBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        femaleBox.setText("Female");
        femaleBox.setToolTipText("");
        femaleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleBoxActionPerformed(evt);
            }
        });

        fatLossBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        fatLossBox.setText("Fat Loss");
        fatLossBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatLossBoxActionPerformed(evt);
            }
        });

        muscleBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        muscleBox.setText("Building Muscle");
        muscleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muscleBoxActionPerformed(evt);
            }
        });

        healthyBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        healthyBox.setText("Keeping Healthy");
        healthyBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthyBoxActionPerformed(evt);
            }
        });

        dayLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        dayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayLabel.setText("What day can you workout?");

        sundayBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        sundayBox.setText("Sunday");
        sundayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sundayBoxActionPerformed(evt);
            }
        });

        mondayBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        mondayBox.setText("Monday");
        mondayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mondayBoxActionPerformed(evt);
            }
        });

        tuesdayBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tuesdayBox.setText("Tuesday");
        tuesdayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesdayBoxActionPerformed(evt);
            }
        });

        wednesdayBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        wednesdayBox.setText("Wednesday");
        wednesdayBox.setToolTipText("");
        wednesdayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wednesdayBoxActionPerformed(evt);
            }
        });

        thursdayBox.setText("Thursday");
        thursdayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thursdayBoxActionPerformed(evt);
            }
        });

        fridayBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        fridayBox.setText("Friday");
        fridayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fridayBoxActionPerformed(evt);
            }
        });

        saturdayBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        saturdayBox.setText("Saturday");
        saturdayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturdayBoxActionPerformed(evt);
            }
        });

        generateMenuBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        generateMenuBtn.setText("Generate Menu");
        generateMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateMenuBtnActionPerformed(evt);
            }
        });

        logOutBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        logOutBtn.setText("Log Out");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        equipmentLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        equipmentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipmentLabel.setText("Equipment:");

        gymBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        gymBox.setText("Gym");
        gymBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gymBoxActionPerformed(evt);
            }
        });

        homeBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        homeBox.setText("Home");
        homeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(titleLable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userInfoLabel)
                .addGap(436, 436, 436))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOutBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generateMenuBtn)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(equipmentLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(bodyInfoLabel)
                                        .addGap(265, 265, 265))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(heightLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(weightLabel)
                                                    .addComponent(ageLabel)
                                                    .addComponent(genderLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(weightField)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(maleBox)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(femaleBox)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addComponent(ageField))))
                                        .addGap(204, 204, 204)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fatLossBox)
                                    .addComponent(goalLabel)
                                    .addComponent(muscleBox)
                                    .addComponent(healthyBox)))
                            .addComponent(gymBox)
                            .addComponent(homeBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(frequencyLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dayLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sundayBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mondayBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tuesdayBox))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(wednesdayBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(thursdayBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fridayBox))
                                .addComponent(saturdayBox)))
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLable)
                .addGap(18, 18, 18)
                .addComponent(userInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodyInfoLabel)
                    .addComponent(goalLabel)
                    .addComponent(frequencyLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightLabel)
                    .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatLossBox)
                    .addComponent(dayLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightLabel)
                    .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muscleBox)
                    .addComponent(sundayBox)
                    .addComponent(mondayBox)
                    .addComponent(tuesdayBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthyBox)
                    .addComponent(wednesdayBox)
                    .addComponent(thursdayBox)
                    .addComponent(fridayBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maleBox)
                        .addComponent(femaleBox)
                        .addComponent(saturdayBox)))
                .addGap(46, 46, 46)
                .addComponent(equipmentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gymBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateMenuBtn)
                    .addComponent(logOutBtn))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fatLossBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatLossBoxActionPerformed
        muscleBox.setSelected(false);
        healthyBox.setSelected(false);
    }//GEN-LAST:event_fatLossBoxActionPerformed

    private void sundayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sundayBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sundayBoxActionPerformed

    private void generateMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateMenuBtnActionPerformed
        // Conter counts frequency of workout that defines which menu this app suggests.
        int counter = 0;     
        String userGoal;
        String userGender;
        
        // ArrayList weekly menu contains each daily menu and ArrayList sunday ~ saturday contains daily menu        
        ArrayList<ArrayList<WorkoutMenuItem>> tmpMenuList = new ArrayList<>(); 
        weeklyMenu = new ArrayList<>();
        boolean[] selectedDate = new boolean[7];
        
        ArrayList<WorkoutMenuItem> restList = new ArrayList<>();                        
                     
        // This variable contains all workout menu
        WorkoutMenu workoutMenu = new WorkoutMenu();
        
        // This variable contains information of which file should app load.
        String file;
        
        // Step1. Check if all field is filled corectly
        boolean isGood = false;
        
        while (!(isGood)) {
            if ((maleBox.isSelected() || femaleBox.isSelected()) &&
            (homeBox.isSelected() || gymBox.isSelected()) &&
            (muscleBox.isSelected() || healthyBox.isSelected() || fatLossBox.isSelected()) &&
            (sundayBox.isSelected() || mondayBox.isSelected() || tuesdayBox.isSelected() || wednesdayBox.isSelected() || thursdayBox.isSelected() || fridayBox.isSelected() || saturdayBox.isSelected()) &&
            (!(heightField.getText().isEmpty()) && !(weightField.getText().isEmpty()) && !(ageField.getText().isEmpty())))
            {                                
                isGood = true;
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);                                               
                break;
            }                
        }
        
        if (!(isGood)) {
            return;
        }       
        
        if (muscleBox.isSelected()) {
            userGoal = "muscle";
        } else if (healthyBox.isSelected()) {
            userGoal = "healthy";
        } else {
            userGoal = "fat";
        }
        
        if (maleBox.isSelected()) {
            userGender = "male";
        } else {
            userGender = "female";
        }
        
        // Step2. Identify frequecy of user and add arraylist into weeklyMenu arrayList
        if (sundayBox.isSelected()) {   
            selectedDate[0] = true;
            counter++;
        } else {
            selectedDate[0] = false;
        }
        if (mondayBox.isSelected()) {  
            selectedDate[1] = true;
            counter++;
        } else {
            selectedDate[1] = false;
        }
        if (tuesdayBox.isSelected()) {  
            selectedDate[2] = true;
            counter++;
        } else {
            selectedDate[2] = false;
        }
        if (wednesdayBox.isSelected()) {  
            selectedDate[3] = true;
            counter++;
        } else {
            selectedDate[3] = false;
        }
        if (thursdayBox.isSelected()) {     
            selectedDate[4] = true;
            counter++;
        } else {
            selectedDate[4] = false;
        }
        if (fridayBox.isSelected()) {  
            selectedDate[5] = true;
            counter++;
        } else {
            selectedDate[5] = false;
        }
        if (saturdayBox.isSelected()) {  
            selectedDate[6] = true;
            counter++;
        } else {
            selectedDate[6] = false;
        }
                       
        // Step3 Create Gson Object for menu                                
        try {
            if (gymBox.isSelected()) {
                file = "/Users/eitanaka/NetBeansProjects/WorkoutMenuGeneratorApp/src/main/java/com/mycompany/workoutmenugeneratorapp/gymMenu.json";                               
            } else {
                file = "/Users/eitanaka/NetBeansProjects/WorkoutMenuGeneratorApp/src/main/java/com/mycompany/workoutmenugeneratorapp/homeMenu.json";                                
            }
            workoutMenu = WorkoutMenu.getJSonMenu(file);
                                              
        } catch (IOException ex) {
            Logger.getLogger(UserInformationWindow.class.getName()).log(Level.SEVERE, null, ex);
        }               
        
        // Step4 Assign a randomly generated menu to the corresponding ArrayList according to the day of the week and frequency selected by the user.
        switch (counter) {
            case 1 -> tmpMenuList.add(workoutMenu.generateTotalMenu(userGoal, userGender));
            case 2 -> {
                tmpMenuList.add(workoutMenu.generateUpperMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateLowerMenu(userGoal, userGender));
            }
            case 3 -> {
                tmpMenuList.add(workoutMenu.generatePushMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateLowerMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generatePullMenu(userGoal, userGender));
            }
            case 4 -> {
                tmpMenuList.add(workoutMenu.generateChestMenu(userGoal, userGender));                               
                tmpMenuList.add(workoutMenu.generateBackMenu(userGoal, userGender));                                
                tmpMenuList.add(workoutMenu.generateLowerMenu(userGoal, userGender));                                
                tmpMenuList.add(workoutMenu.generateShoulderMenu(userGoal, userGender));                
            }
            case 5 -> {
                tmpMenuList.add(workoutMenu.generateChestMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateBackMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateLowerMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateShoulderMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateArmMenu(userGoal, userGender));
            }
            case 6 -> {
                tmpMenuList.add(workoutMenu.generateChestMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateBackMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateLowerMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateShoulderMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateArmMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateAbsMenu(userGoal, userGender));
            }
            default -> {
                tmpMenuList.add(workoutMenu.generateChestMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateBackMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateLowerMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateCardioMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateShoulderMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateArmMenu(userGoal, userGender));
                tmpMenuList.add(workoutMenu.generateAbsMenu(userGoal, userGender));
            }            
        }
            
        //Step 5: Insert ArrayList<WorkoutMenuItem> into corresponding place
        int menuCounter = 0;                
        for (int i = 0; i < 7; i++) {
            if (selectedDate[i]) {
                weeklyMenu.add(tmpMenuList.get(menuCounter));
                menuCounter++;
            } else {
                weeklyMenu.add(restList);
            }           
        }
        
        // Step 6: Share weeklyMenu arrayList to the other windows
        // Fin.        
        this.weeklyMenuWin.setWeeklyMenu(weeklyMenu);
        this.dailyMenuWin.setWeeklyMenu(weeklyMenu);
        this.setVisible(false);
        this.weeklyMenuWin.setVisible(true);        
        
        // Test
        for (int i = 0; i < 7; i++) {
            System.out.print(i + ": ");
            if (weeklyMenu.get(i) != null) {
                for (int j = 0; j < 9; j++) {
                    if (weeklyMenu.get(i).size() - 1 >= j) {
                        System.out.print(weeklyMenu.get(i).get(j).getName() + ", ");                    
                    }                    
                }                                            
            } else {
                System.out.print("Null");                
            }            
            System.out.println("");
        }
        
    }//GEN-LAST:event_generateMenuBtnActionPerformed

    private void gymBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gymBoxActionPerformed
        homeBox.setSelected(false);        
    }//GEN-LAST:event_gymBoxActionPerformed

    private void homeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBoxActionPerformed
        gymBox.setSelected(false);        
    }//GEN-LAST:event_homeBoxActionPerformed

    private void maleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleBoxActionPerformed
        femaleBox.setSelected(false);
    }//GEN-LAST:event_maleBoxActionPerformed

    private void femaleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleBoxActionPerformed
        maleBox.setSelected(false);
    }//GEN-LAST:event_femaleBoxActionPerformed

    private void muscleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muscleBoxActionPerformed
        healthyBox.setSelected(false);
        fatLossBox.setSelected(false);
    }//GEN-LAST:event_muscleBoxActionPerformed

    private void healthyBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthyBoxActionPerformed
        muscleBox.setSelected(false);
        fatLossBox.setSelected(false);
    }//GEN-LAST:event_healthyBoxActionPerformed

    private void mondayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondayBoxActionPerformed

    }//GEN-LAST:event_mondayBoxActionPerformed

    private void tuesdayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuesdayBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuesdayBoxActionPerformed

    private void wednesdayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wednesdayBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wednesdayBoxActionPerformed

    private void thursdayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thursdayBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thursdayBoxActionPerformed

    private void fridayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridayBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fridayBoxActionPerformed

    private void saturdayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturdayBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saturdayBoxActionPerformed

    private void heightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightFieldActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        this.setVisible(false);
        logInWin.setVisible(true);
    }//GEN-LAST:event_logOutBtnActionPerformed

    public ArrayList<ArrayList<WorkoutMenuItem>> getWeeklyMenuList() {
        return this.weeklyMenu;
    }
            
    // Connect Each Window
    public void setLogInWindow(LogInWindow myCreater) {
        logInWin = myCreater;        
    }      
    public void setWeeklyMenuWindow(WeeklyMenuWindow weeklyMenuWin){
        this.weeklyMenuWin = weeklyMenuWin;
    }        
    public void setDailyMenuWindow(DailyMenuWindow dailyMenuWin) {
        this.dailyMenuWin = dailyMenuWin;
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel bodyInfoLabel;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JLabel equipmentLabel;
    private javax.swing.JCheckBox fatLossBox;
    private javax.swing.JCheckBox femaleBox;
    private javax.swing.JLabel frequencyLabel;
    private javax.swing.JCheckBox fridayBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton generateMenuBtn;
    private javax.swing.JLabel goalLabel;
    private javax.swing.JCheckBox gymBox;
    private javax.swing.JCheckBox healthyBox;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JCheckBox homeBox;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JCheckBox maleBox;
    private javax.swing.JCheckBox mondayBox;
    private javax.swing.JCheckBox muscleBox;
    private javax.swing.JCheckBox saturdayBox;
    private javax.swing.JCheckBox sundayBox;
    private javax.swing.JCheckBox thursdayBox;
    private javax.swing.JLabel titleLable;
    private javax.swing.JCheckBox tuesdayBox;
    private javax.swing.JLabel userInfoLabel;
    private javax.swing.JCheckBox wednesdayBox;
    private javax.swing.JTextField weightField;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables

}
