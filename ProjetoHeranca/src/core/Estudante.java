package core;

// a classe Estudante ampia a definicao da classe pessoal. Estudante tem tudo que a classe pessoa tem e mais o que for definido nela mesma.

public class Estudante extends Pessoa{
	private int numeroMatricula;
	private String curso;
	
	public void exibir() {
		System.out.println("Estudante: "+nome+"/"+email+"/"+numeroMatricula+"/"+curso);
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
