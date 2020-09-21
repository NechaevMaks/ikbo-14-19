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
public class Test {
    public static void main(String[] args){
        System.out.println("<<CIRCLE>>");
        Circle cir = new Circle(50.0, "red", true);
        System.out.println(cir);
        
        System.out.println("<<RECTANGLE>>");
        Rectangle rec = new Rectangle(10.0, 15.0, "blue", false);
        System.out.println(rec);
        
        System.out.println("<<SQUARE>>");
        Square squ = new Square(20.0, "green", false);
        System.out.println(squ);
        
    }
}
