package com.atvd.avaliativa.modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaDisciplina {
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>(); //criando um array do tipo disciplina.
	
	public void adicionar(Disciplina d) { // método que adiciona valores do tipo disciplina no array.
		disciplinas.add(d);
	}
	public List<Disciplina> listarDisciplinas(){ //listando o array de disciplinas.
		return disciplinas;
	}
	
}
