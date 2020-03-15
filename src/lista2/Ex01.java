package lista2;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		
		List<Circulo> lista = new ArrayList<>();
		
		double randomico = 0.0;
		
		do {
			randomico = Math.random();
			if (randomico > 0.001) {
				lista.add(new Circulo(randomico));
			}
			
		} while (randomico > 0.001);
		
		
		int indice = 1;
		for (Circulo c : lista) {
			System.out.println(""+(indice++)+") Área: " + c.calculaArea());
		}
	}
}
