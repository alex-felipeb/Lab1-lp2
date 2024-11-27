/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Alex Felipe Barbosa Feitosa - 124111029
 */

package lp2.lab01;

import java.util.Scanner;

public class AcimaAbaixo {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

        	String[] elem = input.split(" ");
        	int qntd = elem.length;
		int[] num = new int[qntd];
		int soma = 0;

        	for (int i = 0; i < qntd; i++) {
            		num[i] = Integer.parseInt(elem[i]);
            		soma += num[i];
		}
                double media = (double) soma / qntd;
        	for (int i = 0; i < qntd; i++) {
            		if (num[i] > media) {
				if (i > 0) {
					System.out.print(" "); 
                		}
                		System.out.print(num[i]);
            		}
        	}
    	}
}