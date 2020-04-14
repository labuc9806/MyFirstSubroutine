/*
 * Launa Bucher-Austin
 * This program will present the user with the option of performing 5 different math operations or exiting the program. 
 * April 14 2020
 */
package myfirstsubroutine;

import java.util.Scanner;

/**
 *
 * @author launa
 */
public class MyFirstSubroutine {

    /**
     * @param n1
     * @param n2
     */
    
    public static void Areaofsquare (int n1, int n2)
    {
        int area = n1*n2;
        System.out.println("The area is "+ area);
    }
    
    public static void Speed (int n1, int n2)
    {
        int speed = n1/n2;
        System.out.println("The speed is "+speed);
    }
    
    public static void Areaoftriangle (int n1, int n2)
    {
        int area = n1*n2/2;
        System.out.println("the area is "+ area);
    }
    
    public static void Average (int n1, int n2)
    {
        int average = n1+n2;
        average = average/2;
        System.out.println("the average is :"+average);
    }
    
    public static void Acceleration (int n1, int n2)
    {
        int acceleration = n1/n2;
        System.out.println("the acceleration is : "+acceleration);
    }
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in) ;
        int response;
        System.out.println("Please choose an option :");
        System.out.println("1. Find the area of square");
        System.out.println("2. Find the speed of an object");
        System.out.println("3. Find the area of a triangle");
        System.out.println("4. Find the average of two numbers");
        System.out.println("5. Find the acceleration of an object");
        System.out.println("6. Exit");
        
        System.out.println("Pick option :");
        response = keyedInput.nextInt();
        
        if (response == 1)
        {
            System.out.println("Enter square's length : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter square's height : ");
            int num2 = keyedInput.nextInt();
            Areaofsquare (num1,num2);
        }
        
        if (response == 2)
        {
            System.out.println("Enter Distance : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter time : ");
            int num2 = keyedInput.nextInt();
            Speed (num1, num2);
        }
        
        if (response == 3)
        {
            System.out.println("Enter the triangle's base : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter the triangle's height : ");
            int num2 = keyedInput.nextInt();
            Areaoftriangle (num1, num2);
            
        }
        
        if (response == 4)
        {
            System.out.println("Enter a number : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter a second number :");
            int num2 = keyedInput.nextInt();
            Average (num1, num2);
            
        }
        
        if (response == 5)
        {
            System.out.println("Enter velocity : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter time : ");
            int num2 = keyedInput.nextInt();
            Acceleration (num1, num2);
        }
        if (response == 6)
        {
            System.out.println("Goodbye!");
        }
       
    }
    
}
