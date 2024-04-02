package exercicios;
import java.util.Scanner;
public class exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double peso, altura, resultado;
		
		System.out.println("Vamos calcular seu IMC! \nDigite seu peso: ");
		peso = input.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = input.nextDouble();
		
		resultado = peso/(altura*altura);
		System.out.println("Seu IMC é: " + resultado);
		
		input.close();
	}
}

