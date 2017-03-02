
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a city named box
        City box = new City();
        // creating a robot named hood
        RobotSE hood = new RobotSE(box, 2, 3, Direction.SOUTH);

        new Wall(box, 1, 1, Direction.NORTH);
        new Wall(box, 1, 1, Direction.WEST);
        new Wall(box, 2, 1, Direction.WEST);
        new Wall(box, 3, 1, Direction.WEST);
        new Wall(box, 3, 1, Direction.SOUTH);
        new Wall(box, 3, 2, Direction.SOUTH);
        new Wall(box, 3, 3, Direction.SOUTH);
        new Wall(box, 3, 4, Direction.SOUTH);
        new Wall(box, 3, 4, Direction.EAST);
        new Wall(box, 2, 4, Direction.EAST);
        new Wall(box, 1, 4, Direction.EAST);
        new Wall(box, 1, 4, Direction.NORTH);
        new Wall(box, 1, 3, Direction.NORTH);

        // houdini will move until he encounters a wall
        while (hood.frontIsClear()) {
            hood.move();
        }


        // when encountering a wall
        // houdini will turn left
            while (!hood.frontIsClear()) {
                hood.turnLeft();
                // houdini will check if the front is safe to move
                if (hood.frontIsClear()) {
                    hood.move();
                    hood.turnRight();
                }
                // if houdini finds the opening, he will leave
                if (hood.frontIsClear()) {
                    hood.move();
                }
            }
            

        


    }
}
