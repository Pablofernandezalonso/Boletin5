/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

/**
 *
 * @author Pablo
 */
public class Boletin5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Numero numproba =new Numero();
        int n=numproba.setNumero();
        if(n>=0)
        {
            System.out.println("O número "+n+" é positivo");   
        }
        
    }
    
}
