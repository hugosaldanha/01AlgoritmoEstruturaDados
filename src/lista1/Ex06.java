package lista1;

public class Ex06 {

	public static void main(String[] args) {
		
	int[] a = { 5, -3, 10, -20, 11, 18, 22, 58, 21, -6, -11, -1001 };
	boolean[] result = new boolean[12];

	for(int i = 0;i<12;i++){
		if (a[i] > 0) {
			result[i] = true;
		} else {
			result[i] = false;
		}
	}
	
	for(int i = 0;i<12;i++) {
		System.out.println("Elemento: " + a[i] + " é: " + result[i]);
	}
	
}
}
