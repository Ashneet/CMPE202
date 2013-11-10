import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boy extends GamePlay
{
    /**
     * Act - do whatever the Boy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
            this.move(-5);
        }
        
         if(Greenfoot.isKeyDown("right"))
        {
            this.move(5);
        }
        
    }    
}
