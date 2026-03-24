package exercicioaluno.model;

public enum SituacaoAluno {
	APROVADO("Aprovado"),
	REPROVADO("Reprovado"),
	EM_CURSO("Em curso");
	
	private String status;
	
	SituacaoAluno(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return status;
	}
}
