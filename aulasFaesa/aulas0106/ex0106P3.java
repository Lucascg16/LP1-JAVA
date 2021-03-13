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
public class ex0106P3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triangulo: ");
        int l1 = scan.nextInt();
        System.out.println("Digite o segundo lado do triagulo: ");
        int l2 = scan.nextInt();
        System.out.println("Digite o terceiro lado do triangulo: ");
        int l3 = scan.nextInt();

        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
            System.out.println("Triangulo possivel.");
            if (l1 == l2 && l2 == l3) {
                System.out.println("Triangulo equilatero.");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Triangulo isosceles.");
            } else {
                System.out.println("Triangulo escaleno.");
            }
        } else {
            System.out.println("O triangulo digitado nao e possivel.");
        }
    }
}
