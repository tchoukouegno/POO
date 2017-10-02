/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pariter;

import java.util.Scanner;

/**
 *
 * @author kanardo
 */
public class factoriel {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("entrez un nombre");
       int x = sc.nextInt();
       
      if (x == 0) {
          System.out.println("le factoriel est 1");
      }  
      int i = x-1;
      while ( i != 0) {
    x = x * i;
    i = i-1;
   }
    System.out.println("le factoriel de x est " + x);
    
}
}