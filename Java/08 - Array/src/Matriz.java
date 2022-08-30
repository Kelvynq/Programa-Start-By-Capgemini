import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {

		String[] alunos = {"João", "Pedro", "Feh"};
		
		float[][] notas = new float [3][4];
		
		float somaNotas, mediaAluno;
		String statusAluno;
		
		//laço externo para associar aluno a nota
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno: " + alunos[i]);
			
			//laço interno para informar as notas de cada aluno
			somaNotas = 0;
			mediaAluno = 0;	
			for (int j = 0; j < 4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nº" + (j+1) + " do aluno " + alunos[i]));
				somaNotas = somaNotas + notas[i][j];
			}
			mediaAluno = somaNotas/4;
			if (mediaAluno < 5.5) {
				statusAluno = "REPROVADO";
			}else if(mediaAluno > 5.5 && mediaAluno < 7) {
				statusAluno = "EM RECUPERÇÃO";
			}else {
				statusAluno = "APROVADO";
			}
			
			System.out.println("==== BOLETIM ===");
			System.out.println("Aluno " + alunos[i]);
			System.out.println("Notas");
            for (int j1 = 0; j1 < 4; j1++) {
    			System.out.println((j1+1) + " - " + notas[i][j1]);
			}
			System.out.println("Média: " + mediaAluno + " - " + statusAluno);
		}
	}

}
