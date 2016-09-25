


package analogsection;

/**
 *
 * @author stephen
 */

/* 


  * This class inherits from the 4bandCalc, any uses polymorphism to overide the functionallity of the class.


*/

public class ResistorCalc5band extends ResistorCalc4Band {
    //variables 
    protected String band5;
    protected int digit3;

    /*
     * invokes the superclass's constructor,
     * 
    */
    public ResistorCalc5band(String band1, String band2, String band3,String band4, String band5){   
        super();
        this.band1 = band1;
        this.band2 = band2;
        this.band3 = band3;
        this.band4 = band4;
        this.band5 = band5;
        this.band5 = band5;
        digit3 = 0;
        
        
    } // end of constructor 


   public void setBand5(String band5) {
        this.band5 = band5;
   }

    
    
    public void AssignBand3(){
        switch (band3) {
            case "black":
                digit3 = 0;
                break;
            case "brown":
                digit3 = 1;
                break;
            case "red":
                digit3 = 2;
                break;
            case "orange":
                digit3 = 3;
                break;
            case "yellow":
                digit3 = 4;
                break;
            case "green":
                digit3 = 5;
                break;
            case "blue":
                digit3 = 6;
                break;
            case "violet":
                digit3 = 7;
                break;
            case "grey":
                digit3 = 8;
                break;
            case "white":
                digit3 = 9;
                break;
        }

    } 

    
   
    @Override
    public void assignMulitiplier() {
        switch (band4) {
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

    @Override
    public void assignToloerance() {
        switch (band5) {
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
                toloerance = 0.25;
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
    
  //overides the compute mehtod in the superclass and extends its functionallity.
    @Override
 public void compute() {

       
        resistorColorVals = Integer.valueOf(String.valueOf(digit1) +  String.valueOf(digit2) +  String.valueOf(digit3));

        //error checker 
        System.out.println(resistorColorVals);

        //gives resistors vlaue has to be given in ohms
        valueResistor = (resistorColorVals * multiplier);

    }
 
    
    
 
 
 
}
