/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2;

/**
 *
 * @author Maksim
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
    public Author(String n, String m, char g){
        name = n;
        email = m;
        gender = g;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public char getGender(){
        return gender;
    }
    
    public void setEmail(String newEmail){
        email = newEmail;
    }
    
    public String toString(){
        return name + " (" + gender + ") at " + email; 
    }
}
