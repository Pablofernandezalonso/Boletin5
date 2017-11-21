/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;

/**
 *
 * @author Pablo
 */
public class Boletin5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       TipoProducto probanum = new TipoProducto();
       String nom = probanum.setNome();
       double ventas = probanum.setprezo();
       if(ventas<=100)
        {
            System.out.println("O producto "+nom+" é de consumo baixo");
        }
        if(ventas>100)
        {
            if(ventas<=500)
            {
                System.out.println("O producto "+nom+" é de consumo medio");
            }    
        }
        if(ventas>500)
        {
            if(ventas<=1000)
            {
                System.out.println("O producto "+nom+" é de consumo alto");
            }    
        }
        if(ventas>1000)
        {
            System.out.println("O producto "+nom+" é de primeira necesidade");    
        }
        
    }
    
}
