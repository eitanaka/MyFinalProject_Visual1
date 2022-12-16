/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.workoutmenugeneratorapp;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author eitanaka
 */
public class WorkoutMenu {
    private ArrayList<WorkoutMenuItem> chest;
    private ArrayList<WorkoutMenuItem> back;
    private ArrayList<WorkoutMenuItem> shoulder;
    private ArrayList<WorkoutMenuItem> lower;
    private ArrayList<WorkoutMenuItem> biceps;
    private ArrayList<WorkoutMenuItem> triceps;
    private ArrayList<WorkoutMenuItem> abs;
    private ArrayList<WorkoutMenuItem> cardio;

    public WorkoutMenu () {        
    }      
    
    public static WorkoutMenu getJSonMenu(String file) throws FileNotFoundException, IOException {
        Gson gson = new Gson();

        BufferedReader buffIn = new BufferedReader(new FileReader(file));
        String gymMenu = "";
        String nextLine = "";
        while ((nextLine = buffIn.readLine()) != null) {
            gymMenu = gymMenu + nextLine;
        }

        WorkoutMenu gymWorkoutMenu = gson.fromJson(gymMenu, WorkoutMenu.class);                                                      

        return gymWorkoutMenu;
    }    

    public ArrayList<WorkoutMenuItem> generateTotalMenu(String userGoal, String userGender){                    

        // Variable for arrayList returned
        ArrayList<WorkoutMenuItem> tmpMenu = new ArrayList<>();           
        
        // Generate Chest Menu
        tmpMenu.add(createMenuForTotalBody(chest, userGoal, userGender));
        tmpMenu.add(createMenuForTotalBody(back, userGoal, userGender));
        tmpMenu.add(createMenuForTotalBody(shoulder, userGoal, userGender));
        tmpMenu.add(createMenuForTotalBody(lower, userGoal, userGender));
        tmpMenu.add(createMenuForTotalBody(abs, userGoal, userGender));   
        
        return tmpMenu;
    }
    
    public WorkoutMenuItem createMenuForTotalBody(ArrayList<WorkoutMenuItem> bodyPart, String userGoal, String userGender) {
        int randNum;
        Random rand = new Random();

        WorkoutMenuItem tmp = new WorkoutMenuItem();

        boolean isGood = false;

        while (!(isGood)) {
            randNum = rand.nextInt(bodyPart.size());
            tmp = bodyPart.get(randNum);

            if (tmp.getGoal().contains(userGoal)) {
                if (tmp.getGender().contains(userGender)) {                        
                    isGood = true;                    
                }
            }
        }
        return tmp;
    }
    
    public ArrayList<WorkoutMenuItem> generateUpperMenu(String userGoal, String userGender) {
        ArrayList<WorkoutMenuItem> tmpMenu = new ArrayList<>();
                                     
       tmpMenu.add(createMenuForUpper(chest, userGoal, userGender));                     
       tmpMenu.add(createMenuForUpper(back, userGoal, userGender));       
       tmpMenu.add(createMenuForUpper(shoulder, userGoal, userGender));       
       tmpMenu.add(createMenuForUpper(biceps, userGoal, userGender));      
       tmpMenu.add(createMenuForUpper(triceps, userGoal, userGender));
                     
        return tmpMenu;
    }
    
    public WorkoutMenuItem createMenuForUpper(ArrayList<WorkoutMenuItem> bodyPart, String userGoal, String userGender) {                
        int randNum;
        Random rand = new Random(); 
        
        WorkoutMenuItem tmp = new WorkoutMenuItem();
        
        while (true) {
            randNum = rand.nextInt(bodyPart.size());       
            tmp = bodyPart.get(randNum);
            
            if (tmp.getGoal().contains(userGoal) && tmp.getGender().contains(userGender)) {
                break;
            }
        }        
                               
        return tmp;
    }
    
    public ArrayList<WorkoutMenuItem> generateLowerMenu(String userGoal, String userGender) {
       ArrayList<WorkoutMenuItem> tmpMenu;                      
       tmpMenu = createMenuForOnePartOfBody(lower, userGoal, userGender);
       return tmpMenu;
    }
    
