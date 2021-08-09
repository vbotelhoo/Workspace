
public class sistema {
	public String combustivel;
	private double valorLitro;
	public double qntLitro;
	public double valorPagar;
	
	public sistema(String combustivel, double valorLitro, double qntLitro, double valorPagar) {
		this.combustivel = combustivel;
		this.valorLitro = valorLitro;
		this.qntLitro = qntLitro;
		this.valorPagar = valorPagar;
	}
	
//------------------Get & Sets-------------------------------
	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(double valorLitro) {
		this.valorLitro = valorLitro;
	}

	public double getQntLitro() {
		return qntLitro;
	}

	public void setQntLitro(double qntLitro) {
		this.qntLitro = qntLitro;
	}

	public double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}
//-----------------------------------------------------------
	
	public String exibirRecibo() {
		return 	"___________________________________________________________________"+"\n"+
				"----------------------IsidroCorp Gas & Energy----------------------"+"\n"+
				"	Combustível: "+combustivel+"		Litros: "+qntLitro+"\n"+
				"	Preco do Litro: R$ "+valorLitro+"	Total a pagar: R$ "+valorPagar+"\n"+
				"___________________________________________________________________"+"\n";
	}
	
	public void abastecerLitro() {
		valorPagar = qntLitro * valorLitro;
	}
	
	public void abastecerValor(){
		qntLitro = valorPagar / valorLitro;
	}

}
