/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasFaesa.aulasDia2505;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ex2505P1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        int n1 = scan.nextInt();
        
        if(n1 == 5){
            System.out.println("Voce digitou o numero certo!!!");
        }else{
            System.out.println("erro 404:Numero nao encontrado");
        }
    }
}
