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
           resetPointerLocation();
        }
    }    
    
    private int getPointerY()
    {
        List<Pointer> pointerList = getWorld().getObjects(Pointer.class);
        if(!pointerList.isEmpty())
        {
            Pointer pointer = (Pointer)pointerList.get(0);
            return pointer.getY();
        }
        return this.getY();
    }
    
    private int getBoyX()
    {
         List<Boy> boyList = getWorld().getObjects(Boy.class);
        if(!boyList.isEmpty())
        {
            Boy boy = (Boy)boyList.get(0);
            return boy.getX();
        }
        return this.getX();
    }
    
    private void resetPointerLocation()
    {
        List<Pointer> pointerList = getWorld().getObjects(Pointer.class);
        if(!pointerList.isEmpty())
        {
            Pointer pointer = (Pointer)pointerList.get(0);
            pointer.setLocation(25, 500);
        }
    }
    
        
}
