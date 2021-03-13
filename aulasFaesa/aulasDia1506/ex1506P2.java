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
public class ex1506P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean achou = false;
        System.out.println("Digite o tamanho do vetor: ");
        int vet= scan.nextInt();
        int[] vetor = new int[vet];
        int valor = 0;
        
        for(int j = 0; j < vet; j++){
            System.out.println("Digite o valor do vetor na posição "+ j + " = ");
            valor = scan.nextInt();
            vetor[j] = valor;
        }
        System.out.println("Digite um numero que esta dentro do array: ");
        int arra = scan.nextInt();
        
        for(int i = 0; i < arra; i++){
            if(vetor[i] == arra){
                System.out.println("Achou o numero = " + valor + " na posicao = "+ i);
                achou = true;
            }
            
            }
                if(achou == false){
                System.out.println("O elemento "+ arra + "nao exixte no vetor");
        }
    }
}
