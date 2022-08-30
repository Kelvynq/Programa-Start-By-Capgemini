import javax.swing.JOptionPane;

public class entradaDados {

	public static void main(String[] args) {
		//Entrada de dados via JOPtionPane

		int idade;
		//Abre uma caixa de mensagem e transforma para inteiro a String
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa "));
		System.out.println("A pessoa tem " +idade+ "anos de idade");
		
		//Mostra uma mesagem
		JOptionPane.showMessageDialog(null, "A pessoa tem " + idade + " anos de idade");
        
		//Coloca um título e da uma mesangem
		JOptionPane.showMessageDialog(null, "Teste", " ATENÇÃO!!", 1);
	}
}