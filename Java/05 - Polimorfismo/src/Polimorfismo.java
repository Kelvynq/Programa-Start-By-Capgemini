
public class Polimorfismo {

	public static void main(String[] args) {
        Mamifero mam1 = new Elefante();
        System.out.println("Conta di�ria de um elefante: " + mam1.cotaDiariaLeite());
        
        Mamifero mam2 = new Rato();
        System.out.println("Conta di�ria de um rato: " + mam2.cotaDiariaLeite());
	}

}
