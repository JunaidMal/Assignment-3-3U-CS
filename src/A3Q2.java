
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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new city called kw
        City kw = new City();
        // creating a robot called karel
        Robot karel = new Robot(kw, 0, 3, Direction.WEST);
        
        // creating the walls
       new Wall(kw, 1, 2, Direction.NORTH); 
       new Wall(kw, 1, 1, Direction.NORTH); 
       new Wall(kw, 1, 1, Direction.WEST);  
       new Wall(kw, 2, 1, Direction.WEST);  
       new Wall(kw, 1, 2, Direction.EAST);  
       new Wall(kw, 2, 2, Direction.EAST);  
       new Wall(kw, 2, 2, Direction.SOUTH); 
       new Wall(kw, 2, 1, Direction.SOUTH); 
       
      
       // karel moves around the box 2 times by adding 1 to i every side it moves across
      for(int i = 0; i < 8; i++) {
           karel.move();
           karel.move();
           karel.move();
           karel.turnLeft();
          
           
           }
       }
    }

