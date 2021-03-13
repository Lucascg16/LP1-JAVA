package aulas2906;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class ex2906P1 {
     public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        boolean achou = false;
        
        int[][] matriz = {{1,2,7},
                         {3,4,9},
                         {1,41,19}};
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero = ");
        int numero = scan.nextInt();
        
        for(int linhas = 0; linhas < 3; linhas++) {
            for(int colunas = 0 ; colunas < 3; colunas++) {
                //Verifica se o numero escolhido eh igual ao elemento da matriz
                if (numero == matriz[linhas][colunas]) {
                    System.out.println("Achei o elemento na linha = " + linhas + " coluna =" + colunas);
                    achou = true;
                }
            }
        }
        
        if (achou == false) {
            System.out.println("Não achei o elemento!!!");
        }
    }
}

