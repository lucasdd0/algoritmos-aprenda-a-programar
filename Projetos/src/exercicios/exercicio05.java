package exercicios;
import java.util.Scanner;
public class exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("Digite um numero: ");
		a = input.nextInt();
		System.out.println("Digite um numero: ");
		b = input.nextInt();
		System.out.println("Digite um numero: ");
		c = input.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Maior: " + a);
			}
			else
			{
				System.out.println("Maior: " + c);
			}
		}
		else if (b>c)
			{
				System.out.println("Maior: " + b);
			}
			else
			{
				System.out.println("Maior: " + c);
			}
		
		input.close();
	}

}
