package exercicios;
import java.util.Scanner;
public class exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int a,b;
		
		System.out.println("Digite um número: ");
		a = input.nextInt();
		System.out.println("Digite um número: ");
		b = input.nextInt();
		
		if(a % 2 == 0 && b % 2 == 0)
		{
			System.out.println("Verde");
		}
		if (a % 2 == 1 && b % 2 == 1)
		{
			System.out.println("Vermelho");
		}
		if(a % 2 == 1 && b % 2 == 0 || a % 2 == 0 && b % 2 == 1)
		{
			System.out.println("Amarelo");
		}
		
		
		
		input.close();
	}
}
