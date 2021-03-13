package aulas1706;


import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ex1706P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int[] vet = new int[5];
        int valor = 0;
        System.out.println("Digite 5 numeros interos:");
        for (int i = 0;i <5;i++){
            System.out.println("Digite 0 numeros : ");
            valor = scan.nextInt();
            vet[i] = valor;
        }
        int count = 0;
        for (int j = 0;j < 5;j++){
            System.out.println("Valor do vetor = "+vet[j]);
            
            if(vet[j] < 0){
             count = count + 1;
            }
        }
        System.out.println("Numero negativos no vetor =" +count);
    }
}
