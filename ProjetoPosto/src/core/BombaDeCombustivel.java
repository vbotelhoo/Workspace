package core;

public class BombaDeCombustivel {
	private String nome;
	private double precoLitro;
	private double qtdeLitros;
	private double totalPagar;
	

public BombaDeCombustivel(String nome, double precoLitro) {
		super();
		this.nome = nome;
		this.precoLitro = precoLitro;
	}

public void abastecerPorLitros(double qtdeLitros) {
	this.qtdeLitros = qtdeLitros;
	totalPagar = qtdeLitros * precoLitro;
}

public void abastecerPorPreco(double totalPagar) {
	this.totalPagar = totalPagar;
	this.qtdeLitros = this.totalPagar / this.precoLitro;
}

public String exibirRecibo() {
	return 	"___________________________________________________________________"+"\n"+
			"----------------------IsidroCorp Gas & Energy----------------------"+"\n"+
			"	Combust�vel: "+nome+"		Litros: "+String.format("%.3f\n", qtdeLitros)+
			"	Preco do Litro: R$ "+String.format("%.3f", precoLitro)+"	Total a pagar: R$ "+String.format("%.2f", totalPagar)+"\n"+
			"___________________________________________________________________"+"\n";
}

//---------------- gets & sets ----------------
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdeLitros() {
		return qtdeLitros;
	}
	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
//---------------- gets & sets ----------------
	
	
}
