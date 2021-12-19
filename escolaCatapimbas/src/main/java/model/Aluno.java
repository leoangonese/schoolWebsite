package model;

public class Aluno 
{
	private String nome, cpf, turma;

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

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public Aluno(String nome, String cpf, String turma) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.turma = turma;
	}

	public Aluno() {
		super();
	}

	@Override
	public String toString() {
		return "nome:" + nome + ", cpf:" + cpf + ", turma:" + turma;
	}
	
	

}
