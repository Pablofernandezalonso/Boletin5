/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

/**
 *
 * @author Pablo
 */
public class Boletin5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Signo numproba =new Signo();
        int num=numproba.setNumero();
        if(num>0)
        {
            System.out.println("O número é positivo: +");    
        }
        if(num<0)
        {
            System.out.println("O número é negativo: -");    
        }
        if(num==0)
        {
            System.out.println("O número é 0");    
        }
        
    }
    
}
