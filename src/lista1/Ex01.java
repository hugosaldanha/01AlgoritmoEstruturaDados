package lista1;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {
		
		//ARRAYS
		int[] a = new int[10];
		int[] b = new int[11];
		int[] c = new int[10];
		int[] d = new int[10];
		
		String aux = "";
		
		for (int i = 0; i < 10; i++) {
			aux = JOptionPane.showInputDialog("Entre valor (" + (i+1) +"):");
			a[i] = Integer.parseInt(aux);
		} 
		
		for (int i = 0; i < 11; i++) {
			aux = JOptionPane.showInputDialog("Entre valor (" + +(i+1) +"):");
			b[i] = Integer.parseInt(aux);
		}
		
		for (int i = 0; i < 10; i++) {
			aux = JOptionPane.showInputDialog("Entre valor (" + (i+1) +"):");
			c[i] = Integer.parseInt(aux);
		}
		
		for (int i = 0; i < 10; i++) {
			aux = JOptionPane.showInputDialog("Entre valor (" + +(i+1) +"):");
			d[i] = Integer.parseInt(aux);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < 11; i++) {
			System.out.print(b[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(c[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(d[i] + ", ");
		}
		
		System.out.println();
		System.out.println();

	}
}
