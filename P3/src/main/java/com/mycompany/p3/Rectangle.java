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
public class Rectangle extends Shape{
    protected double width = 0.0;
    protected double length = 0.0;
    
    public Rectangle(){};
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    
    public double getWidth(){ return this.width; }
    public double getLength(){ return this.length; }
    
    public void setWidth(double width){ this.width = width; }
    public void setLength(double length){ this.length = length; }
    
   
    public double getArea() { return this.width * this.length; }
    
    public double getPerimeter() { return (this.width + this.length) * 2; }

    public String toString(){
        return  "Width: "   + this.width    + "\n" +
                "Length: "  + this.length   + "\n" +
                "Color: "   + this.color    + "\n" +
                "Filled: "  + this.filled   + "\n" +
                "Area: "    + this.getArea()    + "\n" +
                "Perimeter: " + this.getPerimeter() + "\n";
    }
}
