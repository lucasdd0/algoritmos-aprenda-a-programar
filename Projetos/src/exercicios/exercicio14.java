package exercicios;
import java.util.Scanner;
public class exercicio14 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i, a , b;
		
		System.out.println("Digite um valor: ");
		a = input.nextInt();
		System.out.println("Digite um valor: ");
		b = input.nextInt();
		
		input.close();
		
		for (i = a; i <= b; i++)
		{
			System.out.print(i + ", ");
		}
		
	}

}