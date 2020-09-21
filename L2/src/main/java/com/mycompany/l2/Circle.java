/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.l2;
import java.math.*;
/**
 *
 * @author Maksim
 */
public class Circle {
    private double radius = 0.0;
    private String color = "wite";
    
    public Circle(){};
    public Circle(double radius){ this.radius = radius; }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    //====GET=====
    public double getRadius(){ return this.radius; }
    public String getColor(){ return this.color; }
    
    //-----SET------
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
}
