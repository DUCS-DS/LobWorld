# LobWorld
This is the example of using Greenfoot developed in class.  Things to take note of:
*  The Javadoc comments used in all the files.
*  How inheritance is used to extend the two base classes:  World & Actor.
*  Note the role the construct plays in constructing an instance of an object.  This is illustrated in the constructor of the LobWorld class.
*  How random numbers are used to position the Lob and SeaHorse objects in the world.
*  How the arrow keys are used to control the SeaHorse object.
*  How Lob objects are made to wander randomly around the world.
*  Note that the fact randomly numbers are uniformly distrubuted can be used to determine a percentage value.  This is illustrated in the Lob class where the Lob avatar turns only a specifiec percentage of the time.

***Note:***  Greenfoot implements a game loop that works as follows:
1.  The constructor of the World object is called and instanstates a World.
2.  The act of method of each object, starting with the World object is called in turn. This means that each object gets their turn to "act" (move, eat another object, explode, ...).  We usually do not need the know the order the act method of each object is called. 
3.  The loop outlined in #2 continues until the reset button is pressed. 
