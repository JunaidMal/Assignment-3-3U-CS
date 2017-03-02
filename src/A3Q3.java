
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a city named kw
        City kw = new City();
        // creating a bot named vac
        RobotSE vac = new RobotSE(kw, 1, 1, Direction.EAST);

        // creating the walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);

        // creating litter
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

        // while statement will be read once the vaccum reaches the end, breaking the line of code
        while (vac.frontIsClear()) {

            // vaccum moves until it encounters a wall, picks up things while moving
            while (vac.frontIsClear()) {
                if (vac.canPickThing()) {
                    vac.pickThing();
                }
                vac.move();
            }

            // when encountering a wall, vaccum will turn right
            if (!vac.frontIsClear()) {
                vac.turnRight();

                // vaccum will check if front is clear, then proceed to move and turn onto the new line of "things"
            }
            if (vac.frontIsClear()) {
                vac.move();
                vac.turnRight();

                // vaccum picks up "things" while moving
            }
            while (vac.frontIsClear()) {
                if (vac.canPickThing()) {
                    vac.pickThing();
                }
                vac.move();

                // vaccum will pick up "things" as it turns left at the end of a line
            }
            if (!vac.frontIsClear()) {
                if (vac.canPickThing()) {
                    vac.pickThing();
                }
                vac.turnLeft();

                // when the vaccum detects that the path is clear, it will proceed with the turn
            }
            if (vac.frontIsClear()) {
                vac.move();
                vac.turnLeft();
            }
        }

        // vaccum will head west until it encounters a wall
        while (vac.getDirection() != Direction.WEST) {
            vac.turnLeft();
        }
        while (vac.frontIsClear()) {
            vac.move();
        }

        // vaccum will head north until it encounters a wall
        while (vac.getDirection() != Direction.NORTH) {
            vac.turnRight();
        }
        while (vac.frontIsClear()) {
            vac.move();
        }

        // vaccum will turn east to return to it's original position
        while (vac.getDirection() != Direction.EAST) {
            vac.turnRight();
        }




    }
}
        
        