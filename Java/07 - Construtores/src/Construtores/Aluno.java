package Construtores;

public class Aluno {

	private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacaoAluno;
	
	public Aluno(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	//DEFININDO ENUMERADOR
	public enum STATUS{
		APROVADO,
		REPROVADO
	}
	
	//M�todo para calcular m�dia do aluno
	public double calculaMediaAluno() {
		double mediaAluno = 0;
		//C�lculo da m�dia
		mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
		return mediaAluno;
	}
}
