/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.io.Serializable;

/**
 *
 * @author Hassan
 */
public class UserScoreObj implements Serializable {
    //declare variables
    public int incorrect;
    public int correct;
    public String name;
    //public int computerScore;
    //initilising variables
    public UserScoreObj(){
        incorrect = 0;
        correct = 0;
        // computerScore = 0;
        name = new String();
    }
    //sets users name
    public void setName(String name){
        this.name = name;
    }
    //sets incorrect user input
    public void setIncorrect(int incorrect){
        this.incorrect = incorrect;
    }
    //sets correct user input
    public void setcorrect(int correct){
        this.correct = correct;
    }
    //public void setcomputerScore(int ComputerScore){
    //this.computerScore = computerScore;
    //}
    //returns name
    public String getName(){
        return name;
    }
    //returns incorrect user answer
    public int getIncorrect(){
        return incorrect;
    }
    //returns correct user answer
    public int getCorrect(){
        return correct;
    }
    //public int getComputerScore(){
    //return computerScore;
    //}
}
