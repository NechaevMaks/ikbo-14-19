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
public class Dog {
    private String name;
    private int age;
    
    public Dog (){
        name = "Ein";
        age = 0;
    }
    public Dog (String usName){
        name = usName;
        age = 0;
    }
    public Dog (String usName, int usAge){
        name = usName;
        age = usAge;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
}
