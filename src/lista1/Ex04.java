package lista1;

public class Ex04 {

	public static void main(String[] args) {
		
		int [] a = {5,-3,10,-20,11,18,22,58,21,-6,-11,-1001};
		
		int contador = 0;
		int contador2 = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				contador++;
			}
			if (a[i] > 0) {
				contador2++;
			}
			
		}
		System.out.println("Quantidade de elementos negativos: " + contador);
		System.out.println("Quantidade de elementos positivos: " + contador2);
	}

}
