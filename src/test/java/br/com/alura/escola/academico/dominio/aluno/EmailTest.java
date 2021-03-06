package br.com.alura.escola.academico.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.dominio.aluno.Email;

class EmailTest {

	@Test
	void nãoDeveriaCriarEmailComEnderecoInvalido() {
		assertThrows(IllegalArgumentException.class, () ->  new Email(null));
		assertThrows(IllegalArgumentException.class, () ->  new Email(""));
		assertThrows(IllegalArgumentException.class, () ->  new Email("emailinvalido"));
	}

	@Test
	void deveriaPermitirCriarEmailComEnderecoValido() {
		String enderecoValido = "lucas@gmail.com";
		Email email = new Email(enderecoValido);
    	assertEquals(enderecoValido, email.getEndereco());
	}

}
