/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

//declare variables
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Hassan
 */
//initilize variables in constructer
public class LogicGateSim{
     protected int gate;
    protected ImageIcon ImgDisplayedLbl;
    protected BufferedImage Img;
    protected URL url;
    protected int input1;
    protected int input2;
    LogicGateSim(){
     gate = 0;
     Img = null;
     url = null;
     input1 = 0;
     input2 = 0;
    
    }
   /* public LogicGateSim(){
    //input1tgbtn.addActionListener(new MyActionListener());
    input2tgbtn.addActionListener(this);
    outputtgbtn.addActionListener(this);
    }*/
    //set gate
    public void setgate(int gate){
        this.gate = gate;
    }
    //set input1
    public void setinput1(int input1){
        this.input1 = input1;
    }
    //set input2
    public void setinput2(int input2){
        this.input2 = input2;
    }
    
    public ImageIcon generateoutput(){
    //switch case choose chooses what gate is chosen based on what button was presses for example gate 1 is an and gate so the first case will be chosen 
        switch(gate){
            //if gate is equal to 1 then case 1 is selected which is the and gate
            case 1:
                //if input1 == 1 and input2 == 1 then display a positive symbol else display minus
                if(input1 == 1 && input2 == 1)
                {
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if file not found
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
      
                }
                else if(input1 == 1 && input2 == 0 )
                {
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        System.out.println(getClass().getResource("/resources/minus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 0 && input2 == 1)
                {
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error is no image found
                        System.out.println(getClass().getResource("/resources/minus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
      
                }
                else if(input1 == 0 && input2 == 0){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error id image not found
                        System.out.println(getClass().getResource("/resources/minus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
       
                }
                else{
                    JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
                }
                break;
                //if gate is equal to 2 then this case is selected which is a nand gate
            case 2:
                if(input1 == 1 && input2 == 1){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error is image not found
                        System.out.println(getClass().getResource("/resources/minus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
       
                }
                else if(input1 == 1 && input2 == 0 ){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image not found
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
       
                }
                else if(input1 == 0 && input2 == 1){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image not found
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
      
                }
                else if(input1 == 0 && input2 == 0){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
      
                }
                else{
                    JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
                }
                break;
                //if gate equals 3 then case 3 is slected which is an or gate
            case 3:
                if(input1 == 1 && input2 == 1){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //displays error if image not found
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 1 && input2 == 0 ){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 0 && input2 == 1){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image is not found
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 0 && input2 == 0){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image is not found
                        System.out.println(getClass().getResource("/resources/minus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else{
                    JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
                }
                break;
            //if gate is equal to 4 then case 4 is selected which is the nor gate    
            case 4:
                if(input1 == 1 && input2 == 1){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                        }
                        catch(IOException e)
                        {
                            //display error if image is not found
                            System.out.println(getClass().getResource("/resources/minus.png"));
                            System.out.println("An error occoured");
                            System.out.print(e);
                        }
                        ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 1 && input2 == 0 ){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image is not found
                        System.out.println(getClass().getResource("/resources/minus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 0 && input2 == 1){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image is not found
                        System.out.println(getClass().getResource("/resources/minus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img); 
                }
                else if(input1 == 0 && input2 == 0){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //displays error if image is not found
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else{
                    JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
                }
                break;
            //if gate equals 5 then case 5 is selected which is an xor gate
            case 5:
                if(input1 == 1 && input2 == 1){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image is not found
                        System.out.println(getClass().getResource("/resources/minus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 1 && input2 == 0 ){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 0 && input2 == 1){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image is not found
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 0 && input2 == 0){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image is not found
                        System.out.println(getClass().getResource("/resources/minus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else{
                    JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
                }
                break;
                //if gate equals 6 then case 6 is slected which is a not gate
            case 6:
                if(input1 == 1){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image is not found
                        System.out.println(getClass().getResource("/resources/minus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 0){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image is not found
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else{
                    JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
                }
                break;
                //if gate is equal to 7 then case 7 is selected which is an xnor gate
            case 7:
                if(input1 == 1 && input2 == 1){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image is not found
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 1 && input2 == 0 ){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image is not found
                        System.out.println(getClass().getResource("/resources/minus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 0 && input2 == 1){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/minus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //display error if image is not found
                        System.out.println(getClass().getResource("/resources/minus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else if(input1 == 0 && input2 == 0){
                    try{
                        //gets image url and stores it in url then reads image from url and stores it in img
                        url = getClass().getResource("/resources/plus.png");
                        Img = ImageIO.read(url);
                    }
                    catch(IOException e)
                    {
                        //gets image url and stores it in url then reads image from url and stores it in img
                        System.out.println(getClass().getResource("/resources/plus.png"));
                        System.out.println("An error occoured");
                        System.out.print(e);
                    }
                    ImgDisplayedLbl = new ImageIcon(Img);
                }
                else{
                    JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
                }
                break;
                //default if some how gate is not equal to any of the above numbers which isnt really possible
            default:
                JOptionPane.showMessageDialog(null,"something has gone wrong with selecting your choice of logic gate");
            break;
        }
    
    return ImgDisplayedLbl;
    }
    
}
