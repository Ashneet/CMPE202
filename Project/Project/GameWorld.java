import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        Boy boy = new Boy();
        addObject(boy, 400, 507);
        Pedestrian pedestrian = new Pedestrian();
        addObject(pedestrian, 35, 306);
        Cycle cycle = new Cycle();
        addObject(cycle, 770, 231);
        Car car = new Car();
        addObject(car, 748, 30);
        Poiner poiner = new Poiner();
        addObject(poiner, 30, 500);
        poiner.setLocation(26, 500);
        cycle.setLocation(770, 189);
        cycle.setLocation(770, 191);
    }
}
