package aulas1706;

import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class ex1706P4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int[] vet = new int[5];
        int valor = 0;
        
        for(int i = 0;i < 5;i++){
            System.out.println("Digite o numero do vetor: ");
            valor = scan.nextInt();
            vet[i] = valor;
        }
        int countp = 0; int counti = 0;
        for(int j = 0;j < 5;j++){
            if(vet[j]%2 == 0){
                countp = countp + 1;
                System.out.println("Numero par no vetor: "+ vet[j]);
            }else{
                counti = counti + 1;
                System.out.println("Numero impare no vetor: "+vet[j]);
            }
        }
            System.out.println("Numeros pares: "+countp);
            System.out.println("Numeros impares: "+counti);
        
    }
}
