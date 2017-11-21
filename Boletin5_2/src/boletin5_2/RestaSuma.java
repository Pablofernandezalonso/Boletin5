/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class RestaSuma {
    
    Scanner sc=new Scanner(System.in);
    public short setPrimeiroNum(){
        System.out.println("Introduza o primeiro número");
        short num1=sc.nextShort();
        return num1;
    }
    public short setSegundoNum(){
        System.out.println("Introduza o segundo número");
        short num1=sc.nextShort();
        return num1;
    }
    
}
