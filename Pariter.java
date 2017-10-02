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
public class Pariter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez un nombre");
        int str = sc.nextInt();
         
         if (str % 2 == 0) {
     System.out.println("paire");  } ;
        if (str % 2 !=0) {
     System.out.println("impaire");
        } 
    }
}
