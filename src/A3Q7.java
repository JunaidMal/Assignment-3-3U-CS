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
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new city called block
        City block = new City();
        
        // creating a new bot called bob
        RobotSE bob = new RobotSE(block, 3, 3, Direction.SOUTH);
        
        // creating 4 boxes
        new Wall(block, 1, 1, Direction.NORTH);
        new Wall(block, 1, 2, Direction.NORTH);
        new Wall(block, 1, 2, Direction.EAST);
        new Wall(block, 2, 2, Direction.EAST);
        new Wall(block, 1, 1, Direction.WEST);
        new Wall(block, 2, 1, Direction.WEST);
        new Wall(block, 2, 1, Direction.SOUTH);
        new Wall(block, 2, 2, Direction.SOUTH);
        
        new Wall(block, 1, 4, Direction.NORTH);
        new Wall(block, 1, 5, Direction.NORTH);
        new Wall(block, 1, 5, Direction.EAST);
        new Wall(block, 2, 5, Direction.EAST);
        new Wall(block, 1, 4, Direction.WEST);
        new Wall(block, 2, 4, Direction.WEST);
        new Wall(block, 2, 4, Direction.SOUTH);
        new Wall(block, 2, 5, Direction.SOUTH);
        
        new Wall(block, 4, 4, Direction.NORTH);
        new Wall(block, 4, 5, Direction.NORTH);
        new Wall(block, 4, 5, Direction.EAST);
        new Wall(block, 5, 5, Direction.EAST);
        new Wall(block, 4, 4, Direction.WEST);
        new Wall(block, 5, 4, Direction.WEST);
        new Wall(block, 5, 4, Direction.SOUTH);
        new Wall(block, 5, 5, Direction.SOUTH);
        
        new Wall(block, 4, 1, Direction.NORTH);
        new Wall(block, 4, 2, Direction.NORTH);
        new Wall(block, 4, 2, Direction.EAST);
        new Wall(block, 5, 2, Direction.EAST);
        new Wall(block, 4, 1, Direction.WEST);
        new Wall(block, 5, 1, Direction.WEST);
        new Wall(block, 5, 1, Direction.SOUTH);
        new Wall(block, 5, 2, Direction.SOUTH);
        
        // follow this sequence to cover all 4 large squares
        for(int i = 0; i < 4; i++) {
            
           // robot maneauvers around 3 sides of the square
           for(int a = 0; a < 3; a++) {
               bob.move();
               bob.move();
               bob.move();
               bob.turnLeft();
           }
           // move down to centre then loops back up to go around next square
           for(int c = 0; c < 3; c++) {
               bob.move();
           }
            
            
            
            
            
            
        }
        
    }
}
