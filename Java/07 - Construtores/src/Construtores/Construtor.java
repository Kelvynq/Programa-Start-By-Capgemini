package Construtores;

//Importando o enum
import Construtores.Aluno.STATUS;

public class Construtor {
	
public static void main(String[] args) {
	
	//Passando os dados através do construtor sobrecarregado
	Aluno alu = new Aluno(5,6,4);
	
	//Calculando média
	double mediaAlunoFinal = alu.calculaMediaAluno();
	
	//Situação do aluno
	if(mediaAlunoFinal < 6) {
		alu.situacaoAluno = STATUS.REPROVADO;
	} else {
		alu.situacaoAluno = STATUS.APROVADO;
	}
	
	//Imprimindo situação do aluno
	System.out.println("A média do aluno é: " + alu.calculaMediaAluno() + " e o aluno está " + alu.situacaoAluno);
	
	
	
}
	

}
