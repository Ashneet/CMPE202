import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    
    private Boy boy;
    private Car car;
    private Cycle cycle;
    private Pedestrian pedestrian;
    private Balloon balloon;
    private Pointer pointer;

    private Timer timer;
    private Splash splash;

    
    public Boy getBoy()
    {
        return this.boy;
    }
    
    public Splash getSplash()
    {
        return this.splash;
    }
    
    public Car getCar()
    {
        return this.car;
    }
    
    public Timer getTimer()
    {
        return this.timer;
    }
    
    public Cycle getCycle()
    {
        return this.cycle;
    }
    
    public Pedestrian getPedestrian()
    {
        return this.pedestrian;
    }

    public Balloon getBalloon()
    {
        return this.balloon;
    }
    
    public Pointer getPointer()
    {
        return this.pointer;
    }
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

        this.boy = new Boy();
        addObject(boy, 400, 507);
        this.pedestrian = new Pedestrian();
        addObject(pedestrian, 35, 306);
        this.cycle = new Cycle();
        addObject(cycle, 770, 231);
        this.car = new Car();
        addObject(car, 748, 30);
        this.pointer = new Pointer();
        addObject(pointer, 30, 500);
        this.balloon = new Balloon();
        addObject(balloon, 480, 536);

        this.timer = new Timer();
        addObject(this.timer,800,450);
        

        this.splash = new Splash();

    }
}
