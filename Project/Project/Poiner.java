import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poiner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poiner extends Actor
{
    /**
     * Act - do whatever the Poiner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(270);
         if(Greenfoot.isKeyDown("z"))
        {
            this.move(3);
        }
        else
        {
            this.setLocation(25, 500);
        }
    }    
}
