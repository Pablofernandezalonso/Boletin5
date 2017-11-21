/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class TipoProducto {
    
   Scanner sc=new Scanner(System.in);
   
   public String setNome(){
       System.out.println("Introduza o nome do producto");
       String nom=sc.nextLine();
       return nom;
   }
   public double setprezo(){
       System.out.println("Introduza as ventas anuais do producto");
       double ventas=sc.nextDouble();
       return ventas;
   }
    
}
