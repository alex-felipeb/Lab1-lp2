/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Alex Felipe Barbosa Feitosa - 124111029
 */

package lp2.lab01;

import java.util.Scanner;

public class Wally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String input = sc.nextLine();
		
			if (input.equals("wally")) {
				break;
			}
			String[] nomes = input.split(" ");
			String ultimoNome = "?";
			for (String palavra : nomes) {
				if (palavra.length() == 5) {
					ultimoNome = palavra;
				}
			}
			System.out.println(ultimoNome);
		}
	}
}
		