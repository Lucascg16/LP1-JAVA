/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasFaesa.aulasDia1006;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ex1006P1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite um numero positivo: ");
        int num = scan.nextInt();
        
        /*while(num >= 1){
            num--;
            if (num %2 == 0){
                System.out.println("Numeros pares: "+ num);
            }
            else {
                
            }*/
        for (int i = 1;i <= num; i++){
            if (i %2 == 0){
                System.out.println("Numeros pares: "+ i);
            }
        }
    }
}
