/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

/**
 *
 * @author Hassan Al-Amidi, Stephen kearns, Patrick Kelly, Sean Maguire
 */
import javax.swing.*;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;


public class Quiz {
    
    public String [] randomizedQuestion;
    protected String answer,correctAnswer;
    private String [] userAnswer;
    protected int correct, incorrect,randQuestion,temp1;
    protected int chosenquestions[];
    protected Random rand;
     public QuestionObj obj;
     public ArrayList <QuestionObj> objArr;
     public static ArrayList <QuestionObj> statObjArr;
    
    public Quiz(){
        //question should be filled with 20 questions to maxmise the scope corvered and also to not repeat the same questions
        obj = new QuestionObj();
        objArr = new ArrayList<>();
        statObjArr = new ArrayList<>();
        userAnswer = new String[10];
        // this should be also filled with 20 anwsers
       // also more correct anwser should be addedd to maxinmise the number of coorect anwser's
        correct = 0;
        correctAnswer = new String();
        incorrect = 0;
        rand = new Random();
        chosenquestions = new int[10];
        randomizedQuestion = new String[10];
        answer = "";
    }
    
    public void setAnswer(String[] userAnswer) {
        //sets userAnswer to check if they were correct or incorrect
        this.userAnswer = userAnswer;
        
    }
    
    // checks through all of the anwsers 
    // to see if the user choice entered
    // is corrected 
    public void checkAnwsers()
    {
        //loop checks all 10 questions
        for(int counter = 0; counter < 10; counter++)
        {
            //stores user answer in answer
            answer = userAnswer[counter];
            //stores the correct answer in temp2
            correctAnswer = statObjArr.get(counter).getrad();
            //this is a test JOptionPane.showMessageDialog(null,"test temp 2 = " + temp2+ " temp =" + answer + " userans = " + userAnswer[counter] + "chosenquestion =" + chosenquestions[counter]);
            //if answer is equal to correctAnswer then the value of correct will be increased by one if they are not equal then the value in incorrect will increase by one
            if(answer.equalsIgnoreCase(correctAnswer))
            {
                correct++;
            }
            else if(!answer.equalsIgnoreCase(correctAnswer))
            {
                incorrect++;
            }
            //else display error
            else
            {
                //error checking( this error cheking is not needed because if something goes wrong like no value entered into one of the values the program crashes)
                JOptionPane.showMessageDialog(null,"something went wrong with corrections");
            }
        }
        //clear bot objArr and static objArr
        objArr.clear();
        statObjArr.clear();
    }
    //returns the amount of times the user inputted the correct answer
     public int getcorrect(){
        return correct;
     }
     //returns the amount of times the user inputted the incorrect answer
     public int getIncorrect(){
        return incorrect;
     
     }
     //sets object array
     public void setobj(ArrayList <QuestionObj> objArr){
         Quiz.statObjArr = objArr;  
     }
    
}
  