package core;

public class conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected int digitoVerificador;
	protected double saldo;
	
	public String exibirInfo() {
		return "Conta" + numeroConta + "/" + digitoVerificador + "\n" + "     Titular: " + nomeTitular + " ("
				+ cpf + " )" + "\n" + "     Saldo: R$ " + String.format("%.2f", saldo);
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
	
	public conta(String nomeTitular, String cpf, int numeroConta, int digitoVerificador, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.digitoVerificador = digitoVerificador;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// get e set
	
	
}
