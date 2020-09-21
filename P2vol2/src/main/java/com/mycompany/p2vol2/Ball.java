/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2vol2;

/**
 *
 * @author Maksim
 */
public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    
    public Ball(double userX, double userY){
        x = userX;
        y = userY;
    }
    public Ball(){}
    
    public void setXY(double newX, double newY){
        x = newX;
        y = newY;
    }
    public void move(double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }
    
    public String toString(){
        return "Ball@(" + x + "," + y + ")";
    }
}
