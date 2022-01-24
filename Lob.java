import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lob extends Actor
{
    private static final int TURN_LIMIT = 15;
    private static final int AMOUNT_2_MOVE = 5;
    private static final int TURN_PERCENTAGE = 30;
    
    /**
     * Act - do whatever the Lob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int deg2Turn = Greenfoot.getRandomNumber(TURN_LIMIT);
        int percent = Greenfoot.getRandomNumber(100);
        // turn clockwise 30% of the time
        if (percent < TURN_PERCENTAGE) {
            // turn clockwise
            this.turn(deg2Turn);
        }
        else {
            // turn counterclockwise
            this.turn(-1*deg2Turn);
        }
        
        // move forward
        this.move(AMOUNT_2_MOVE);
    }
}
