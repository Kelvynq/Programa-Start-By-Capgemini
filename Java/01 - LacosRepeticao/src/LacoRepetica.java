
public class LacoRepetica {

	public static void main(String[] args) {		
	  int quantidadeVezes=1;
	  
	  //WHILE
	  
      while(quantidadeVezes<=10) {
    	  System.out.println("Estou fazendo " + quantidadeVezes + " vezes");
    	  quantidadeVezes++;  
      }
      
      //DO WHILE
      
      quantidadeVezes=1;
      do {
    	  System.out.println("Estou fazendo " + quantidadeVezes + " vezes");
    	  quantidadeVezes++;
      }while(quantidadeVezes<10);
	  System.out.println("Sai do laço e estou fazendo " + (quantidadeVezes-1) + " vezes");
	
	  //FOR
	  
	  for(int quantidadeVezes1=0; quantidadeVezes1 <=10; quantidadeVezes1++) {
    	  System.out.println("Estou fazendo " + quantidadeVezes1 + " vezes");
	  }
	}
}