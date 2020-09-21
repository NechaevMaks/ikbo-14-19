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
public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        width = side;
        length = side;
    }
    public Square(double side, String color, boolean filled){
        this.setWidth(side);
        this.setLength(side);
        this.setColor(color);
        this.setFilled(filled);
    }
    
    public double getSide(){ return this.getWidth(); }
    public void setSide(double side){
        this.width = side;
        this.length= side;
    }
    
    @Override
    public void setWidth(double width){ this.setSide(width); }
    @Override 
    public void setLength(double length){ this.setSide(length); }
    
    @Override
    public String toString(){
       return  "Side: "     + this.width     + "\n" +
               "Color: "    + this.color     + "\n" +
               "Filled: "   + this.filled    + "\n" +
               "Area: "     + this.getArea() + "\n" +
               "Perimeter: " + this.getPerimeter() + "\n";
    }
    
}
