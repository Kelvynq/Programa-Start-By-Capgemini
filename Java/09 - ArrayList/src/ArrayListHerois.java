import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListHerois {

	public static void main(String[] args) {
        
		//Criando arrayList de herois
		ArrayList<String> herois = new ArrayList<>();
		
		//Adicionando Herois ao ArrayList
		herois.add("Mulher gato");
		herois.add("Batman");
		herois.add("Flash");
		herois.add("Hulk");
		herois.add("Aquaman");
		herois.add("Gelado");
		herois.add("Tempestade");
		
		//Mostra array
		System.out.println(herois);
		
		//Substitui Gelado por Coringa
		herois.set(5, "Coringa");
		System.out.println(herois);

		//Remove Batman
		herois.remove("Batman");
		System.out.println(herois);

		//Adicionando Herois ao arrayList com JOptionPane
		herois.add(JOptionPane.showInputDialog("Informa o nome do heroi:"));
		System.out.println(herois);
		
		//o vetor herois tem Mulher gato
		if(herois.contains("Mulher gato")) {
			//substituindo quando não sabe a posição
			for(int i=0 ; i<=herois.size() ; i++) {
				//Quando encontra a mulher gato muda para Hamtaro
				if("Mulher gato".equals(herois.get(i))) {
					herois.set(i, "Hamtaro");
					break;
				}		
			}
		}
		System.out.println(herois);
	
		//Esvaziando o array
				herois.clear();
				System.out.println(herois);

		//Verificar se o array está vazio
			if(herois.isEmpty()) {
				System.out.println("O vetor está vazio");
			}
	}

}
