/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.util.Scanner;

/**
 *
 * @author Chiques
 */
public class Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("INGRESE DOS NÚMEROS");
        int num=leer.nextInt();
        int num2=leer.nextInt();
        int suma=num+num2;
        System.out.println(num + "+" + num2 + "=" + suma);
    }
    
}
