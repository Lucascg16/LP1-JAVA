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
public class ex0106P1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantidade de aluminio comprado:");
        double qal = scan.nextDouble();
        
        System.out.println("Quantidade de cobre comprado: ");
        double qco = scan.nextDouble();
        
        double qto = qal + qco;
        //valor unitario de cada peça
        double valoral = 4;
        double valorco = 2;
        //a soma desse valor com a quantidade de peças compradas 
        double val = valoral * qal;
        double vco = valorco * qco;
        // aqui, soma os dois para calcular o desconto
        double vto = val + vco;
        System.out.println(vto);
        System.out.println("valor total das peças: " +vto );
        if (qto <5){
            System.out.println("valor total a pagar: "+ vto );
        }else if(qto > 5 && qto <= 15){
            double desc = vto * 0.9;
            System.out.println("valor total a pagar " + desc);
        }else if(qto > 16 && qto <= 20){
            double desc = vto * 0.85;
            System.out.println("valor total a pagar " + desc);        
        }else if(qto > 20){
            double desc = vto * 0.80;
            System.out.println("valor total a pagar " + desc);
    }
   
}
}