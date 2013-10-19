import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends GifActor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.move(-3);
        if(this.getX() == 0 || this.getX() == (getWorld().getWidth() - 1))
        {
            this.turn(180);
        }
        if(!Greenfoot.isKeyDown("z"))
        {
            
        }
    }    
}
