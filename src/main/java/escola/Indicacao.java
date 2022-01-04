package escola;

import java.time.LocalDateTime;

public class Indicacao {
	
	private Aluno indicado;
	private Aluno indicadante;
	private LocalDateTime dataIndicacao;
	
	public Indicacao(Aluno indicado, Aluno indicadante) {
		this.indicado = indicado;
		this.indicadante = indicadante;
		this.dataIndicacao = LocalDateTime.now();
	}

	public Aluno getIndicado() {
		return indicado;
	}

	public Aluno getIndicadante() {
		return indicadante;
	}

	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}
}
