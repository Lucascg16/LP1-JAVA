import java.util.Scanner;
public class provaC3LucasGiacominQuestão2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vet = new int[6];
        int valor = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Preencha o vetor com pelo menos 3 numeros negativos. ");
            valor = scan.nextInt();
            vet[i] = valor;
        }
        int count = 0, menor = 0, maior = 0;
        int soma = 0;
        for (int i = 0; i < 6; i++) {
            if (vet[i] < 0) {
                count = count + 1;

                System.out.println("Os valores negativos foram: " + vet[i]);
            } else if (vet[i] > 0) {
                soma = soma + vet[i];
            }
        }
        for (int i = 0; i < 6; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            } else if (vet[i] > maior) {
                maior = vet[i];
            }
        }
        System.out.println("Quantidade de valores negativos: " + count);
        System.out.println("A soma dos valores positivos e: " + soma);
        System.out.println("O maior valor digitado foi: " + maior);
        System.out.println("O menor valor digitado foi: " + menor);
    }
}
