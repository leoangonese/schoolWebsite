package model;

public class Disciplina 
{
	private String nome, inicio, fim;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFim() {
		return fim;
	}

	public void setFim(String fim) {
		this.fim = fim;
	}

	public Disciplina(String nome, String inicio, String fim) {
		super();
		this.nome = nome;
		this.inicio = inicio;
		this.fim = fim;
	}

	public Disciplina() {
		super();
	}

	@Override
	public String toString() {
		return "nome: " + nome + ", inicio: " + inicio + ", fim: " + fim;
	}
	
	
	
	

}
