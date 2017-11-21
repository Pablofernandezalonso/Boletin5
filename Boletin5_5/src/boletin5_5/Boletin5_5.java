/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_5;

/**
 *
 * @author Pablo
 */
public class Boletin5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumeroMaior obx1=new NumeroMaior();
        int num1=obx1.setNumero();
        int num2=obx1.setNumero();
        int num3=obx1.setNumero();
        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println("O número maior e "+num1);
            }    
        }
        if(num2>num1)
        {
            if(num2>num3)
            {
                System.out.println("O número maior e "+num2);
            }    
        }
        if(num3>num1)
        {
            if(num3>num2)
            {
                System.out.println("O número maior e "+num3);
            }    
        }
        else
        {
            System.out.println("Todos os numeros son iguais");    
        }
        
    }
    
}
