
package analogsection;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen
 * @Date: 6/3/15
 * @ ResistorCalc4Band.java
 */

public class ResistorCalc4Band {

    //variables
    protected String band1, band2, band3, band4, resistorDigits, conversion, substrK, substrH, convertkilohm,maxConverKilohm,minConverKilohm;
    protected int digit1, digit2, percent, resistorColorVals;
    protected double maxValue, minValue, toloerance, tolrancPercent, multiplier;
    protected double valueResistor;
    protected File f;
    protected String line;
   //constructor which is invoked by the subclass
    public ResistorCalc4Band(){
        resistorDigits = "";
        conversion = "";
        substrK = "";
        substrH = "";
        convertkilohm = "";
        digit1 = 0;
        digit2 = 0;
        percent = 100;
        resistorColorVals = 0;
        maxValue = 0.0;
        minValue = 0.0;
        toloerance = 0.0;
        tolrancPercent = 0.0;
        multiplier = 0.0;
        valueResistor = 0.0; 
        band1 = "";
        band2 = "";
        band3 = "";
        band4 = "";
        f = new File("calculation.txt");
     }
    
   

 


    

    //setters to set the band values,from the user's selected band colors.
    public void setBand1(String band1) {
        this.band1 = band1;
    }

    public void setBand2(String band2) {
        this.band2 = band2;
    }

    public void setBand3(String band3) {
        this.band3 = band3;
    }

    public void setBand4(String band4) {
        this.band4 = band4;
    }
     //methods to assign values for each of the color bands or the resistor
    public void AssignValues() {

        switch (band1) {
            case "black":
                digit1 = 0;
                break;
            case "brown":
                digit1 = 1;
                break;
            case "red":
                digit1 = 2;
                break;
            case "orange":
                digit1 = 3;
                break;
            case "yellow":
                digit1 = 4;
                break;
            case "green":
                digit1 = 5;
                break;
            case "blue":
                digit1 = 6;
                break;
            case "violet":
                digit1 = 7;
                break;
            case "grey":
                digit1 = 8;
                break;
            case "white":
                digit1 = 9;
                break;
        }

    }

    public void AssignBand2Values() {
        if (band2.equals("black")) {
            digit2 = 0;

        } else if (band2.equals("brown")) {

            digit2 = 1;

        } else if (band2.equals("red")) {

            digit2 = 2;

        } else if (band2.equals("orange")) {

            digit2 = 3;

        } else if (band2.equals("yellow")) {

            digit2 = 4;


        } else if (band2.equals("green")) {

            digit2 = 5;

        } else if (band2.equals("blue")) {

            digit2 = 6;

        } else if (band2.equals("violet")) {

            digit2 = 7;

        } else if (band1.equals("grey")) {

            digit2 = 8;

        } else if (band1.equals("white")) {

            digit2 = 9;
        }
    }

    public void assignMulitiplier() {
        switch (band3) {
            case "black":
                multiplier = 1;
                break;
            case "brown":
                multiplier = 10;
                break;
            case "red":
                multiplier = 100;
                break;
            case "orange":
                multiplier = 1000;
                break;
            case "yellow":
                multiplier = 10000;
                break;
            case "green":
                multiplier = 100000;
                break;
            case "blue":
                multiplier = 1000000;
                break;
            case "violet":
                multiplier = 10000000;
                break;
            case "grey":
                multiplier = 1000000000;
                break;
            case "gold":
                multiplier = 0.1;
                break;
            case "silver":
                multiplier = 0.01;
                break;
            default:
                System.out.println("an error occoured");
                break;
        }
    }

    public void assignToloerance() {

        switch (band4) {
            case "brown":
                toloerance = 1;
                break;
            case "red":
                toloerance = 2;
                break;
            case "green":
                toloerance = 0.5;
                break;
            case "blue":
                toloerance = 0.25;
                break;
            case "violet":
                toloerance = 0.1;
                break;
            case "gold":
                toloerance = 5;
                break;
            case "silver":
                toloerance = 10;
                break;
            case "none":
                toloerance = 20;
                break;
            default:
                System.out.println("an error occoured");
                break;
        }
    }

