/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasFaesa.aulasDia2005;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class exercicio2005P1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("write a number: ");
        int num1 = scan.nextInt();
        
        System.out.println("write another number : ");
        int num2 = scan.nextInt();
        
        int media = (num1 + num2)/2;
        System.out.println("the average between these numbers is: " + media);
    }
}
