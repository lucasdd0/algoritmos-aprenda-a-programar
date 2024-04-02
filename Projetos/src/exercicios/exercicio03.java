package exercicios;
import java.util.Scanner;
public class exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int a, b;
		double x;
		
		System.out.println("Digite o valor de a: ");
		a = input.nextInt();
		System.out.println("Digite o valor de b: ");
		b = input.nextInt();
		
		x = -b/a;
		System.out.println("Resultado: " + x);
		
		input.close();
	}

}