    public ArrayList<WorkoutMenuItem> generatePushMenu(String userGoal, String userGender) {
       ArrayList<WorkoutMenuItem> tmpMenu = new ArrayList<>();
       
       // Push Menu                                          
       ArrayList<WorkoutMenuItem> chestMenu = createMenuForPushMenu(chest, userGoal, userGender);
       ArrayList<WorkoutMenuItem> shoulderMenu = createMenuForPushMenu(shoulder, userGoal, userGender);
       ArrayList<WorkoutMenuItem> tricepsMenu = createMenuForArm(triceps, userGoal, userGender);
       
       for (int i = 0; i < chestMenu.size(); i++) {
           tmpMenu.add(chestMenu.get(i));
           tmpMenu.add(shoulderMenu.get(i));
           tmpMenu.add(tricepsMenu.get(i));
       }

       return tmpMenu;
    }
    
    // method for chest and shoulder menu for push
    public ArrayList<WorkoutMenuItem> createMenuForPushMenu(ArrayList<WorkoutMenuItem> bodyPart, String userGoal, String userGender) {
        ArrayList<WorkoutMenuItem> tmpMenu = new ArrayList<>();
        
        int randNum;
        Random rand = new Random();
        
        WorkoutMenuItem tmp;
        
        boolean highIntensity = false;
        boolean middleIntensity = false;
        boolean lowIntensity = false;
        
        while (true) {
            randNum = rand.nextInt(bodyPart.size());           
            tmp = bodyPart.get(randNum);
            
            if (tmp.getGoal().contains(userGoal) && tmp.getGender().contains(userGender)) {
                switch (tmp.getIntensity()) {
                    case 3 -> {
                        if (!highIntensity) {
                            highIntensity = true;
                            tmpMenu.add(tmp);
                        }
                    }
                    case 2 -> {
                        if (!middleIntensity) {
                            middleIntensity = true;
                            tmpMenu.add(tmp);
                        }
                    }
                    default -> {
                        if (!lowIntensity) {
                            lowIntensity = true;
                            tmpMenu.add(tmp);
                        }
                    }
                }
            }
            if (highIntensity && middleIntensity && lowIntensity) {
                break;
            }                   
        }        
        return tmpMenu;
    }
    
    public ArrayList<WorkoutMenuItem> generatePullMenu(String userGoal, String userGender) {
       ArrayList<WorkoutMenuItem> tmpMenu = new ArrayList<>();
       
       // Pull menu
       // High intensity back menu * 1
       // Middle intensity back menu * 3
       // Low intensity back menu * 2
       ArrayList<WorkoutMenuItem> backMenus = createMenuForOnePartOfBody(back, userGoal, userGender);
       // Biceps menu * 2
       ArrayList<WorkoutMenuItem> bicepsMenus = createMenuForArm(biceps, userGoal, userGender);
       
       for (int i = 0; i < backMenus.size(); i ++) {
           tmpMenu.add(backMenus.get(i));
           if (bicepsMenus.size() - 1 >= i) {
               tmpMenu.add(bicepsMenus.get(i));
           }
       } 

       return tmpMenu;
    }
    
    public ArrayList<WorkoutMenuItem> generateChestMenu(String userGoal, String userGender) {
       ArrayList<WorkoutMenuItem> tmpMenu;              
       tmpMenu = createMenuForOnePartOfBody(chest, userGoal, userGender);
       return tmpMenu;
    }
    
    public ArrayList<WorkoutMenuItem> generateBackMenu(String userGoal, String userGender) {
       ArrayList<WorkoutMenuItem> tmpMenu;              
       tmpMenu = createMenuForOnePartOfBody(back, userGoal, userGender);
       return tmpMenu;
    }
    
    public ArrayList<WorkoutMenuItem> generateShoulderMenu(String userGoal, String userGender) {
       ArrayList<WorkoutMenuItem> tmpMenu;              
       tmpMenu = createMenuForOnePartOfBody(shoulder, userGoal, userGender);
       return tmpMenu;
    }
    
