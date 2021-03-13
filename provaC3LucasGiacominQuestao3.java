
import java.util.Scanner;

public class provaC3LucasGiacominQuestao3 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vet1 = new int[3];
        int[] vet2 = new int[3];
        int[] vet3 = new int[vet1.length + vet2.length];

        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Digite o valor da posicao " + i + ":");
            vet1[i] = scan.nextInt();
        }
        for (int i = 0; i < vet2.length; i++) {
            System.out.println("Digite o valor da posicao " + i + ":");
            vet2[i] = scan.nextInt();
        }
        System.arraycopy(vet1, 0, vet3, 0, vet1.length);
        System.arraycopy(vet2, 0, vet3, vet1.length, vet2.length);
        for (int i = 0; i < vet3.length; i++) {
            System.out.println(vet3[i]);
        }
        
    }
}
