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
public class ex1506P0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o tamanho do array: ");
        int vet = scan.nextInt();
        //Inicia o array com o valor scaniado acima
        int[] vetor = new int[vet];
        //um valor iniciado como 0 para ser usado para colocar os valores no vetor
        int valor = 0;
        //for para adicionar os valores
        for(int j=0; j < vet; j++){
            System.out.println("Digite o valor dos array:");
            valor = scan.nextInt();
            vetor[j] = valor;
        }
        //mostrar os arrays
        for(int i = 0; i < vetor.length; i++){
            System.out.println("valor dos vetores: "+ vetor[i]);
        }
    }
}

