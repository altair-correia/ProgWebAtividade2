package com.atvd.avaliativa.modelo;

public class Disciplina { // Criando a classe Disciplina() para setar o Nome e Nota da mat?ria dado pelo usu?rio.
	
	private String nome;
	private String nota;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	
	public String getSituacao() { //func?o respons?vel por verificar se ou aluno foi aprovado ou reprovado.
		if (Integer.parseInt(nota) >= 5) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}

}
