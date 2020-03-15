package lista1;

public class Ex07 {
	public static void main(String[] args) {
		int [] a = {5,3,1,5,6,5,4,8,6,4,6,6,4,8,6};
		int maior = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maior) {
				maior = a[i];
			}
		}
		
		System.out.println("O maior valor é " + maior);
	}
}
