package Construtores;

//Importando o enum
import Construtores.Aluno.STATUS;

public class Construtor {
	
public static void main(String[] args) {
	
	//Passando os dados atrav�s do construtor sobrecarregado
	Aluno alu = new Aluno(5,6,4);
	
	//Calculando m�dia
	double mediaAlunoFinal = alu.calculaMediaAluno();
	
	//Situa��o do aluno
	if(mediaAlunoFinal < 6) {
		alu.situacaoAluno = STATUS.REPROVADO;
	} else {
		alu.situacaoAluno = STATUS.APROVADO;
	}
	
	//Imprimindo situa��o do aluno
	System.out.println("A m�dia do aluno �: " + alu.calculaMediaAluno() + " e o aluno est� " + alu.situacaoAluno);
	
	
	
}
	

}
