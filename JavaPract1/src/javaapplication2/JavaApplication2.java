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


public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //-----------------DOG-----------------
        System.out.print("<<DOG>>\n");
        Dog dog1 = new Dog("Rax", 1);
        System.out.print("Name dog: " + dog1.getName() + "\nAge dog: " + dog1.getAge() + "\n\n");
        
        Dog dog2 = new Dog("Keks");
        System.out.print("Name dog: " + dog2.getName() + "\nAge dog: " + dog2.getAge() + "\n\n");
        
        Dog dog3 = new Dog();
        System.out.print("Name dog: " + dog3.getName() + "\nAge dog: " + dog3.getAge() + "\n\n");
        
        
        //-----------------BALL-----------------
        System.out.print("<<BALL>>\n");
        Ball ballOne = new Ball();
        System.out.print("Radius " + ballOne.getRadius() + "\nInflated: " + ballOne.getInflated() + "\n\n");
        
        Ball ballTwo = new Ball(10.0);
        System.out.print("Radius " + ballTwo.getRadius() + "\nInflated: " + ballTwo.getInflated() + "\n\n");
        
        Ball ballThree = new Ball(15.0, false);
        System.out.print("Radius " + ballThree.getRadius() + "\nInflated: " + ballThree.getInflated() + "\n\n");
        
        
        //-----------------BOOK-----------------
        System.out.print("<<BOOK>>\n");
        
        Book book1 = new Book("origName");
        System.out.print("Name " + book1.getName() + "\nPage: " + book1.getNumPage() + "\n\n");
        
        Book book2 = new Book("megaOrigName", 365);
        System.out.print("Name " + book2.getName() + "\nPage: " + book2.getNumPage() + "\n\n");
    }
    
}
