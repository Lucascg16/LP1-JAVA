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
public class ex0806p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite um numero positivo: ");
        int n = scan.nextInt();
        
        int soma = 0;
        int i = 0;
        
        while (i <= n){
            soma = soma + i;
            i++;
        }
        System.out.println("soma e = "+soma);
    }
}
