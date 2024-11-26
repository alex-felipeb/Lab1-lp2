/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Alex Felipe Barbosa Feitosa - 124111029
 */

package lp2.lab01;

import java.util.Scanner;

public class DobroTriplo {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int valor = sc.nextInt();
            int dobro = valor * 2;
            int triplo = valor * 3;
            System.out.println("dobro: " + dobro + ", triplo: " + triplo);
    }
}
