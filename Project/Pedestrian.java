import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pedestrian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedestrian extends GamePlay
{
    /**
     * Act - do whatever the Pedestrian wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       Actor balloon;
        if(this.getX() == 0 || this.getX() == (getWorld().getWidth() - 1))
        {
            this.turn(180);
        }
        this.move(1);
        
        if(shootFlag)
        {
           GameWorld gameWorld = (GameWorld) getWorld();
           balloon = gameWorld.getBalloon();
           World world = getWorld();
           world.removeObject(balloon);
        }
    }    
}
