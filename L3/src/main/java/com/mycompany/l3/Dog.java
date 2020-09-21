/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.l3;

/**
 *
 * @author Maksim
 */
public abstract class Dog {
    protected double heightWithers;
    protected String name;
    
    public double getHeightWithers() { return heightWithers; }
    public String getName(){ return name; }
    
    abstract String voice();
}
