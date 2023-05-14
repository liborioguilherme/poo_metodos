package ex02Imc;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
     Imc imc = new Imc ();
     double peso,altura;
     Scanner ler = new Scanner(System.in);
 	
	  System.out.println("Digite seu peso em kg");
	  peso = ler.nextDouble();
	  
	  System.out.println("Digite sua altura em metros");
	  altura = ler.nextDouble();
	  
	  imc.calculoImc(peso, altura);
	  
	  System.out.println(imc.resultadoIMC());
   
	}
	

}
