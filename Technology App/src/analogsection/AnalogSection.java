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
import java.util.Set;
import javax.swing.*;
public class AnalogSection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String anwser, question, userAns, sentance; 
       int correct, incorrect,choice;
       boolean chckRightorWrong;
       
        //ApplicationMainScreen appGUI = new ApplicationMainScreen(); 
        Quiz playQuiz = new Quiz();
        HangmanSuper playHangman = new HangmanSuper();
        
        //make the GUI visible
       // appGUI.setVisible(true);
        
        /*
            * The code which is commented out is what is actually happing behind the buttons 
            
            * I have just left the code to show how i implemented the code behind the buttons
            
            * It also shows how to go from one GUI to another by an Action performed on the button
        
        
        
        
        
        */
        
        /*
        choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1... To take the Quiz" + "  "+" or 2.. to paly a game of hangman"));
                
        if(choice == 1){      
        
      // question = playQuiz.setRandomQuestion();
       for(int counter = 0; counter < 10; counter++){
        
           //playQuiz.dontChoseExistQuestion();
           question = playQuiz.choseRandomQuestion();
           
           anwser = JOptionPane.showInputDialog(null,"The Question is:" + " "+ question + "Please enter your anwser");
           playQuiz.setAnwser(anwser);
           
           playQuiz.compute();
       }
        
       correct = playQuiz.getCorrect();
       incorrect = playQuiz.getIncorrect();
       
       JOptionPane.showMessageDialog(null,"The number of correct anwsers is:" + " "+correct + " " + "The number of incorrect question is:" + " "+ incorrect);
             
        }
        else if(choice == 2){
            
            sentance = playHangman.ChoseRandSentance();
            
            JOptionPane.showMessageDialog(null, sentance);
            
            for(int counter = 0; counter < 5; counter++){
                  userAns = JOptionPane.showInputDialog(null,"enter your gusee of the blank word");
                  playHangman.setUserAns(userAns);
                  
                  playHangman.AsignAnwsers();
                  
                 chckRightorWrong =  playHangman.compute();
                  
                  if(chckRightorWrong == true){
                      JOptionPane.showMessageDialog(null,"Congradulations you have gussed the word right");
                       break;
                     
                   }
                    else if(chckRightorWrong == false){
                         //this is where each time the user gusses the word wrong
                        // a frame of the animation will be called in 
                       // to simulate the the hanging of the man 
                        
                        //error checker 
                        System.out.println("incorrect gusse");
                    }
                
                }
            
     
        }
             ------end of comment   */
       
    }
    
}

