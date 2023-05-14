package ex02Imc;
import java.util.Scanner;
public class Imc {
	public double peso1;
	public double altura1;
	public double imc;
	public String imc1;



	public void calculoImc(double peso,double altura) {
		peso1 = peso;
		altura1 = altura;
		imc =  peso1/(altura1*altura1);
		
	}
	public String resultadoIMC() {

		if(imc<18.5) {
			imc1 = "Abaixo do peso";
		}
		else if(imc>18.5 && imc<24.9) {
			imc1="Peso normal";
		}
		else if(imc>25 && imc<29.9) {
			imc1 = "Exceso de peso";
		}
		else if(imc>30 && imc<34.9) {
			imc1 = "Obesidade classe I";
		}
		else if(imc>35 && imc<39.9) {
			imc1 = "Obesidade classe II";
		}
		else if(imc>40) {
			imc1 = "Obesidade classe III";
		}
		return imc1;
	  }
  
}
