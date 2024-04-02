package exercicios;
import java.util.Scanner;
public class exercicio18 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i = 1, totalderepeticoes;
		
		System.out.println("Digite o total de repetições: ");
		totalderepeticoes = input.nextInt();
		
		do
		{
			System.out.println(i);
			i += 1;
		}
		while (i <= totalderepeticoes);
		
		input.close();
	}
}