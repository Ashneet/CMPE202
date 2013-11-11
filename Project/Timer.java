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
    
    public Timer(){
        setImage(new GreenfootImage(500, 200));
        drawMessage();
    }
    public void act() 
    {
        
    }
    public void drawMessage(){
        //GreenfootImage img = new GreenfootImage(50, 300);
        GreenfootImage img = this.getImage();
        img.clear();
        img.setColor(Color.BLUE);
        img.setFont(font);
        img.drawString(scoreText, 0, 200);
        //this.setImage(img);
        //setImage(new GreenfootImage(scoreText, 24, new Color(0, 0, 0, 0)));
    }
    public void updateCount(){
    }
    
        
    public void draw() {
         
    }
}
