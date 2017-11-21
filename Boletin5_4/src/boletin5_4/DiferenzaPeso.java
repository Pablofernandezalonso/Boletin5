/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class DiferenzaPeso {
    
     Scanner sc= new Scanner(System.in);
    public Short pesoPablo(){
        System.out.println("Introduzca peso de Pablo");
        Short pesoP=sc.nextShort();
        return pesoP;
    }
    public Short pesoCarlos(){
        System.out.println("Introduzca peso de Carlos");
        Short pesoC=sc.nextShort();
        return pesoC;
    }
    
}
