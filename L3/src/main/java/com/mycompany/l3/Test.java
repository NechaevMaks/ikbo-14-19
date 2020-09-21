/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.l3;

/**
 *
 * @author Maksim
 */
public class Test {
    public static void main(String[] args){
        Corgi corg = new Corgi(29.5, "Bublic");
        System.out.println("<<CORGI>>\nName: " + corg.getName() +
                "\nHeight withers: " + corg.getHeightWithers() +
                "\n" + corg.voice());
        
        Mops mop = new Mops(28.0, "Krendelec");
        System.out.println("<<MOPS>>\nName: " + mop.getName() +
                "\nHeight withers: " + mop.getHeightWithers() +
                "\n" + mop.voice() + " " + mop.grunt() + " " + mop.sniff());
    }
}
