
public class Pessoas {

	public static void main(String[] args) {
		
		Fisica fis = new Fisica();
		
		fis.nome = "Maria Bruaca";
		fis.cpf = "12532145";
		fis.identidade = "1254236";
		fis.situacaoPessoa = "A";
		
		Juridica juri = new Juridica();
		
		juri.nome = "CAMPO DE BOMBAS";
		juri.cnpj = "254463145";
		juri.inscEstadual = "444445555";
		juri.situacaoPessoa = "I";
		
	System.out.println("Dados Pessoa Física: ");
	System.out.println(fis.toString());
	System.out.println("Dados Pessoa Juridica: ");
	System.out.println(juri.toString());
	}

}
