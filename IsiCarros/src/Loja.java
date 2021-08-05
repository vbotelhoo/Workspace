
public class Loja {
	public static void main(String[] args) {
		// Carro � meu novo tipo de dado
		// c1 e c2 s�o as "vari�veis" deste novo tipo - chamamos de Objetos
		Carro c1;
		Carro c2;
		
		// se fosse um tipo comum, j� tava ok, por�m como falamos de classes
		// precisamos solicitar � Maquina Virtual um espa�o de mem�ria
		c1 = new Carro(); // aqui reservamos mem�ria para todas as vari�veis
		c2 = new Carro();
		
		// vamos atribuir valores (for�ando mesmo)
		c1.marca  = "P�rxy";
		c1.modelo = "Kaineni";
		c1.ano    = 2021;
		c1.cor    = "Preto";
		c1.preco  = 780000;
		
		c2.marca  = "Xevrol�";
		c2.modelo = "Cor�a";
		c2.ano    = 1997;
		c2.cor    = "Prata meio gasto";
		c2.preco  = 7500;
		
		// Vamos exibir o an�ncio
		c1.exibirInfo();
		c2.exibirInfo();
		
		c1.aplicarDesconto(10.0);
		c2.aplicarDesconto(5.0);
		System.out.println("---------------------");
		c1.exibirInfo();
		c2.exibirInfo();
		
	
		System.out.println("Valor do ipva do "+c1.modelo+" = "+c1.calcularIpva());
		System.out.println("Valor do ipva do "+c2.modelo+" = "+c2.calcularIpva());
		
	}
}