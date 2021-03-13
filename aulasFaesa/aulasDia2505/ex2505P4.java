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
public class ex2505P4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite um numero de 1 a 3:");
        int num = scan.nextInt();
        
        if (num == 1){
            System.out.println("voce digitou 1.");
        }else if(num == 2){
            System.out.println("voce digitou 2.");
        }else if(num == 3){
            System.out.println("vode digitou 3.");
        }else{
            System.out.println("numero invalido");
        }
    }
}
