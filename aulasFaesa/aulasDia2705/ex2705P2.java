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
public class ex2705P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu salario:");
        double sal = scan.nextDouble();
        
        if(sal <= 1372.81){
          System.out.println("Salario liquido: "+sal    );
        }else if (sal >= 1372.81 && sal <=2743.25){
            double im = sal * 0.15;
            double newsal = sal - im;
            System.out.println("Salario liquido: "+newsal);
        }else if(sal > 2743.25){
            double im = sal * 0.275;
            double newsal = sal - im;
            System.out.println("Salario liquido: "+newsal);
        }
    }
}
