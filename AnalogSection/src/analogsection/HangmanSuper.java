/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

/**
 *
 * @author Stephen kearns
 */

import java.util.*;
public class HangmanSuper {
    //variables 
    private String[] Sentance;
    private String anwser, userAns;
    private Random rand;
    private int randIndex;
    private String randSentance;
    private boolean RightorWrong;
    
    
    
    
    public HangmanSuper(){
        Sentance = new String[]{"This is a superclass which is _____ by subclasses","A subclass ____ a superclass","To call an ____ of the class instanceate the object in the app class","the first, most hated java program is hello____","Is java open source___" };
        anwser = "";
        userAns = "";
        rand =  new Random();
        randSentance = "";
        randIndex = 0;
        RightorWrong = false;
    }
     //chose a random question and then assign the anwser on the specfic index of the array 
    
    public String ChoseRandSentance(){
        randIndex = rand.nextInt(Sentance.length);
        randSentance = Sentance[randIndex];
        
        return randSentance;
    }
    
    public void AsignAnwsers(){
        if(randIndex == 0){
            anwser = "inheritance";
        }
         else if(randIndex == 1){
             anwser = "extends";
           }
          else if(randIndex == 2){
              anwser = "instance";
             }
           else if(randIndex == 3){
              anwser = "world";
            }
           else{
              anwser = "yes";  
            }
    }
    public boolean compute(){
         if(userAns.equalsIgnoreCase(anwser)){
             RightorWrong = true;
          }
         
         return   RightorWrong;
    }

    public void setUserAns(String userAns) {
        this.userAns = userAns;
    }
    
    
    
}
