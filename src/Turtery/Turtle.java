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
public class Turtle {
    private Handler owner;

    public Handler getOwner() {
        return owner;
    }

    public void setOwner(Handler owner) {
        this.owner = owner;
    }
    public Factor cutenessFactor;
    public int size;
    public int bitePower;

    public Turtle(Handler owner, Factor cutenessFactor, int size, int bitePower) {
        this.owner = owner;
        this.cutenessFactor = cutenessFactor;
        this.size = size;
        this.bitePower = bitePower;
    }
    
    
    public Factor duel(Turtle turtle) throws NotSameAquariumException, MiniTurtleCannotFightException
    {
        if(this.owner != turtle.getOwner())
        {
            throw new NotSameAquariumException();
        }
        else
        {
            if(this.cutenessFactor.equals(Factor.ADORABLE) && !turtle.cutenessFactor.equals((Factor.ADORABLE)))
            {
                return this.cutenessFactor;
            }
            else if(!this.cutenessFactor.equals(Factor.ADORABLE) && turtle.cutenessFactor.equals((Factor.ADORABLE)))       
            {
                return turtle.cutenessFactor;
            }
            else if(this.cutenessFactor.equals(Factor.MENACING) && turtle.cutenessFactor.equals((Factor.SNAPPY)))
            {
                return this.cutenessFactor;
            }
            else if(this.cutenessFactor.equals(Factor.SNAPPY) && turtle.cutenessFactor.equals((Factor.MENACING)))
            {
                return turtle.cutenessFactor;
            }
            else if((this.bitePower + this.size) >= (turtle.bitePower + turtle.size))
            {
                return this.cutenessFactor;
            }
            else
            {
                return turtle.cutenessFactor;
            }
        }
    }
}