    public void compute() {

        /*
         concatenate's the values of the bands,
         Cast's to, int value for arithmetic processing
        */
        resistorColorVals = Integer.valueOf(String.valueOf(digit1) + String.valueOf(digit2));

        //Calculates the resistor value
        valueResistor = (resistorColorVals * multiplier);

    }
    
    /*
      * Calculates the total percentage value of tolerance,
      * calc's the max value, and min value of tolorance, from the total percent.
      * this tells,the total tolerance inwhich the resistor can with stand.
    */
    public void CalcToloerance() {
        
       //trys to catch, any Aritmetic errors, and reports which errors occoured 
        try {
            tolrancPercent = (valueResistor * (toloerance / percent));

        } catch (ArithmeticException e) {
            System.out.println("error" + "\n" + e);
        }
        //calcs the maxValue, return values in ohms
        maxValue = tolrancPercent + valueResistor;
        //calcs the minValue, return values in ohms
        minValue = valueResistor - tolrancPercent;
    }
    /*
      * Converts the resistors value, Max tolerance value, and min tolerance value,
      * To kilo ohm's,and mega-ohm's by means of the following conversion measurment rules:
               
                 * Any value < than 1000 is given in ohms
                 * Any value >= 1000 is given in kilo-ohm's(k)
                 * Any value >= 1000000 is given in Mega-ohm's(M)
    
      * DecimalFormat is used to, format scientfic notation numbers so as (1.2E7), 
      * Some that largers numbers can be processed, and converted.
  
    */
    public void convertToKilohm() {
        if(valueResistor  < 100){
            conversion = String.valueOf(valueResistor);
            convertkilohm =  conversion + " "+ "ohms";
        }else if(valueResistor  > 99 && valueResistor < 1000) {
            conversion = String.valueOf(valueResistor);
            convertkilohm =  conversion + " " + "ohms";
        }else if (valueResistor > 999 && valueResistor < 10000) {
            conversion = String.valueOf(valueResistor);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            convertkilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (valueResistor > 9999 && valueResistor < 100000) {
            conversion = String.valueOf(valueResistor);
            substrK = conversion.substring(0, 2);
            substrH = conversion.substring(3, 5);
            convertkilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (valueResistor > 100000 && valueResistor < 1000000) {
            conversion = String.valueOf(valueResistor);
            substrK = conversion.substring(0, 3);
            substrH = conversion.substring(4, 6);
            convertkilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (valueResistor > 999999 && valueResistor < 10000000) {
            conversion = String.valueOf(valueResistor);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            convertkilohm = substrK + "." + substrH + "M" + "ohms";

        } //Converts scientfic notation number, into digtial repersentation to be processed
        else if (valueResistor >= 10000000 && valueResistor < 100000000) {
            long number;
            number = Long.parseLong(String.format("%.0f", valueResistor));
            conversion = String.valueOf(number);
            substrK = conversion.substring(0, 2);
            substrH = conversion.substring(3, 5);
            convertkilohm = substrK + "." + substrH + "M" + "ohms";

        } else if (valueResistor >= 100000000) {
            long number;
            number = Long.parseLong(String.format("%.0f", valueResistor));
            conversion = String.valueOf(number);
            substrK = conversion.substring(0, 3);
            substrH = conversion.substring(4, 6);
            convertkilohm = substrK + "." + substrH + "M" + "ohms";

        }

        // converts maximun resistor value to kilohmz
         if(maxValue < 100){
            conversion = String.valueOf(maxValue);
            maxConverKilohm = conversion + "" + "ohms";
        }else if(maxValue > 99 && maxValue < 1000) {
            conversion = String.valueOf(maxValue);
            maxConverKilohm = conversion + "" + "ohms";
        } else if (maxValue > 999 && maxValue < 10000) {
            conversion = String.valueOf(maxValue);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            maxConverKilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (maxValue > 9999 && maxValue < 100000) {
            conversion = String.valueOf(maxValue);
            substrK = conversion.substring(0, 2);
            substrH = conversion.substring(3, 5);
            maxConverKilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (maxValue > 100000 && maxValue < 1000000) {
            conversion = String.valueOf(maxValue);
            substrK = conversion.substring(0, 3);
            substrH = conversion.substring(4, 6);
            maxConverKilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (maxValue > 999999 && maxValue < 10000000) {
            conversion = String.valueOf(maxValue);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            maxConverKilohm = substrK + "." + substrH + "M" + "ohms";

        }//Converts scientfic notation number, into digtial repersentation to be processed
        else if (maxValue >= 10000000 && maxValue < 100000000) {
            long number;
            number = Long.parseLong(String.format("%.0f",maxValue));
            conversion = String.valueOf(number);
            substrK = conversion.substring(0, 2);
            substrH = conversion.substring(3, 5);
            maxConverKilohm = substrK + "." + substrH + "M" + "ohms";

        } else if (maxValue >= 100000000) {
            // number is to larger to be repersented in digital form
           //so it's store it in a decimal format and then converted to a string  
            long number;
            number = Long.parseLong(String.format("%.0f",maxValue));
            conversion = String.valueOf(number);
            substrK = conversion.substring(0, 3);
            substrH = conversion.substring(4, 6);
            maxConverKilohm= substrK + "." + substrH + "M" + "ohms";

        }
       
        //converts the minium resistor value to kiloohmz
         if(minValue  < 100){
            conversion = String.valueOf(minValue);
            minConverKilohm = conversion + "" + "ohms";
        }else if (minValue > 99 && minValue < 1000) {
            conversion = String.valueOf(minValue);
            minConverKilohm = conversion + "" + "ohms";
        } else if (minValue > 999 && minValue < 10000) {
            conversion = String.valueOf(minValue);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            minConverKilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (minValue > 9999 && minValue < 100000) {
            conversion = String.valueOf(minValue);
            substrK = conversion.substring(0, 2);
            substrH = conversion.substring(3, 5);
            minConverKilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (minValue > 100000 && minValue < 1000000) {
            conversion = String.valueOf(minValue);
            substrK = conversion.substring(0, 3);
            substrH = conversion.substring(4, 6);
            minConverKilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (minValue > 999999 && minValue < 10000000) {
            conversion = String.valueOf(minValue);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            minConverKilohm = substrK + "." + substrH + "M" + "ohms";

        } //Converts scientfic notation number, into digtial repersentation to be processed
        else if (minValue >= 10000000 && minValue < 100000000) {
            long number;
            number = Long.parseLong(String.format("%.0f", minValue));
            conversion = String.valueOf(number);
            substrK = conversion.substring(0, 2);
            substrH = conversion.substring(3, 5);
            minConverKilohm = substrK + "." + substrH + "M" + "ohms";

        } else if (minValue >= 100000000) {
            long number;
            number = Long.parseLong(String.format("%.0f", minValue));
            conversion = String.valueOf(number);
            substrK = conversion.substring(0, 3);
            substrH = conversion.substring(4, 6);
            minConverKilohm = substrK + "." + substrH + "M" + "ohms";

        }
   }
    //saves to a file and if not found creates one,
    //Also error catchs, to find any errors while saving to file
    public void SaveToFile() {
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bWriter = new BufferedWriter(fw);
            bWriter.write("formula:" + resistorColorVals + "x" + multiplier + "=" + convertkilohm +"\n Find tolerance: " + valueResistor +" *" +toloerance +" / "+ percent + " = " + tolrancPercent);
            bWriter.close();
        } catch (IOException e) {
            Logger.getLogger(ResistorCalc4Band.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("An error occured while trying to write to the file");
            System.out.println(e.toString());
        }

    }
    //reads from the file, one saved calculation at a time.
    //And also error catches to find errors occoured while reading from the file.
    public String ReadFromFile() {

        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

           
            line = br.readLine();
           
            br.close();
         
        } catch (IOException e) {
            System.out.println("Error occoured while trying to read from the file");
            System.out.printf(e.toString());
        }

        return line;
    }
   
   //returns the resistor value in ohms
    public String getValueResistor() {
        return convertkilohm; 
    }
    //returns max value in converted format
    public String getMaxValue() {
        return maxConverKilohm;
    }
    //returns the min value in converted format
    public String getMinValue() {
        return minConverKilohm;
    }
    
    
   
    
}
