/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasFaesa.aulasDia1105;

/**
 *
 * @author Lucas
 */
public class Exercicio1105P04 {
    public static void main(String[] args) {
        byte j = 60;
        short k = 24;
        int l = 30;
        long m = 12L;
        long resultado = 0L;
        
        resultado = j;
        resultado = k + 20;
        resultado = l + 10;
        resultado = resultado + j + k + l ;
        resultado %= m;
    }
    
}
