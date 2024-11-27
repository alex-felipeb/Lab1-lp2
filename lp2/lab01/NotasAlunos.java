/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Alex Felipe Barbosa Feitosa - 124111029
 */

package lp2.lab01;

import java.util.Scanner;

public class NotasAlunos {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
		int maiorNota = -1;
		int menorNota = 1001;
		int somatorio = 0;
		int totaldeAlunos = 0;
		int acimade700 = 0;
		int abaixode700 = 0;
		
		while (true) {
			String input = sc.nextLine();
			if (input.equals("-")) {
				break;
			}
			String[] partes = input.split(" ");
			int atual = Integer.parseInt(partes[1]);
			
			if (atual > maiorNota) {
				maiorNota = atual;
			}
			if (atual < menorNota) {
				menorNota = atual;
			}
			somatorio += atual;
			totaldeAlunos += 1;
			
			if (atual >= 700) {
				acimade700 += 1;
			} else {
				abaixode700 += 1;
			}
		}
		if (totaldeAlunos > 0) {
			int media = somatorio / totaldeAlunos;
			System.out.println("maior: " + maiorNota);
			System.out.println("menor: " + menorNota);
			System.out.println("media: " + media);
			System.out.println("acima: " + acimade700);
			System.out.println("abaixo: " + abaixode700);
		}
	}
}
