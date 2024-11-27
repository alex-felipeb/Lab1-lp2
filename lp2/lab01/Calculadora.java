/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Alex Felipe Barbosa Feitosa - 124111029
 */

package lp2.lab01;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = sc.nextLine();
		
		if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			if (op.equals("+")) {
				System.out.println("RESULTADO: " + (n1 + n2));
			} else if (op.equals("-")) {
				System.out.println("RESULTADO: " + (n1 - n2));
			} else if (op.equals("*")) {
				System.out.println("RESULTADO: " + (n1 * n2));
			} else if (op.equals("/")) {
				if (n2 != 0) {
					System.out.println("RESULTADO: " + (n1 / n2));
				} else {
					System.out.println("ERRO");
				}
			}
		} else {
			System.out.println("ENTRADA INVALIDA");
		}
	}
}
			 