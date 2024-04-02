package exercicios;
import java.util.Scanner;
public class exercicio13 {
	
	public static boolean epar (int x)
	{
	if (x % 2 == 0)	
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x;
		
		System.out.println("Digite um valor: ");
		x = input.nextInt();	
		
		System.out.println("O número " + x + " é " + epar(x));
		
		
		
		
		input.close();
	}

}
