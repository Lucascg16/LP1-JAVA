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
public class exercicio2005P3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("A quantidade de hamburger: ");
        double h = scan.nextDouble();
        System.out.println("A quandtidade de cheeaseburger: ");
        double ch = scan.nextDouble();
        System.out.println("A quantidade de fritas: ");
        double f = scan.nextDouble();
        System.out.println("A quantidade de refri: ");
        double r = scan.nextDouble();
        System.out.println("A quantidade de milkshake: ");
        double m = scan.nextDouble();
        
        double valorh = 3;
        double valorch = 2.50;
        double valorf = 2.50;
        double valorr = 1;
        double valorm = 3;
        
        double conta = (valorh + h) + (valorch + ch) + (valorf + f) + (valorr + r) + (valorm + m);
        System.out.println("total a pagar: " + conta);
    }
}
