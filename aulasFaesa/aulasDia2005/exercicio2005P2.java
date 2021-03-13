/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasFaesa.aulasDia2005;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class exercicio2005P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Type how many kilometres do you drove:");
        double km = scan.nextDouble();
        
        System.out.println("Type how many litres of gasoline your car consumed:");
        double l = scan.nextDouble();
        
        double kml = km / l;
        System.out.println("avg: " + kml +"km/l");
    }
}
