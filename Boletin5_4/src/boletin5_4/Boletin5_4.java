/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

/**
 *
 * @author Pablo
 */
public class Boletin5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom1="Maria";
        String nom2="Juan";
        DiferenzaPeso Pablo = new DiferenzaPeso();
        DiferenzaPeso Carlos = new DiferenzaPeso();
        Short pesoP=Pablo.pesoPablo();
        Short pesoC=Carlos.pesoCarlos();
        if(pesoP>pesoC)
        {
            System.out.println("Peso de Pablo "+pesoP+" Kg, "+(pesoP-pesoC)+" Kg mas que Carlos");
        }
        else
        {
            System.out.println("Carlos pesa "+pesoC+" Kg, "+(pesoC-pesoP)+" Kg mas que Pablo");
        }
    }
    
}
