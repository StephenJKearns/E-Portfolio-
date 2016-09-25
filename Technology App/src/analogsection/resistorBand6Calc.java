
package analogsection;

/**
 *
 * @author Stephen
 */
/*
 * This class is a subclass of 5bandCalc which is derived from the 4BandCalc class,
 * And adds functionallity tot the class. 
 */
public class resistorBand6Calc extends ResistorCalc5band {

    protected String band6;
    protected int digit6, tempco;

    public resistorBand6Calc(String band1, String band2, String band3, String band4, String band5) {
        super(band1, band2, band3, band4, band5);
        this.band1 = band1;
        this.band2 = band2;
        this.band3 = band3;
        this.band4 = band4;
        this.band5 = band5;
        this.band5 = band5;
        band6 = "";
        digit6 = 0;
    }

    //retrives the band value from the user
    public void setBand6(String band6) {
        this.band6 = band6;
    }

    //Assigns the Temperature Coefficient value
    public void assignTempcoValue() {

        switch (band6) {
            case "brown":
                tempco = 100;
                break;
            case "red":
                tempco = 50;
                break;
            case "yellow":
                tempco = 25;
                break;
            case "blue":
                tempco = 10;
                break;
            case "violet":
                tempco = 5;
                break;
            default:
                System.out.println("an error occoured");
                break;
        }
    }

    //returns the Temperature Coefficient in celius using ASCII code 

    public String getTempco() {
        final String degrees = "\u00b0";
        return "Temperature Coefficient Value:" + tempco + "ppm/" + degrees + "C";
    }
}
