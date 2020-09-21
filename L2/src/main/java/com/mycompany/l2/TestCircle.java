/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.l2;

/**
 *
 * @author Maksim
 */
public class TestCircle {
    public static void main(String[] args){
        Circle cir = new Circle();
        System.out.println("R: " + cir.getRadius() + "\nC: " + cir.getColor());
        
        cir.setRadius(50);
        cir.setColor("yellow");
        System.out.println("ПОСЛЕ ИЗМЕНЕНИЯ ЗНАЧЕНИЙ\nR: " + cir.getRadius() + "\nC: " + cir.getColor());
    }
}
