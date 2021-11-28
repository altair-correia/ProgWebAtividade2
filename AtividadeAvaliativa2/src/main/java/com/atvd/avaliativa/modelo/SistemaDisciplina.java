package com.atvd.avaliativa.modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaDisciplina {
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>(); //criando a lista do tipo disciplinas.
	
	public void adicionar(Disciplina d) { // metodo para adcionar valores do tipo disciplina na lista.
		disciplinas.add(d);
	}
	public List<Disciplina> listarDisciplinas(){ //listando a lista de disciplinas.
		return disciplinas;
	}
	
}
