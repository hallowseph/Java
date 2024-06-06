/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pathfinder;

import java.util.Arrays;

/**
 *
 * @author josep
 */
public class PathFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]adjacencyMatrix = {{0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0}};
        PathFinder pf = new PathFinder(adjacencyMatrix);
        String shortestPath = pf.findPath(2, 6);
        System.out.println(Arrays.toString(pf.previousVertex));
        System.out.println(shortestPath);
        }
    }
    
}
