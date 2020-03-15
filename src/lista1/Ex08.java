package lista1;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int a = 0;
		
		do {
			System.out.println("Digite um número: ");
			int[] g = {tec.nextInt()};
			for (int i = 0; i < g.length; i++) {
				System.out.println("[a] = {"+g[i]+"}");
			}
			
		} while (a<1);
		
		
	}
}
