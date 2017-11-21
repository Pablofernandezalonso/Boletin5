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
public class SuperficieFiguras {
    
     public void calcular (int calcsup){
       
         Scanner sc=new Scanner(System.in);
       
         switch(calcsup){
            case 1: 
                System.out.println("Introduza o valor do lado");
                int lado=sc.nextInt();
                System.out.println("Area do cadrado "+lado*lado);
                break;
            case 2:
                System.out.println("Introduza o valor da base");
                int base=sc.nextInt();
                System.out.println("Introduza o valor da altura");
                int altura=sc.nextInt();
                System.out.println("Area do triangulo "+base*altura/2);
                break;
            case 3:
                System.out.println("Introduza o valor do radio");
                int radio=sc.nextInt();
                System.out.println("Area do círculo "+Math.PI*(radio*radio));
                break;
        }
    
    }
}