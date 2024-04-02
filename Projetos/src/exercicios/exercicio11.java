package exercicios;
import java.util.Scanner;
public class exercicio11 {
	
	public static int somax (int x, int y)
	{
		return x + y;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x, y;
		
		System.out.println("Digite um número: ");
		x = input.nextInt();
		System.out.println("Digite um número: ");
		y = input.nextInt();
		
		
		System.out.println("Seu resultado é: " + somax (x, y));
		
		input.close();
	}
}