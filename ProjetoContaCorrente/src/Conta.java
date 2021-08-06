
public class Conta {
	int numeroConta;
	int digitoVerificador;
	String nomeTitular;
	String cpfTitular;
	double saldo;
	
	String exibir() {
		return "Conta" + numeroConta + "/" + digitoVerificador + "\n" +
				"     Titular: " + nomeTitular + " ("+cpfTitular + " )" + "\n"+
				"     Saldo: R$ " + saldo;
	}
	
	void depositar(double valor) {
		saldo += valor;
	}
	
	boolean sacar(double saldo) {
		
	}
	
}
