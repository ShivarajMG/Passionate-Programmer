package rev;

import java.util.Scanner;

public class Factorial_Of_A_Number {
    
        static int factorial(int n){    
         if (n == 0)    
           return 1;    
         else    
           return(n * factorial(n-1));    
        }    
        public static void main(String args[]){  
         int i,fact=1;
         System.out.println("Enter a Positive number");
         int number;//It is the number to calculate factorial 
         Scanner scan=new Scanner(System.in);
         number=scan.nextInt();
         fact = factorial(number);   
         System.out.println("Factorial of "+number+" is: "+fact);    
        }  
       }  


