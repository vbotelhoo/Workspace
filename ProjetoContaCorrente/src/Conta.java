
public class Conta {
	private int numeroConta;
	private int digitoVerificador;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String exibir() {
		return "Conta" + numeroConta + "/" + digitoVerificador + "\n" + "     Titular: " + nomeTitular + " ("
				+ cpfTitular + " )" + "\n" + "     Saldo: R$ " + saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

}