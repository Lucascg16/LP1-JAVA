package aulas1706;


import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ex1706P1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean achou = false;
        int[] vetor = new int[5];
        int valor = 0;
        int count = 0;
        
        for(int j = 0; j < 5; j++){
            System.out.println("Digite o valor do vetor na posição "+ j + " = ");
            valor = scan.nextInt();
            vetor[j] = valor;
        }
        System.out.println("Digite um numero que esta dentro do array: ");
        int arra = scan.nextInt();
        
        for(int i = 0; i < arra; i++){
            if(vetor[i] == arra){
               count = count + 1;
            }
        }
            System.out.println("O valor "+valor+" foi encontrado no vetor "+ count +"vezes");
    }
}

