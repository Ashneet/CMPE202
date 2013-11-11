import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends GamePlay implements IMessage
{
    private String scoreText = "COUNTDOWN";
    Font font = new Font("Verdana", 2, 20);
    private static int timerCount = 6000;
    
    public Timer(){
        setImage(new GreenfootImage(500, 200));
        drawMessage();
    }
    public void act() 
    {
        drawMessage();
    }
    public void drawMessage(){
        GreenfootImage img = this.getImage();
        img.clear();
        img.setColor(Color.BLUE);
        img.setFont(font);
        int time = timerCount/100;
        img.drawString(scoreText+ ":" + time,0,200);
        if(timerCount != 0)
        timerCount--;
        else
        timerCount = 60;
        
    }
    
    public void updateCount( ){
        
    }
    
        
    
}
