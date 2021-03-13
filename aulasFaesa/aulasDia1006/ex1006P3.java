package aulasFaesa.aulasDia1006;
import java.util.Scanner;

public class ex1006P3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int h = 0;
        int m = 0;
        int malt = 0;
        double altm = 0;
        
        for(int i = 1;i <= 5;i++){
            System.out.println("Digite o seu sexo(h para homem e m para mulher): ");
            String sexo = scan.next();
            
            System.out.println("Digite a sua altura(com virgula): ");
            double alt = scan.nextDouble();
            
            if(sexo.equalsIgnoreCase("h")){
               h = h + 1; 
                
            }else if(sexo.equalsIgnoreCase("m")){
               m = m + 1;
               altm = altm + alt;
            }
            if(alt > 1.70){
                malt = malt + 1;  
            }
        }
        altm = altm / m;
        System.out.println("Quantidade de homens: "+h);
        System.out.println("Quantidade de mulheres: "+m);
        System.out.println("Numero de pessoas maiores que 1,70m: " +malt);
        System.out.println("Media de altura das mulheres: "+altm);
    }
    
}
