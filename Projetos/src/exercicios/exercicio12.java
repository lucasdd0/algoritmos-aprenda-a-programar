package exercicios;
import java.util.Scanner;
public class exercicio12 {
	
	public static int somaxy (int x, int y)
	{
		return x + y;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x, y, resposta;
		
		System.out.println("Digite um número: ");
		x = input.nextInt();
		System.out.println("Digite um número: ");
		y = input.nextInt();
		
		
		resposta = somaxy (somaxy(x, y), 10);
		
		System.out.println("Sua resposta é: " + resposta);
		
		input.close();
	}
}