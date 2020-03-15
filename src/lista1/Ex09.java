package lista1;

public class Ex09 {

	public static void main(String[] args) {
		int[] a = {4,5,6,4,6,4,8,9,4,3,2,8,5,4,1};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a[i] = +1;
			}else {
				a[i] = -1;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);			
		}
	}

}
