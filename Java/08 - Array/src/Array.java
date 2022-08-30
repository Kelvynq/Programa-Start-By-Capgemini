import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {
		
		String[] paises = new String[4];
		
		int[] numeros = new int[10]; 
		
		for(int i=0; i < 4; i++) {
			//Abre janela como se fosse String
			paises[i] = JOptionPane.showInputDialog("Informe um pais");
		}
		//Imprime vetor
		for (String listaPaises : paises) {
			System.out.println(listaPaises);
		}
		
		for (int i = 0; i < 10; i++) {
			//Transforma String em int
		 numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe número"));
		}
		
		for (int num : numeros) {
			System.out.println(num);
		}

	}

}
