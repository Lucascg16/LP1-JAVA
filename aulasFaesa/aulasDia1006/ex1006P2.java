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
public class ex1006P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        double mediaSal = 0;
        
        for (int i = 1; i <= 5; i++){
            System.out.println("Digite o nome: ");
            String nome = scan.next();
            
            System.out.println("Salario do dia: ");
            double sal = scan.nextDouble();
            
            System.out.println("Dias trabalhados: ");
            int dia = scan.nextInt();
            
            double salt = sal * dia;
            
            System.out.println("Nome " + nome + " salario total: " + salt);
            mediaSal = mediaSal + salt;
        }
        mediaSal = mediaSal / 5;
        System.out.println("A media de salario e: "+mediaSal);
    }
            
}
