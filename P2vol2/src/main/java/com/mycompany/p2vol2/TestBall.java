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
public class TestBall {
    public static void main (String[] args){
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.setXY(50, 50);
        System.out.println(b1);
        b1.move(50, 50);
        System.out.println(b1);
        
    }
}
