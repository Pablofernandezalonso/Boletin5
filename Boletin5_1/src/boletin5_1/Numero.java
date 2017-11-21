/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Numero {
    
    Scanner sc = new Scanner(System.in);
    
    public int setNumero(){
        
        System.out.println("Introduzca un numero");
        int n=sc.nextInt();
        return n;
    }
    
}
