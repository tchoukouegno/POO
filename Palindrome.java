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
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        boolean result;
     int i ;
     System.out.println("entrez la longeur du mot");
     int n = sc.nextInt();
     result = true;
     i = 0;
     String tab[] = new String[n];
     while(i <= n){
         Scanner sf = new Scanner(System.in);
         System.out.println("entrez les letrres du mot");
          tab[i] = sf.nextLine();
         i = i+1;
     }
     while (result && i < 0);{
      if (tab[i] != tab[i-1-n]){
          result = false;
      }  
      i = i+1;
    }
     System.out.println(result);
    }
    
}
