/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Turtery;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author I352015
 */
public class Handler {
    private String name;
    public List<Turtle> listOfTurtle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Handler(String name)
    {
        this.name = name;
        listOfTurtle = new ArrayList<Turtle>();
    }
}
