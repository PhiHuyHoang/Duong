/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Turtery;

import Exceptions.MiniTurtleCannotFightException;
import Exceptions.NotSameAquariumException;

/**
 *
 * @author I352015
 */
public class MiniTurtle extends Turtle {
    private int age;

    public MiniTurtle(Handler owner, Factor cutenessFactor, int size, int bitePower) {
        super(owner, cutenessFactor, size, bitePower);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public int mature()
    {
       return 5 - this.age;
    }
    
    /**
     *
     * @param turtle
     * @return
     * @throws MiniTurtleCannotFightException
     */
    @Override
    public Factor duel(Turtle turtle) throws MiniTurtleCannotFightException, NotSameAquariumException
    {
        if(this.mature() != 0)
        {
            throw new MiniTurtleCannotFightException();
        }
        else
        {
            return turtle.duel(this);
        }
    }
}
