/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Turtery;

/**
 *
 * @author I352015
 */
public class TurteryClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Handler A = new Handler("A");
        Handler B = new Handler("B");
        Turtle turtleA = new Turtle(A,Factor.ADORABLE,0,0);
        Turtle turtleB = new Turtle(B,Factor.MENACING,0,0);
        try
        {
            turtleA.duel(turtleB);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
