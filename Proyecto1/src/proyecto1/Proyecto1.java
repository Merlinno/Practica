/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String cadena;
       int count=0;
       Scanner sc=new Scanner (System.in);
       
       System.out.println("anota una cadena");
       cadena=sc.nextLine();   
       cadena=cadena.toUpperCase();
       System.out.println("anota una letra");
       char letra=sc.nextLine().charAt(0); 
       letra=Character.toUpperCase(letra);
       
           for(int i=0;i<cadena.length();i++){
               if(cadena.charAt(i)==letra){
                   count++;
               }
               
           }
       System.out.println("se ha repitido " + count + " veces la letra: " + letra);
           
           
   }
       
    }
    
    

