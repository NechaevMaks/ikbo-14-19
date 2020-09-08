/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

/**
 *
 * @author Maksim
 */
//import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class main {
    public static int fact(int n){
        int res = 1;
        for(int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }
    
    public static void main(String[] args){
        Random rand = new Random();
        
        
        System.out.println("<<ВЫВОД СОДЕРЖИМОГО МАССИВА С ИСПОЛЬЗОВАНИЕМ ЦИКЛА>>");
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }  
        
        System.out.println("Цикл FOR");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
         System.out.print("\n");
        
        System.out.println("Цикл WHILE");
        {
            int i = 0;
            while(i < arr.length){
                System.out.print(arr[i] + " ");
                i++;
            }
        }
        System.out.print("\n");
        
        System.out.println("Цикл DO_WHILE");
        {
            int i = 0;
            do{
                System.out.print(arr[i] + " ");
                i++;
            }while(i < arr.length);
        }
        System.out.print("\n\n\n");
        
        
        System.out.println("<<ВЫВОД АРГУМЕНТОВ КОМАНДНОЙ СТРОКИ>>");
        for(int i = 0; i < args.length; i++){
            System.out.print(args[i]);
        }
        System.out.print("\n\n\n");
        
        
        System.out.println("<<ВЫВОД ПЕРВЫХ 10 ЧИСЕЛ ГАРМОНИЧЕСКОГО РЯДА>>");
        for(int i = 1; i <= 10; i++){
            System.out.println(i + ") " + 1.0/i + " ");
        }
        System.out.print("\n\n\n");
        
        
        System.out.println("<<ГЕНЕРАЦИЯ И СОРТИРОВКА МАССИВА>>");
        int[] mas = new int[10];
        for(int i = 0; i < mas.length; i++){
            mas[i] = rand.nextInt(100);
            System.out.print(mas[i] + " ");
        }
        Arrays.sort(mas);
        System.out.println("");
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.print("\n\n\n");
        
        
        System.out.println("<<ФАКТОРИАЛ>>");
        System.out.println("1! = " + fact(1));
        System.out.println("3! = " + fact(3));
        System.out.println("5! = " + fact(5));
        System.out.println("8! = " + fact(8));
    }
}
