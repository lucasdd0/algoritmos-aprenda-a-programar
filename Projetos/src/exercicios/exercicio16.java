package exercicios;
import java.util.Scanner;
public class exercicio16 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i , totalderepeticoes , numeros , somatoria = 0;
		
		System.out.println("Total de números: ");
		totalderepeticoes = input.nextInt();
		
		for (i = 1; i <= totalderepeticoes; i++)			// laço de repetição
		{
			System.out.println("Digite o " + i + "º: ");
			numeros = input.nextInt();
			somatoria += numeros;
		}													//vai ser executado n vezes !!!
		
		System.out.println("Somatória: " + somatoria);
		
		input.close();
	}
}