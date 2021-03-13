/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasFaesa.aulas0106;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ex0106P2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite I para indistrial, C para comercial e R para residencial.");
        System.out.println("Que tipo de consumidor voce e:");
        String type = scan.next();

        System.out.println("Quantidade de energia consumida:");
        double ener = scan.nextDouble();

        if (type.equalsIgnoreCase("I")) {
            double valor = 0.68 * ener + 34;
            System.out.println("Valor da conta: " + valor);
        } else if (type.equalsIgnoreCase("C")) {
            double valor = 0.37 * ener + 45;
            System.out.println("Valor da conta: " + valor);
        } else if (type.equalsIgnoreCase("R")) {
            double valor = 0.77 * ener - 22;
            System.out.println("Valor da conta: " + valor);
        }

    }
}
