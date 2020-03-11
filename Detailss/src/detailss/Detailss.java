/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detailss;

import java.util.Scanner;


public class Detailss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner input= new Scanner (System.in);//only once
      System.out.print("What is your name?");
      String yourname = input.next();
      
      System.out.print("When were you born?");
      int yearborn= input.nextInt();
      
      System.out.print("Current year ");
      int currentyear= input.nextInt();
      
      System.out.println("your name is "+yourname+"and your age is "+ (currentyear-yearborn));
     
   
    }    
}
