package ui;

import core.Estudante;
import core.Pessoa;


public class AppQueUsa {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Vitor");
		p.setEmail("vitor@email.com");
		p.exibir();
		
		Estudante e = new Estudante();
		e.setNumeroMatricula(1234);
		e.setCurso("Computacao");
		e.setNome("Jose");
		e.setEmail("jose@email.com");
				
		e.exibir();
	}
}
