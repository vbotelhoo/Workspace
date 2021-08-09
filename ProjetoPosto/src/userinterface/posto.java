package userinterface;

import core.BombaDeCombustivel;

public class posto {
	public static void main(String[] args) {
		BombaDeCombustivel b1;
		
		b1 = new BombaDeCombustivel("Etanol", 4.49);
		
		b1.abastecerPorLitros(85.0);
		System.out.println(b1.exibirRecibo());
		
		
		b1.abastecerPorPreco(20.0);
		System.out.println(b1.exibirRecibo());
	}
}
