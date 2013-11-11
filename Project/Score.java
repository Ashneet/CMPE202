import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends GamePlay implements IMessage
{
    private static int score = 0
    public void act() 
    {
        
    }    
    
    public void drawMessage(){
        GreenfootImage img = this.getImage();
        img.clear();
        img.setColor(Color.BLUE);
        img.setFont(font);
        int time = timerCount/100;
        img.drawString("Score : " + score ,0,200);
        //if(timerCount != 0)
        //timerCount--;
        //else
        //timerCount = 60;
    }
    
    public void updateCount(){
    
    }
    
}
