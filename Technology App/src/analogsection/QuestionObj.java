/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

/**
 *
 * @author Hassan
 */
public class QuestionObj {
    //declare variables
    public String questionobj;
    public String Answerobj;
    public String incorrectans1;
    public String incorrectans2;
    public String radbutton;
    
    public QuestionObj(){
        //initilize variables
        questionobj = new String();
        Answerobj = new String();
        incorrectans1 = new String();
        incorrectans2 = new String();
        radbutton = new String();
    }
    //returns incorrect answer 1
    public String getincorrect1(){
        return incorrectans1;
    }
    //gets incorrect answer 1
    public void setincorrect1(String incorrectans1){
        this.incorrectans1 = incorrectans1;
    }
    //returns incorrect answer 2
    public String getincorrect2(){
        return incorrectans2;
    }
    //gets incorrect answer 2
    public void setincorrect2(String incorrectans2){
        this.incorrectans2 = incorrectans2;
    }
    //returns question
    public String getquestion(){
        return questionobj;
    }
    //returns correct answer
    public String getanswer(){
        return Answerobj;
    }
    //sets question
    public void setquestion(String questionobj){
        this.questionobj = questionobj;
    }
    //sets answer 
    public void setanswer(String Answerobj){
         this.Answerobj = Answerobj;
    }
    //sets radio button
    public void setrad(String radbutton){
        this.radbutton = radbutton;
    }
    //returns radio button
    public String getrad(){
        return radbutton;
    }
    
}
