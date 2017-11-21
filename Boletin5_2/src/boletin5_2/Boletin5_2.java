/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;

/**
 *
 * @author Pablo
 */
public class Boletin5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RestaSuma primeironum= new RestaSuma();
        RestaSuma segundonum= new RestaSuma();
        short num1=primeironum.setPrimeiroNum();
        short num2=segundonum.setSegundoNum();
        if (num1>=num2)
        {
            System.out.println("O resultado da resta é "+(num1-num2));
        }
        else
        {
            System.out.println("O resultado da suma é "+num1+num2);    
        }
        
    }
    
}
