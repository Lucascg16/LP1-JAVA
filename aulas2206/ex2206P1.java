package aulas2206;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ex2206P1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho dos vetores: ");
        int num = scan.nextInt();

        int[] vet = new int[num];
        int[] array = new int[num];
        int[] soma = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Digite o valor da variavel do vetor: ");
            int valor = scan.nextInt();
            vet[i] = valor;
        }
        for (int i = 0; i < num; i++) {
            System.out.println("Digite o valor das variaveis do array: ");
            int valor = scan.nextInt();
            array[i] = valor;
        }
        for (int i = 0; i < num; i++) {
            soma[i] = vet[i] + array[i];
            System.out.println("A soma dos vetores e " + soma[i]);
        }
    }
}
