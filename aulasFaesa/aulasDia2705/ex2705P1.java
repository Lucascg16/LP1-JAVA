/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasFaesa.aulasDia2705;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ex2705P1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nome = scan.next();
        
        System.out.println("Digite a primeira nota:");
        double n1 =  scan.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        double n2 = scan.nextDouble();
        
        double media = (n1+n2)/2;
        System.out.println("Aluno: "+nome+", media: "+media);
        
        if(media < 5 ){
            System.out.println("Reprovado");
        }else if(media >5 && media < 7 ){
            System.out.println("Recuperação");
        }else if (media > 7){
            System.out.println("Aprovado");
        }
    }
}
