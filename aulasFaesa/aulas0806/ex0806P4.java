/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasFaesa.aulas0806;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ex0806P4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("digite um numero positivo: ");
        double n = scan.nextDouble();
        double f = n;
        
        if (n<=0){
            System.out.println("Numero invalido");
        }
        else {
            while (n>1){
            f=f * (n - 1);
            n--;
        }
            System.out.println(f);
        }
        
        
    }
}
