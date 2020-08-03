package poo.composicao;

import java.util.ArrayList;

public class Curso {
	final String nome;
	final ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	Curso(String nome){
		this.nome = nome;
	}
	void adicionarAluno(Aluno a){
		this.alunos.add(a);
		a.cursos.add(this);
	}
	public String toString() {
		return nome;
	}
}
