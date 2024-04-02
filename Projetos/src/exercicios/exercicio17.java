package exercicios;
import java.util.Scanner;
public class exercicio17 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i = 1, n;
		
		System.out.println("Digite o total de repetições: ");
		n = input.nextInt();
		
		while (i <= n)
		{
			System.out.println(i);
			i += 1;
		}
		
		
		input.close();
	}
}