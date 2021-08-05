
public class Carro {
	// vamos apenas declarar as vari�veis que compoem o tipo CARRO
	String marca;
	String modelo;
	int    ano;
	String cor;
	double preco;
	
	// agora tamb�m precisamos criar trechos de c�digo (subrotinas - m�todos)
	// para manipular, exibir, alterar essas vari�veis
	
	void exibirInfo() {
		System.out.println("Autom�vel: " + marca + " - " + modelo);
		System.out.println("      Ano: " + ano);
		System.out.println("      Cor: " + cor);
		System.out.println("    Pre�o: R$ " + preco);
	}
	
	// agora tenho uma funcionalidade que altera o valor do pre�o
	// por�m esse percentual de desconto torna-se flex�vel podendo ser diferente
	// para cada objeto que o chama
	void aplicarDesconto(double percentual) {
		preco = preco - preco * percentual/100;
	}
	
	// agora quero uma funcionalidade que me retorne o valor de IPVA do carro,
	// baseado em seu pre�o
	
	// tipo nome
	// calcularIpva � uma funcionalidade que retorna um valor
	double calcularIpva() {
		double valoripva;
		if (ano < 2000) {
			valoripva = 0.0;
		}
		else {
			valoripva = preco * 0.02;
		}
		return valoripva;
	}
	
	
}