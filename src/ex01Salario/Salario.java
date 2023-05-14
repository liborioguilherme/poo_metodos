package ex01Salario;
import java.util.Scanner;
public class Salario {
 public int salario;
 public int novoSalario;
 Scanner ler = new Scanner(System.in);
 public int CalculoSalario(int salario , int novoSalario) {
	 System.out.println("Digite seu salário em reais (R$)");
	 salario = ler.nextInt();
	 if(salario<3000) {
		 novoSalario = salario+salario*10/100;
	 }
	 else if(salario>=3000) {
		 novoSalario =salario+ salario*20/100;
	 }
	 return novoSalario;
 }
 

}
