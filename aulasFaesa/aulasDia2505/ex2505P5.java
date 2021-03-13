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
public class ex2505P5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o seu nome:");
        String nome1 = scan.next();
        System.out.println("digite sua idade:");
        int idade1 = scan.nextInt();
        
        System.out.println("Digite o nome de outra pessoa:");
        String nome2 = scan.next();
        System.out.println("Digite sua idade:");
        int idade2 = scan.nextInt();
        
        int ano1 = 2020 - idade1;//calculo a idade das duas pessoas 
        int ano2 = 2020 - idade2;
       
        if(idade1 > idade2){
            System.out.println("A pessoa mais nova e "+nome2+" e ele nasceu em "+ano2);
        }else if(idade1 < idade2){
            System.out.println("A pessoa mais nova e "+nome1+" e ela nasceu em "+ano1);
        }
        
        
    }
}
