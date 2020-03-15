package lista2;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
		
		Map<String, String> mapa = new HashMap<>();
		
		String ra = "";
		String nome = "";
		
		for (int i = 0; i < 3; i++) {
			JOptionPane.showInputDialog("RA: ");
			JOptionPane.showInputDialog("Nome: ");
			mapa.put(ra, nome);
		}
		System.out.println();
		System.out.println();
		String buscaRA = JOptionPane.showInputDialog("Entre com RA: ");
		
		if (mapa.get(buscaRA) != null) {
			System.out.println("Para o nome RA " + buscaRA + " o nome é: " + mapa.get(buscaRA));
		}else {
			System.err.println("Aluno não localizado na lista");
		}
		
		
	}

}
