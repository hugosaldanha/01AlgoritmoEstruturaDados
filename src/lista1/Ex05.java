package lista1;

public class Ex05 {
	public static void main(String[] args) {
		int[] a = {5,8,4,2,3,6,6,6,4,5,6,7,8,6,7,8,6,7,8,6};
		int contador = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 6) {
				contador++;
			}
		}
		
		System.out.println("Repetiu " + contador + " vezes");
	}
}
