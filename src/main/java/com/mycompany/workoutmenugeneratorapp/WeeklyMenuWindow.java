/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.workoutmenugeneratorapp;

import java.util.ArrayList;

/**
 *
 * @author eitanaka
 */
public class WeeklyMenuWindow extends javax.swing.JFrame {
    private LogInWindow logInWin;
    private UserInformationWindow userInfoWin;            
    private DailyMenuWindow dailyMenuWin;  
    private ArrayList<ArrayList<WorkoutMenuItem>> weeklyMenu;    
//    
//    public static class MyListModel extends javax.swing.AbstractListModel<String> {
//        ArrayList<WorkoutMenuItem> menus = new ArrayList();
//
//        @Override
//        public int getSize() {
//            return menus.size();
//        }
//        @Override
//        public String getElementAt(int index) {
//            return menus.get(index).getName();
//        }
//        public void addElement(WorkoutMenuItem menu) {
//            menus.add(menu);
//            fireContentsChanged(this, menus.size()-1, menus.size()-1);
//        }
//        public String getShortInfo(int i) {
//            return menus.get(i).getDesc();
//        }                     
//    }    
    /**
     * Creates new form WeeklyMenuWindwo
     */
    public WeeklyMenuWindow() {
        initComponents(); 
//        sundayList.setModel(sundayModel);
//        mondayList.setModel(mondayModel);
//        tuesdayList.setModel(tuesdayModel);
//        wednesdayList.setModel(wednesdayModel);
//        thursdayList.setModel(thursdayModel);
//        fridayList.setModel(fridayModel);
//        saturdayList.setModel(saturdayModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        weeklyLabel = new javax.swing.JLabel();
        sundayLabel = new javax.swing.JLabel();
        mondayLabel = new javax.swing.JLabel();
        tuesdayLabel = new javax.swing.JLabel();
        wednesdayLabel = new javax.swing.JLabel();
        thursdayLabel = new javax.swing.JLabel();
        fridayLabel = new javax.swing.JLabel();
        saturdayLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sundayList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tuesdayList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        mondayList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        wednesdayList = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        thursdayList = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        fridayList = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        saturdayList = new javax.swing.JList<>();
        detailBtn = new javax.swing.JButton();
        dailyMenuBtn1 = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weekly Menu");

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        titleLabel.setText("Workout Generator");

        weeklyLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        weeklyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weeklyLabel.setText("Weekly Menu");
        weeklyLabel.setToolTipText("");

        sundayLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        sundayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sundayLabel.setText("Sunday:");

        mondayLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        mondayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mondayLabel.setText("Monday:");

        tuesdayLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        tuesdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tuesdayLabel.setText("Tuesday:");

        wednesdayLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        wednesdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wednesdayLabel.setText("Wednesday:");

        thursdayLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        thursdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thursdayLabel.setText("Thursday:");

        fridayLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        fridayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fridayLabel.setText("Friday:");

        saturdayLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        saturdayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saturdayLabel.setText("Saturday:");

        sundayList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        sundayList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Bench Press", "Lat Pull Down", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        sundayList.setPreferredSize(new java.awt.Dimension(100, 160));
        sundayList.setSize(new java.awt.Dimension(48, 160));
        jScrollPane1.setViewportView(sundayList);

        tuesdayList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tuesdayList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(tuesdayList);

        mondayList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        mondayList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(mondayList);

        wednesdayList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        wednesdayList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(wednesdayList);

        thursdayList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        thursdayList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(thursdayList);

        fridayList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        fridayList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(fridayList);

        saturdayList.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        saturdayList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(saturdayList);

        detailBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        detailBtn.setText("Menu Detail");
        detailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailBtnActionPerformed(evt);
            }
        });

        dailyMenuBtn1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        dailyMenuBtn1.setText("Daily Menu");
        dailyMenuBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyMenuBtn1ActionPerformed(evt);
            }
        });

        logOutBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        logOutBtn.setText("Log out");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(sundayLabel)
                .addGap(100, 100, 100)
                .addComponent(mondayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tuesdayLabel)
                .addGap(61, 61, 61)
                .addComponent(wednesdayLabel)
                .addGap(61, 61, 61)
                .addComponent(thursdayLabel)
                .addGap(87, 87, 87)
                .addComponent(fridayLabel)
                .addGap(81, 81, 81)
                .addComponent(saturdayLabel)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(352, 352, 352))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(weeklyLabel)
                        .addGap(437, 437, 437))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(detailBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logOutBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dailyMenuBtn1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(weeklyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sundayLabel)
                    .addComponent(mondayLabel)
                    .addComponent(tuesdayLabel)
                    .addComponent(wednesdayLabel)
                    .addComponent(thursdayLabel)
                    .addComponent(fridayLabel)
                    .addComponent(saturdayLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane7))
                .addGap(18, 18, 18)
                .addComponent(detailBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dailyMenuBtn1)
                    .addComponent(logOutBtn))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dailyMenuBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyMenuBtn1ActionPerformed
        dailyMenuWin.displayMenu();
        this.setVisible(false);
        dailyMenuWin.setVisible(true);
    }//GEN-LAST:event_dailyMenuBtn1ActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        this.setVisible(false);
        logInWin.setVisible(true);
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void detailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailBtnActionPerformed
        // TODO add your handling code here:
        System.out.println(weeklyMenu.get(0).get(0).getName());
    }//GEN-LAST:event_detailBtnActionPerformed

    // Connect Each Window
    public void setUserInfoWindow(UserInformationWindow userInfoWin) {
        this.userInfoWin = userInfoWin;
    }             
    public void setLogInWindow(LogInWindow logInWin) {
        this.logInWin = logInWin;
    }        
    public void setDailyMenuWindow(DailyMenuWindow dailyWin) {
        this.dailyMenuWin = dailyWin;
    }
    
    public void setWeeklyMenu(ArrayList<ArrayList<WorkoutMenuItem>> weeklyMenu){
        this.weeklyMenu = weeklyMenu;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dailyMenuBtn1;
    private javax.swing.JButton detailBtn;
    private javax.swing.JLabel fridayLabel;
    private javax.swing.JList<String> fridayList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JLabel mondayLabel;
    private javax.swing.JList<String> mondayList;
    private javax.swing.JLabel saturdayLabel;
    private javax.swing.JList<String> saturdayList;
    private javax.swing.JLabel sundayLabel;
    private javax.swing.JList<String> sundayList;
    private javax.swing.JLabel thursdayLabel;
    private javax.swing.JList<String> thursdayList;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel tuesdayLabel;
    private javax.swing.JList<String> tuesdayList;
    private javax.swing.JLabel wednesdayLabel;
    private javax.swing.JList<String> wednesdayList;
    private javax.swing.JLabel weeklyLabel;
    // End of variables declaration//GEN-END:variables
}
