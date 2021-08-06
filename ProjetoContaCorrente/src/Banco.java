import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		double valor;
		
		Conta c1;
		c1 = new Conta();
		c1.setNumeroConta(1232);
		c1.setDigitoVerificador(6);
		c1.setNomeTitular("Vitor Botelho");
		c1.setCpfTitular("123.321.789.00");
		c1.setSaldo(200.00);
		
		
		do {
			System.out.println("Bem vindo ao IsiItaú -- Seu banco na internet");
			System.out.println("Digite: \n 1 -> Info. \n 2 -> Deposito. \n 3 -> Saque. \n 0 -> Encerrar.");
			
			opcao = teclado.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.println(c1.exibir());
				break;
				
			case 2:
				System.out.println("[DEPOSITO] Digite o valor: ");
				valor = teclado.nextDouble();
						c1.depositar(valor);
				break;
			
			case 3:
				System.out.println("[SAQUE] Digite o valor: ");
				valor = teclado.nextDouble();
				if(c1.sacar(valor)) {
					System.out.println("    Saque autorizado");
				}
				else {
					System.out.println("Saldo insuficiente");
				}
				break;
			
			case 0:
				System.out.println("---> Obrigado pela preferência !");
				break;
			
			default:
				System.out.println("ERRO: Opcao Invalida");
			}
			
		} while (opcao != 0);
		
		teclado.close();
	}
}
