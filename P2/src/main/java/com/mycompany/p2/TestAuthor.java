/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2;

import java.util.Set;

/**
 *
 * @author Maksim
 */
public class TestAuthor {
    public static void main(String[] args){
        Author pavel = new Author("Pavel Colosov", "ColosovPavel75@mail.ru", 'm');
        System.out.println("Name: " + pavel.getName());
        System.out.println("Email: " + pavel.getEmail());
        System.out.println("Gender: " + pavel.getGender());
        System.out.println(pavel.toString());
        
        System.out.println("Меняем почту");
        pavel.setEmail("NewMуil" + pavel.getEmail());
        System.out.println(pavel.toString());
        
    }
}
