package lista1;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double[] d = new double[10];
		
		for (int i = 0; i < d.length; i++) {
			System.out.println("Digite o n�mero: " + i);
			d[i] = tec.nextDouble();
		}
		
		for (int i = 0; i < d.length; i++) {
			System.out.println("Posic�o: " + i + ": " + d[i]);
			
		}
		
	}
}
