package exercicios;
import java.util.Scanner;
public class exercicio09 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int a, b, c, s = 0;
		
		System.out.println("Digite um numero: ");
		a = input.nextInt();
		System.out.println("Digite um numero: ");
		b = input.nextInt();
		System.out.println("Digite um numero: ");
		c = input.nextInt();
		
		if(a % 2 == 1)
		{
			s= s+1;
		}
		if(b % 2 == 1)
		{
			s= s+1;
		}
		if(c % 2 == 1)
		{
			s= s+1;
		}
		
		System.out.println("Total de números ímpares: " + s);
		
		input.close();
	}

}
