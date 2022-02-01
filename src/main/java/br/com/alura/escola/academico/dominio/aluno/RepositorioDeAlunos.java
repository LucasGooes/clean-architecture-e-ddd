package br.com.alura.escola.academico.dominio.aluno;

import java.util.List;

import br.com.alura.escola.shared.domain.CPF;

public interface RepositorioDeAlunos {
	
	void matricular(Aluno aluno);
	
	Aluno buscarPorCpf(CPF cpf);
	
	List<Aluno> listarTodosAlunosMatriculados();
	
	//...
}
