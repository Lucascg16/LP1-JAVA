package aulas2906;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class ex2906P2 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 34}, {23, 31, 3}, {21, 13, 45}};

        int valor = 0;
        for (int linhas = 0; linhas < 3; linhas++) {
            for (int colunas = 0; colunas < 3; colunas++) {
                if (valor < matriz[linhas][colunas]) {
                    valor = matriz[linhas][colunas];
                }
            }
        }
        System.out.println("O maior valor é = " + valor);
    }
}
