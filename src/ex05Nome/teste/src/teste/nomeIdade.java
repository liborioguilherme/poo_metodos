package teste;
import java.util.Scanner;
public class nomeIdade {
	public String nome;
	 public int idade;

	 Scanner ler = new Scanner(System.in);
	 
	 public void dados(String nome,int idade) {
		int idade1[] = new int [5];
		String nome1[] = new String[5];
		 
		 System.out.println("Digite cinco nomes");
		 for(int i=0;i<=4;i++) {
			 nome1[i] = ler.next();
			
		 }
		 
		 System.out.println("Digite cinco idades");
		 for(int i=0;i<=4;i++) {
			 idade1[i] = ler.nextInt();
			
		 }
		
		 
		 for(int i=0;i<=4;i++) {
			 System.out.print("  " +nome1[i] );
		 }
		 System.out.println("");
		 
		 for(int i=0;i<=4;i++) {
			
			 
			 System.out.print("  " +idade1[i]);
		 }
	 }
}