    // methods for generating Chest, Back, and Shoulder Menu
    public ArrayList<WorkoutMenuItem> createMenuForOnePartOfBody(ArrayList<WorkoutMenuItem> bodyPart, String userGoal, String userGender) {
        ArrayList<WorkoutMenuItem> tmpMenus = new ArrayList<>();
        
        int randNum;
        Random rand = new Random();
        
        int midIntCounter = 0;
        int lowIntCounter = 0;
        
        WorkoutMenuItem tmp;
        
        boolean highIntensity = false;
        boolean middleIntensity = false;
        boolean lowIntensity = false;                  
        
        while (true) {
            
            randNum = rand.nextInt(bodyPart.size());
            tmp = bodyPart.get(randNum);                        
            
            if (tmp.getGoal().contains(userGoal) && tmp.getGender().contains(userGender)) {                                                                        
                switch (tmp.getIntensity()) {
                    // Pick High Intensity Menu randomly
                    case 3 -> {
                        if (!highIntensity) {
                            highIntensity = true;
                            tmpMenus.add(tmp);                              
                        }
                    }
                    // Pick Mid Intensity Menu randomly
                    case 2 -> {
                        if (!middleIntensity) {                                                           
                            if (!tmpMenus.contains(tmp)) {
                                tmpMenus.add(tmp);
                                midIntCounter++;                                    
                            }                                                                                            
                            if (midIntCounter >= 3) {
                                middleIntensity = true;
                                
                            }
                        }
                    }
                    // Pick Low Intensity Menu randomly
                    default -> {
                        if (!lowIntensity) {                            
                            if (!tmpMenus.contains(tmp))  {
                                tmpMenus.add(tmp);
                                lowIntCounter++;                                
                            }                                                                                          
                            if (lowIntCounter >= 2) {
                                lowIntensity = true;
                                System.out.println("hello");
                            }
                        }
                    }
                }
            }
            if (highIntensity && middleIntensity && lowIntensity) {
                break;
            }  
        }                           
        return tmpMenus;
    }
    
    public ArrayList<WorkoutMenuItem> generateArmMenu(String userGoal, String userGender) {
       ArrayList<WorkoutMenuItem> tmpMenu = new ArrayList<>();
                    
       ArrayList<WorkoutMenuItem> tricepsMenus = createMenuForArm(triceps, userGoal, userGender);                              
       ArrayList<WorkoutMenuItem> bicepsMenus = createMenuForArm(biceps, userGoal, userGender);
       for (int i = 0; i < bicepsMenus.size(); i++) {
           tmpMenu.add(bicepsMenus.get(i));
           tmpMenu.add(tricepsMenus.get(i));
       }       
       
       return tmpMenu;
    }
    
    // methods for generating Biceps and Triceps Menu
    public ArrayList<WorkoutMenuItem> createMenuForArm(ArrayList<WorkoutMenuItem> bodyPart, String userGoal, String userGender) {
        ArrayList<WorkoutMenuItem> tmpMenu = new ArrayList<>();
        
        int randNum;
        Random rand = new Random();
        
        int menuCounter = 0;
        
        while (true) {
            randNum = rand.nextInt(bodyPart.size());
            WorkoutMenuItem tmp = bodyPart.get(randNum);
            
            if (tmp.getGoal().contains(userGoal) && tmp.getGender().contains(userGender)) {
                if (!tmpMenu.contains(tmp)) {
                    tmpMenu.add(tmp);
                    menuCounter++;
                }
            }
            
            if (menuCounter >= 3) {
                break;
            }
        }                       
        return tmpMenu;
    }
    
    public ArrayList<WorkoutMenuItem> generateAbsMenu(String userGoal, String userGender) {
       ArrayList<WorkoutMenuItem> tmpMenu = new ArrayList<>();
       
       // Abs Menu
       // Abs Menu * 6
       int randNum;
       Random rand = new Random();
       
       int menuCounter = 0;
       
       while (true) {
           randNum = rand.nextInt((abs.size()));
           WorkoutMenuItem tmp = abs.get(randNum);
           
           if (tmp.getGoal().contains(userGoal) && tmp.getGender().contains(userGender)) {
               if (!tmpMenu.contains(tmp)) {
                   tmpMenu.add((tmp));
                   menuCounter++;
               }
           }
           if (menuCounter >= 6) {
               break;
           }
       }
       
       return tmpMenu;
    }
    
    public ArrayList<WorkoutMenuItem> generateCardioMenu(String userGoal, String userGender) {
       ArrayList<WorkoutMenuItem> tmpMenu = new ArrayList<>();
              
       int randNum;
       Random rand = new Random();
       
       WorkoutMenuItem tmp;
       
       int menuCounter = 0;
       
       while (true) {
           randNum = rand.nextInt(cardio.size());
           tmp= cardio.get(randNum);                      
           
           if (tmp.getGoal().contains(userGoal) && tmp.getGender().contains(userGender)) {
               tmpMenu.add(tmp);
               menuCounter++;
           }
           if (menuCounter >= 2) {               
               break;
           }
       }
       
       return tmpMenu;
    }
}

