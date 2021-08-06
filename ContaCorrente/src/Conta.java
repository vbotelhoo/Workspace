
public class Conta {
	private int numeroConta;
	private int digtVerificador;
	private String titularNome;
	private String titularCPF;
	double saldo;
	
	void modificadorNumeroConta(int novoNumero) {
		if(novoNumero < 0) {
			// retorna algum erro
		}
		numeroConta = novoNumero;
	}
	
	String exibir() {
		String resultado;
		
		resultado = "Conta Corrente" + numeroConta + "/" + digtVerificador + "\n" +
					"Titular: " + titularNome + " (" + titularCPF + " )" + "\n" +
					"Saldo : R$ " + saldo;
		return resultado;
	}
	
/*	void exibirInfo() {
		System.out.println("______________________________________");
		System.out.println("NOME DO TITULAR: " + titularNome);
		System.out.println("           CPF : " + titularCPF);
		System.out.println("NUMERO DA CONTA: " + numeroConta);
		System.out.println("         DIGITO: " + digtVerificador);
		System.out.println("          SALDO: " + saldo);
		System.out.println("______________________________________");
	}                                                                     */
	
	boolean saque(double valor) {
		boolean deuCerto;
		if (valor <= saldo) {
			saldo = saldo - valor;
			deuCerto = true;
		}
		else {
			deuCerto = false;
		}
		return deuCerto;
	}
	
	void deposito(double valor) {
		/*if(valor > 0) {
			saldo = saldo + valor;
			System.out.println("______________________________________");
			System.out.println("DEPOSITO REALIZADO COM SUCESSO.");
			System.out.println("SEU NOVO SALDO E DE R$ " + saldo);
			System.out.println("______________________________________");
		}*/
		saldo = saldo + valor;
	}
	
}
