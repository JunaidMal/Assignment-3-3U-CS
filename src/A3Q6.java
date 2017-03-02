import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new city called bar
        City bar = new City();
        
        // creating a new robot called bob
        RobotSE bob = new RobotSE(bar, 0, 1, Direction.SOUTH);
        
        // creating "things" to pick up
        new Thing(bar, 1, 1);
        new Thing(bar, 1, 1);
        new Thing(bar, 1, 1);
        
        new Thing(bar, 2, 1);
        new Thing(bar, 2, 1);
        
        new Thing(bar, 3, 1);
        new Thing(bar, 3, 1);
        new Thing(bar, 3, 1);
        new Thing(bar, 3, 1);
        new Thing(bar, 3, 1);
        
        new Thing(bar, 4, 1);
        new Thing(bar, 4, 1);
        new Thing(bar, 4, 1);
        new Thing(bar, 4, 1);
        
        // count the number of "things" on a spot
        bar.showThingCounts(true);
        
        // moves bob onto first "thing"
        bob.move();
        
        // while bob can pick something, he'll follow this line of code. Code ends when no more things to move
        while(bob.canPickThing()) {
          
            // turns onto row and picks up the pile at the start
            bob.turnLeft();
            bob.pickAllThings();
            
            // bob will move forward and drop 1 thing until his backpack is empty
            while(bob.countThingsInBackpack() > 0) {
                bob.move();
                bob.putThing();
            }
            // bob turns around
            bob.turnAround();
            
            // until bob reaches the start of the row where it's empty, he'll move
            while(bob.canPickThing()) {
                bob.move();
            }
            // bob turns left and moves onto next row of "things"
            bob.turnLeft();
            bob.move();
            
            
            
            
            
            
        }
        
        
        
        
    }
}
