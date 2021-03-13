
import java.util.Scanner;

public class provaC3LuasGiacominQuestão1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[6];
        int valor = 0;
        int count = 0;

        for (int j = 0; j < 6; j++) {
            System.out.println("Digite o valor do vetor na posicao " + j + " = ");
            valor = scan.nextInt();
            vetor[j] = valor;
        }
        System.out.println("Digite um numero que esta dentro do Vetor: ");
        int arra = scan.nextInt();

        for (int i = 0; i < 6; i++) {
            if (vetor[i] == arra) {
                count = count + 1;
                System.out.println("O valor " + arra + " aparece na posicao " + i);
            }

        }
        System.out.println("O valor " + arra + " foi encontrado no vetor " + count + " vezes.");
    }

}
