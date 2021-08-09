
public class RH {
	private int numeroFuncional;
	private String nome;
	private String email;
	private double salario;
	
	
	public RH(int numeroFuncional, String nome, String email, double salario) {
		this.numeroFuncional = numeroFuncional;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}
	
	
	
	public int getNumeroFuncional() {
		return numeroFuncional;
	}
	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String exibirInfo() {
		return  "_________________________________________________"+"\n"+
				"      Nome: "+nome+"\n"+
				" Funcional: "+numeroFuncional+"\n"+
				"    e-mail: "+email+"\n"+
				"   Salario: R$ "+salario+" Imposto devido: "+calcularImposto()+"\n"+
				"_________________________________________________";
	}
	
	public void reajustarSalario() {
		salario *= 1.05;
	}
	
	public double calcularImposto() {
		if(salario > 2000 && salario <= 3000) {
			return salario * 0.15;
		}
		else if(salario > 3000 && salario <= 4500) {
			return salario * 0.25;
		}
		else if(salario > 4500) {
			return 2250;
		}
		return 0;
	}
}
