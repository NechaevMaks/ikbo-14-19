/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author student
 */
public class Ball {
    private double radius;
    private boolean inflated;
    
    public Ball(){
        radius = 5.0;
        inflated = true;
    }
    public Ball(double r){
        radius = r;
        inflated = true;
    }
    public Ball(double r, boolean i){
        radius = r;
        inflated = i;
    }
    
    public double getRadius(){
        return radius;
    }
    public boolean getInflated(){
        return inflated;
    }
    
    public void inflate(){
        inflated = true;
    }
    public void blowOff(){
        inflated = false;
    }
}
