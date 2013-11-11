import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloon extends GamePlay
{
    /**
     * Act - do whatever the Balloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor balloon;
        GameWorld gameWorld = (GameWorld) getWorld();
        Splash splash = gameWorld.getSplash();
         if(Greenfoot.isKeyDown("left"))
        {
            this.move(-5);
        }
        
         if(Greenfoot.isKeyDown("right"))
        {
            this.move(5);
        }
        
         if(!Greenfoot.isKeyDown("z") && getPointerY() < 500)
        {
           shootFlag = true;
           this.setLocation(getBoyX(), getPointerY());
           gameWorld.addObject(splash, getBoyX(), getPointerY());
           Greenfoot.delay(8);
           World world = getWorld();
           world.removeObject(splash);
           balloon = gameWorld.getBalloon();
           resetPointerLocation(balloon);
        }
    }    
    
    private int getPointerY()
    {
        GameWorld world = (GameWorld) getWorld();
	    Pointer pointer = world.getPointer();
        return pointer.getY();
    }
    
    private int getBoyX()
    {
        GameWorld world = (GameWorld) getWorld();
	Boy boy = world.getBoy();
        return boy.getX();
    }
    
    private void resetPointerLocation(Actor obj)
    {
        GameWorld world = (GameWorld) getWorld();
	    Pointer pointer = world.getPointer();
        pointer.setLocation(25, 500);
        obj.setLocation(480,536);
    }
    

}
