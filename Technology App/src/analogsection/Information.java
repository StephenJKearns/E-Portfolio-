
package analogsection;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Stephen
 */
public class Information {

    //variables

    private static String infoDisplayed;
    protected ArrayList<String> info;
    private ArrayList<String> urls;
    private String fileList;
    private ImageIcon selectedImg;
    private int imgSelector, imgSelectorDigital;
    private String imgSelectString;
    private static String statArray[];

    protected static int infoType;
    private int i;

    public Information() {
        infoDisplayed = "";
        i = 0;
        imgSelector = 42;
        imgSelectorDigital = 53;
        statArray = new String[10];
        imgSelector = 0;
        urls = new ArrayList<String>();
        info = new ArrayList<String>();

    }

    public static void InfoType(int infoType) {
        Information.infoType = infoType;
    }

    //retrives the image which is to be selected

    public void setImageUsed(int imgSelector) {
        this.imgSelector = imgSelector;
    }

    public void setUrls() {
        //adds the images urls to the arraylist 
        imgSelectString = Integer.toString(imgSelector);
        urls.add("/resources/" + imgSelectString + ".jpg");

    }

    public ImageIcon AddImageUsingURLS() {

        //buffered image to hold the image    
        BufferedImage Img = null;
       
        //error handler to catch errors which occour while retriving and img from the resources 
        try { 

            //selects an url from the arraylist, and searchs the resoures for the img with thet url
            
            URL url = getClass().getResource(urls.get(i));

//           //reads an image from the url provided 
            Img = ImageIO.read(url);
//
        }//end of try
        catch (IOException e) {
            // Exception error is caused, due to the image not being found 
            System.out.println("An error occoured");
            System.out.print(e);

        }
        selectedImg = new ImageIcon(Img);
        // will return the image chosen 
        return selectedImg;
    }

    public void setInfo(ArrayList<String> info) {
        this.info = info;

    }

    public void setCount(int count) {
        i = count;
    }

    public String DisplayInfo() {

        infoDisplayed = info.get(i);

        return infoDisplayed;
    }

    public static int getInfoType() {
        return infoType;
    }

    public int getCounter() {
        return i;
    }
    
    
            
    
   
}
