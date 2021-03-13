package aulasFaesa.aulasDia1805;

import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class exercicio1805P5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu nome:");
        String nome = scan.next();
        
        System.out.println("Digite a sua idade:");
        int idade = scan.nextInt();
        
        System.out.println("Digite a sua altura:");
        double altura = scan.nextDouble();
        
        System.out.println("Oi " + nome + " voce tem " + idade + " anos e sua altura e " + altura + " metros");
        System.out.println("Tenha um bom dia.");
        
    }
}
