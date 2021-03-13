/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasFaesa.aulasDia1506;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ex1506P1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o tamanho do vetor: ");
        int vet = scan.nextInt();
        int[] vetor = new int[vet];
        int valor = 0;
        
        for(int j = 0; j < vet; j++){
            System.out.println("Digite o valor do vetor na posição "+ j + " = ");
            valor = scan.nextInt();
            vetor[j] = valor;
        }
        for (int i = 0; i < vet; i++){
            System.out.println("O valor do vetor "+ i + " = "+ vetor[i]);
        }
    }
}
