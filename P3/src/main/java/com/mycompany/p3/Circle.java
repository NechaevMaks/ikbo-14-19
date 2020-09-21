/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p3;
import java.math.*;
/**
 *
 * @author Maksim
 */
public class Circle extends Shape{
    protected double radius;
    
    
    //--------CONSTRUCTORS----------
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        this.radius = radius; 
        this.color = color;
        this.filled = filled;
    }
    
    //-----------RADIUS--------
    public double getRadius(){ return this.radius; }
    public void setRadius(double radius){ this.radius = radius; }
    
    //---------GET---------

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter(){
        return 2.0 * this.radius * Math.PI;
    }

    public String toString(){
        return "Radius: "       + this.radius           + "\n" +
                "Color: "       + this.color            + "\n" +
                "Filled: "      + this.filled           + "\n" +
                "Area: "        + this.getArea()        + "\n" +
                "Perimeter: "   + this.getPerimeter()   + "\n";
    }
}
