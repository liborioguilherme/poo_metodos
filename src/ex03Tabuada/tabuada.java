package ex03Tabuada;
import java.util.Scanner;

public class Tabuada {
	public int i;
	public int num;
	public int  res;
	Scanner ler = new Scanner(System.in);
	
public void calculoTabu() {
	  System.out.println("Digite um numero para ver a tabuada");
	  num = ler.nextInt();
	  
	  for(int i=0;i<=10;i++) {
		  System.out.println(i+ " x "+ num+" = "+i*num);
	  }
	  
  }
}
