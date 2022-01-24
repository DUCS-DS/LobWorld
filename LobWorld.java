import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * LobWorld illustrates using inheritance in Java and
 * programming in Greenfoot.
 * 
 * @author S. Sigman 
 * @version 1.0
 */
public class LobWorld extends World
{
    public final int WORLD_WIDTH = 1024;
    public final int WORLD_HEIGHT = 576;
    /**
     * Constructor for objects of class LobWorld.
     * 
     */
    public LobWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 576, 1); 
        
        // add some lobs
        /*this.addObject(new Lob(), Greenfoot.getRandomNumber(WORLD_WIDTH),
                                  Greenfoot.getRandomNumber(WORLD_HEIGHT));
        this.addObject(new Lob(), Greenfoot.getRandomNumber(WORLD_WIDTH),
                                  Greenfoot.getRandomNumber(WORLD_HEIGHT));*/
                                  
    }
}
