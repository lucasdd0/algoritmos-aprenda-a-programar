package exercicios;
import java.util.Scanner;
public class exercicio07 {
	
	
	public static void MaiorNumero ()
	{
		Scanner input = new Scanner (System.in);
		
		int a, b, c, maior;
		
		System.out.println("Digite um número: ");
		a = input.nextInt();
		System.out.println("Digite um número: ");
		b = input.nextInt();
		System.out.println("Digite um número: ");
		c = input.nextInt();
		
		input.close();
		
		if (a>b && b>c)
		{
			maior = a;
		}
		else
			if (b>c)
			{
				maior = b;
			}
			else
			{
				maior = c;
			}
		System.out.println("Seu maior número é: " + maior);
	}
			
	
	
	
			
			
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		MaiorNumero();
		
		
		input.close();
	}
}