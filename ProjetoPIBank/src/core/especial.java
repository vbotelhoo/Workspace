package core;

import core.conta;

public class especial extends conta{
	private double limite;
	
	public especial(String nomeTitular, String cpf, int numeroConta, int digitoVerificador, double saldo,  double limite) {
		super(nomeTitular, cpf, numeroConta, digitoVerificador, saldo);
		this.limite = limite;
	
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
