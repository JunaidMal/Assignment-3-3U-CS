
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
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a city called "empty"
       City empty = new City();
       
       // creating a new robot called shifter
       RobotSE shifter = new RobotSE(empty, 1, 1, Direction.EAST);
       
       // creating 10 "things" to pick up and shift
       for(int i = 0; i < 10; i++) {
       new Thing(empty, 1, 1);
       }
       // showing # of "things" in City
       empty.showThingCounts(true);
       
       // while(shifter.canPickThing()) {
       // shifter picks up "thing", puts it down 1 space ahead then returns. This repeats 10 times
       for(int i = 0; i < 10; i++) {
           shifter.pickThing();
           shifter.move();
           shifter.putThing();
           shifter.turnAround();
           shifter.move();
           shifter.turnAround();
           
     
    } shifter.move();
    }
}
