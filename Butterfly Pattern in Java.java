// Coded by Suparna Das.

// Program to make a Butterfly Pattern using Java.

// Thanks for Watching

import java.util.*;

public class Main {
  public static void main(String args[]) {
    int number=10;
    
    //1st half of the diagram
    
    for(int i=1; i<=number ; i++){
    
        for(int j=1 ; j<=i; j++){
            System.out.print("1");
       }
       
           
    int spaces = 2 *(number-i);
    
    for(int j=1; j<= spaces; j++){
            System.out.print(" ");
        }
        
    for(int j=1; j<=i; j++){
        System.out.print("1");
        }
        
        System.out.println();
        
    }
    
    
    //2nd half of the diagram
    
    
     for(int i=number; i>=1 ; i--){
    
    for(int j=1 ; j<=i; j++){
            System.out.print("1");
       }
       
           
    int spaces = 2 *(number-i);
    
    for(int j=1; j<= spaces; j++){
            System.out.print(" ");
        }
        
    for(int j=1; j<=i; j++){
        System.out.print("1");
        }
        
        System.out.println();
        
    }
    
    
  }
}
