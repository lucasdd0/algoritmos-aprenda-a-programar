package exercicios;
import java.util.Scanner;
public class exercicio21 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int a = 0, b = 1, c, n, i;
		
		System.out.println("Digite o valor: ");
		n = input.nextInt();
		
		int vetor [] = new int [n];
		
		for (i = 0; i < n; i++)
		{
			c = a + b;
			vetor[i] = c;
			a = b;
			b = c;
		}
		
		for (i = 0; i < n; i++)
		{
			System.out.println(vetor[i]);
		}
	
		
		input.close();
	}
}