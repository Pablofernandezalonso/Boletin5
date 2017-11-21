/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_7;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Boletin5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SuperficieFiguras obx1=new SuperficieFiguras();
        System.out.println("*** Menu***\n1...Cuadrado\n2...Triangulo\n3...Circulo");
        int calcsup=sc.nextInt();
        obx1.calcular(calcsup);
        
    }
    
}
