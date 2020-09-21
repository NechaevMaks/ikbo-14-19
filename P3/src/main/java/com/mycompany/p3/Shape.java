/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p3;

/**
 *
 * @author Maksim
 */
public abstract class Shape {
    protected String color;
    protected boolean filled;
    
    //----------COLOR--------
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    //---------FILLED----------
    public boolean isFilled(){
        return this.filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    
    //-----ABSTRACT_METHOD-----
    abstract double getArea();
    abstract double getPerimeter();          
}
