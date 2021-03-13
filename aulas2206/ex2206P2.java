package aulas2206;

import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class ex2206P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int[] vet = new int[5];
        int media = 0;
        int menor = 0, maior = 0;
                
        for(int i = 0;i < 5;i++){
            System.out.println("Digite o valor dos vetores: ");
             int valor = scan.nextInt();
            vet[i] = valor;
        }
        for (int i = 0;i < 5;i++){
            media = media + vet[i];
        }
        media = media/5;
        
        menor = vet[0];
        for (int i = 0;i<5;i++){
            if(vet[i] < menor){
                menor = vet[i];
            }
        }
        for (int i = 0;i < 5;i++){
            if (vet[i] > maior){
                maior = vet[i];
            }
        }
        System.out.println("A media dos valores do vetor "+media);
        System.out.println("Menor valor do vetor "+menor);
        System.out.println("Maior valor do vetor "+maior);
    }
}
