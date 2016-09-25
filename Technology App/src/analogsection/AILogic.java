/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

/**
 *
 * @author Sean Maguire
 */
public class AILogic {
    
    // declare variables 
    private String gamemode;
    private String message;
    private int ranNum;
    private int compRight;
    private int questRight;
    private int questRight1;
    private int questRight2;
    private int questRight3;
    private int questRight4;
    private int questRight5;
    private int questRight6;
    
    //constructor
    public void AiLogic(){
        ranNum=0;
        message ="";
        compRight=0;
        questRight = 0;
        questRight1 = 0;
        questRight2 = 0;
        questRight3 = 0;
        questRight4 = 0;
        questRight5 = 0;
        questRight6 = 0;
    }
    
    //setters
    public void setGamemode(String gamemode) {
        this.gamemode = gamemode;
    }
      
    //calculate how many questions the computer got right overall
    public void calRight(){
        if(gamemode.equals("easy")){
            compRight = 1+(int)(Math.random()* ((3-1) +1)); //the max questions the easy computer can get right is 3
        }
        
        else if(gamemode.equals("medium")){
            compRight = 3+(int)(Math.random()* ((5-3) +1)); //the max questions the medium computer can get right is 5
        }
        else if(gamemode.equals("hard")){
            compRight = 5+(int)(Math.random()* ((7-5) +1)); //the max questions the hard computer can get right is 7
    }
    }
    
    //calculate which specific questions the computer answered correctly, based on how many questions it got right overall
    public void whatQuestions(){
        if(compRight == (int) 1){
            questRight = 1+(int)(Math.random()*((10-1) +1));
            message = "The computer got question " + questRight + " right";
        }
        
        else if(compRight == (int) 2){
            questRight = 5+(int)(Math.random()*((10-5) +1));
            questRight1 = 1+(int)(Math.random()*((4-1) +1));
            message ="The computer got question " + questRight + " and " + questRight1 + " right";
        }
        
        else if(compRight == 3){
            questRight = 1+(int)(Math.random()*((3-1) +1)); 
            questRight1 = 4+(int)(Math.random()* ((6-4))+1);
            questRight3 = 10+(int)(Math.random()*((10-7)) +1);
            message ="The computer got question " + questRight + ", " + questRight1 + " and " + questRight3 + " right";
        }
        
        else if(compRight == 4){
            questRight = 1+(int)(Math.random()*((2-1))+1); 
            questRight1 = 3+(int)(Math.random()*((4-3)) +1);
            questRight3 = 5+(int)(Math.random()*((7-5)) +1);
            questRight2 = 8+(int)(Math.random()* ((10-8))+1);
            message ="The computer got question " + questRight + ", " + questRight1 + ", " + questRight3 + " and " + questRight2 + " right";
        }
        
        else if(compRight == 5){
            questRight = 1+(int)(Math.random()*((2-1))+1); 
            questRight1 = 3+(int)(Math.random()*((4-3))+1);
            questRight3 = 5+(int)(Math.random()*((6-5))+1);
            questRight2 = 7+(int)(Math.random()*((8-7))+1);
            questRight4 = 9+(int)(Math.random()*((10-9))+1);
            message ="The computer got question " + questRight + ", " + questRight1 + ", " + questRight3 + ", " + questRight2 + " and " + questRight4 + " right";
        }
        
         else if(compRight == 6){
            questRight = 1; 
            questRight1 = 3+(int)(Math.random()*((4-3))+1);
            questRight3 = 5+(int)(Math.random()*((6-5))+1);
            questRight2 = 7+(int)(Math.random()*((8-7))+1);
            questRight4 = 9+(int)(Math.random()*((10-9))+1);
            questRight5 = 2;
            message ="The computer got question " + questRight + ", " + questRight1 + ", " + questRight3 + ", " + questRight2 + ", " + questRight4 + " and " + questRight5 + " right";
        }
        
         else if(compRight == 7){
            questRight = 1; 
            questRight1 = 4;
            questRight3 = 5+(int)(Math.random()*((6-5))+1);
            questRight2 = 7+(int)(Math.random()*((8-7)) +1);
            questRight4 = 9+(int)(Math.random()*((10-9))+1);
            questRight5 = 2;
            questRight6 = 3;
            message ="The computer got question " + questRight + ", " + questRight1 + ", " + questRight3 + ", " + questRight2 + ", " + questRight4 + ", " + questRight5 + " and " + questRight6 + " right";
        }
    }
 
    //setters
    public String getMessage() {
        return message;
    }
    
    
    
}
    
        

        
   
   
