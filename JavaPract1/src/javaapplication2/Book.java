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
public class Book {
    private String name;
    private int numPage;
    
    public Book(String n){
        name = n;
        numPage = 100;
    }
    public Book(String n, int p){
        name = n;
        numPage = p;
    }
    
    public String getName(){
        return name;
    }
    public int getNumPage(){
        return numPage;
    }
}
