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
public class ex2505P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a sua temperatura:");
        double temp = scan.nextDouble();
        
        System.out.println("Digite a sua taxa de oxigenio:");
        double oxi = scan.nextDouble();
        
        if (temp >= 39 && oxi <= 80){
            System.out.println("paciente deverar ser internado!!");
        }else {
            System.out.println("paciente poderar ser liberado");
        }
    }
}
