/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.workoutmenugeneratorapp;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author eitanaka
 */
public class WorkoutMenuItem {    
    private String name;
    private String desc;
    private String link;
    private String reps;
    private String[] goal;
    private String[] gender;
    private int intensity;

    public WorkoutMenuItem() {

    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getLink() {
        return this.link;
    }

    public String getReps() {
        return this.reps;
    }
    
    public ArrayList<String> getGoal() {
        ArrayList<String> goalList = new ArrayList<>(Arrays.asList(this.goal));
        return goalList;
    }
    
    public ArrayList<String> getGender() {
        ArrayList<String> genderList = new ArrayList<>(Arrays.asList(this.gender));
        return genderList;
    }
    
    public int getIntensity() {
        return this.intensity;
    }
}
