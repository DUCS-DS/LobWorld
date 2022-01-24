import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SeaHorse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeaHorse extends Actor
{
    private final int DIST_TO_MOVE = 5;
    private final int DEG_TO_TURN = 5;
    /**
     * Act - the act method moves the Seahorse as follows:
     *   left cursor key - move the seahorse backward
     *   right cursor key - move the seahorse forward
     *   up cursor key - turn the seahorse counter clockwise DEG_TO_TURN
     *   down cursor key - turn the seahorse clockwise DEG_TO_TURN
     */
    public void act()
    {
        // Move forward
        if (Greenfoot.isKeyDown("right")) {
            this.move(DIST_TO_MOVE);
        }
        
        // Move backward
        if (Greenfoot.isKeyDown("left")) {
            this.move(-DIST_TO_MOVE);
        }
        
        // Turn counterclockwise
        if (Greenfoot.isKeyDown("up")) {
            this.turn(-DEG_TO_TURN);
        }
        
        // Turn clockwise
        if (Greenfoot.isKeyDown("down")) {
            this.turn(DEG_TO_TURN);
        }
    }    
    
}
