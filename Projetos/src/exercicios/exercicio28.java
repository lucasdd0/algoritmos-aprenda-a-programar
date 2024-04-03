package exercicios;
import java.util.Scanner;
public class exercicio28{							
	public static void main(String[] args) {			//a sequência será dividida em pedaços menores e ocorre uma ordenação deses processos para que ao final o todo esteja em ordem	
		Scanner input = new Scanner (System.in);
		
		int n, c, base, h, i, j;
		
		
		System.out.println("Digite o total de repetições: ");
		n = input.nextInt();
		
		int v [] = new int [n];
		
		for (i = 0; i < n; i++)
		{
			System.out.println("Digite o " + (i + 1) + "° número: ");
			v[i] = input.nextInt();
		}
		
		
		
		
		h = 1;
		base = 3;
		
		while (h < n)
		{
			h = base * h + 1;				//repetir enquanto h for menor que n (ou seja, o objetivo é ser maior q n)
		}					
		
		
		
		
		
		while (h > 0)
		{	
			h = (int) Math.floor(h/base);
			
			for (i = h + 1; i < n; i++)
			{
				c = v[i];
				j = i;
				
				while (j >= h && v[j - h] > c)
				{
					v[j] = v[j - h];
					j = j - h;
				} 
				v[j] = c;
			}
		}
		
		for (j = 0; j < n; j++)
		{
			System.out.print(v[j] + " ");
		}


		
		input.close();
	}
}