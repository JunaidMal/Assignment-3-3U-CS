
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating new city called kw
        City kw = new City();
        // creating robot named karel
        Robot karel = new Robot(kw, 0, 0, Direction.EAST);
        
        // creating a wall and things
        new Wall(kw, 0, 4, Direction.WEST);
        new Thing(kw, 0, 3);
        
        // while karel is not on a thing nor obstructed by a wall, he will move forward
        while(!karel.canPickThing() && karel.frontIsClear()) {
        karel.move();
    }
        
    }
}
