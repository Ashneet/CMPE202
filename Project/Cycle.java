import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Cycle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cycle extends GifActor
{
    /**
     * Act - do whatever the Cycle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(this.getX() == 0 || this.getX() == (getWorld().getWidth() - 1))
        {
            this.turn(180);
        }
        this.move(-2);
    }    
}
