package model;

public class Professor 
{
	private String nome, cpf, formacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public Professor(String nome, String cpf, String formacao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.formacao = formacao;
	}

	public Professor() {
		super();
	}

	@Override
	public String toString() {
		return "nome: " + nome + ", cpf: " + cpf + ", formacao: " + formacao;
	}
	
	

}
