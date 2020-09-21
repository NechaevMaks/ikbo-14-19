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
public class Corgi extends Dog{
    public Corgi(){
        heightWithers = 30.0;
        name = "NoName";
    }
    public Corgi(double height, String name){
        heightWithers = height;
        this.name = name;
    }
    
    @Override
    public String voice(){
        return "Uw";
    }
}
