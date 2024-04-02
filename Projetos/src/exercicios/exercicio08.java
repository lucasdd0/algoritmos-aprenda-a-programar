package exercicios;
import java.util.Scanner;

public class exercicio08 {
	

	public static double calculandodelta (double a, double b, double c)
	{
		double delta = (b*b) - (4*a*c);
		return delta;
	}
	
	public static double calculandox1 (double delta, double a, double b)
	{
		double x1 = (-b + Math.sqrt(delta))/(2*a) ;
		return x1;
	}
	public static double calculandox2 (double delta, double a, double b)
	{
		double x2 = (-b - Math.sqrt(delta))/(2*a) ;
		return x2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double a, b, c, x1, x2, delta;
		
		System.out.println("Digite o valor do a: ");
		a = input.nextDouble();
		System.out.println("Digite o valor do b: ");
		b = input.nextDouble();
		System.out.println("Digite o valor do c: ");
		c = input.nextDouble();
		
		delta = calculandodelta(a, b, c);
		
		if (delta<0)
		{
			System.out.println("Delta é negativo. Não existe raizes reais.");
		}
		else 
		{
		x1 = calculandox1(delta, a , b);
		x2 = calculandox2(delta, a , b);
		
		System.out.println("O valor do delta é: " + delta);
		System.out.println("Os valores de x são: " + x1 + " e " + x2);
		}
		
		
		input.close();
	}
}