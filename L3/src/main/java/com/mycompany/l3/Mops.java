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
public class Mops extends Dog{
    public Mops(){
        heightWithers = 30.0;
        name = "NoName";
    }
    
    public Mops(double height, String name){
        heightWithers = height;
        this.name = name;
    }
    
    @Override
    public String voice(){
        return "tow";
    }
    
    public String grunt(){
        return "hrr-hrr";
    }
    public String sniff(){
        return "chhr-chr";
    }
}
