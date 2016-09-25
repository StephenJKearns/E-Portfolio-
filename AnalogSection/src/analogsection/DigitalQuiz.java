/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Hassan
 */
public class DigitalQuiz extends Quiz {
        //declare variables
        protected String[][] QandA;
        private int[] binarysort;
        private int arrcount;
        private Integer a;
        public int page;
        QuizScreen quizgui = new QuizScreen();
        public DigitalQuiz(){
          //initilize variables
         arrcount = 0;
         page = 1;
         a = null;
         binarysort = new int[10];
         //this is a 2d array to set up questions correctanswers and two incorrect answers
        
         //to input your own answer put them in the first array row/container
         //the correct answer must be put in the second row/container and must be in the same index as the question in referes to (in its own row.container)
         //the next two rows or containers are your chosen incorrect answers these work the same as the previous rows/containers
         //the last row/container is what radio button you want your correct answer to be in this must be either a,b or c other wise you will get an error
         //all containers must contain 20 values
        QandA = new String[][]{{"what is a resistor used for?","what is a diode used for","what dose A.C stand for","<html>Which of the following statements does <br> NOT describe an advantage of digital technology?</html>","The output of a NOT gate is HIGH when?","What is an analog-to-digital converter?","A simple flip-flop is?","<html>what is the name of the table that shows <br> every possible logical outcome in a digital circuit?</html>","What dose LED stand for?","Which of the following is a source of digital signal?","What does a Capacitor do?","What is a bread board used for?","The value of resistors are mesured in?","The flow of current is mesured in?","capacitance is mesured in?","<html> In an and gate if the first input is positive <br> and second input is negative what will the output be </html>","What is Ohms Law","What is an LED","<html>According to Ohms law how would you calcultate the <br> current(I) in a circuit</html>","What is a Logic Probe used for"},
                                {"restrict the flow of current","to direct the flow of electricty","Alternating current","The values may vary over a continuous range.","The input is low","It takes analog signals and puts them in digital format","1 bit memory","Truth Table","Light Emitting Diode","A computer","stores and releases charge","designing and testing circuits for real world use","Ohms","Amps","Farad","Negative","<html>Ohms Law is an empirical law used to calculate <br> the resistance<html>,current or voltage in a given circuit","An LED is a type of diode that emits light","Voltage(v)/Resistance(R)","To test Logic Gates in a Circuit"},
                                {"to connect up components","to connect up components","abstract current","The circuits are less affected by noise.","The input is High","It makes digital signals","is 2 bit memory","Function Table","Lazer Enhanced Drone","Speaker","produceses electrons simliar to a battery","buttering your bread on","volts","farad","Watts","Pulsing on and off","<html>Ohms law states that the amount of transistors <br >in an intgrated circuit doubles every 18 months <html>","An LED is a type of resistor that emits light","Volltage(V)*Resistance(R)","To test the resistance across a given resistor"},
                                {"to divert current","as a logic chip","alternating cult","The operation can be programmed.","The input changes from low to high","It stores information on a CD","has nothing to do with memory it is a four state device","ASCII Table","Level Enhancing Detail","Signal Generator","restricts the flow of current","testing equipment","Amp","Watts","hertz","Positive","<html>Ohms law states that anything that Can <br> go wrong will go wrong</html>","An LED is a type of capacitor that emits light","Resistance(R)/Power(W)","To measure Voltage"},{"b","a","a","c","a","c","b","a","c","c","b","c","b","a","a","b","b","c","a","c"}};
        
        }
    
    
        public void choseRandomQuestion(){
             
       //loop will run untill counter reaches 9
          for(int counter = 0; counter < 10; counter++)
          {
              //initilizes obj
               obj = new QuestionObj();
               //saves the values of the question going to be asked
               //values being declared inside loop as they are not needed outside loop there for they will not be there outside of the loop
              int i = 0;
              //randomValue and binarayValue claims its not being used because it cannot see inside the do while loop
              //randomValue stores value revieved from rand.next
              int randomValue = 0;
              //binaryValue stores value recieved from binarySecarch
              int binaryValue = 0;
              //gets random value to select question from array this one is not really needed but for some reason the first value dose not always get chosen
              randomValue = rand.nextInt(20);
              
                do
                {
                    //using if statement because i doesnt seem to reset out side of if statement there for same questions are being asked
                    if(i != 0)
                    {
                     //resets do loop counter to 0
                        i= 0;
                    }
                    //binary value set to 1
                    binaryValue = 1;
                    //this will run only once during the entirety of both loops as this is to only put first value in the array 
                    if(counter == 0 && a == null)
                    {
                        //sets do loop counter to 1 to exit the loop
                        i=1;
                        //sets a to 1 this value is used as a fail safe
                        a = 1;
                        //selects first random value
                        randomValue = rand.nextInt(20);
                        //stores random value in binarysort array to get ready to be sorted this value is used in the process of checking if question already exsits in array
                        binarysort[counter] = randomValue;
                        //stores same value in chosenquestions this value is used to chose the actual question
                        chosenquestions[counter] = randomValue;
                        //question, answer, incorrect answer1, incorrect answer 2, radion button selection gets taking out of QandA array and stored in object
                        obj.setquestion(QandA[0][chosenquestions[counter]]);
                        obj.setanswer(QandA[1][chosenquestions[counter]]);
                        obj.setincorrect1(QandA[2][chosenquestions[counter]]);
                        obj.setincorrect2(QandA[3][chosenquestions[counter]]);
                        obj.setrad(QandA[4][chosenquestions[counter]]);
                        //store values from object into object arraylist 
                        objArr.add(obj);
                    }
                    //after the first loop around this will run
                    else
                    {
                        //getting binarysort ready for checking 
                        Arrays.sort(binarysort);
                        //cheking binarysort to see if value of temp alrady exsits if it exsists the value in tempbin will be a positive number
                        //if value does not exsist then value in tempbin will be negitive
                        binaryValue = Arrays.binarySearch(binarysort,randomValue);
                        //if value of binaryValue is negitive the question will be put into the question list to ask user. if value is positive question will be chosen again
                        //this is a test remove comment to view what is happening in backgroun JOptionPane.showMessageDialog(null,"test" + tempbin + " " +  Arrays.toString(chosenquestions) + Arrays.toString(binarysort) + " " + temp);
                        if(binaryValue < 0)
                        {
                            //this adds the first values
                            binarysort[counter] = randomValue;
                            //number stored in temp will be stored in chosenquestion array for checking if user input matches later on
                            chosenquestions[counter] = randomValue;
                            //number in the first set of brackets is the QandA is the array row
                            //the second bracket contains chosenquestions[index number is in] is the selected question in QandA result
                            obj.setquestion(QandA[0][chosenquestions[counter]]);
                            obj.setanswer(QandA[1][chosenquestions[counter]]);
                            obj.setincorrect1(QandA[2][chosenquestions[counter]]);
                            obj.setincorrect2(QandA[3][chosenquestions[counter]]);
                            obj.setrad(QandA[4][chosenquestions[counter]]);
                            //adds objects (obj) to object arraylist(objArr)
                            objArr.add(obj);
                             //sets i to 1 to end loop
                            i = 1;
                        }
                        //else if binaryValue is more than 0 then get a new random number
                        else if(binaryValue >= 0)
                        {
                             //picks new question and stores question in RandomValue
                            randomValue = rand.nextInt(20);
                            //sets i to 0 to re-run loop and check if chosen question is already in array
                            i = 0;
                        }
                        //else display error
                        else
                        {
                            //error checking
                            JOptionPane.showMessageDialog(null,"something went wrong with choosing questions");
                        }
                    }
                   //JOptionPane.showMessageDialog(null, i);
                }while(i != 1);
            } // end of loop  
            
        //this is a test JOptionPane.showMessageDialog(null,objArr.get(0).getquestion() + " "+ objArr.get(1).getquestion() + " " + objArr.get(2).getquestion() + " array=" + randomizedQuestion[0] + " " + randomizedQuestion[1] + " " + randomizedQuestion[9]);
       //sets the object array
        quizgui.setobjarr(objArr);
        quizgui.setpage(page); 
         
    }
 
    
    
}
