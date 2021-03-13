/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasFaesa.aulasDia1305;

/**
 *
 * @author Lucas
 */
public class exercicio1305P3 {
    public static void main(String[] args) {
        int limiteMinimo = 1;
        int limiteMaximo = 10;
        int alcance = limiteMaximo - limiteMinimo;
        double random = Math.random();
        System.out.println("Um valor aleatorio entre 1 e 10:" + Math.round(limiteMinimo + random * alcance));
    }
}
