package exercicios;
import java.util.Scanner;
public class exercicio28{							
	public static void main(String[] args) {	//a sequência será dividida em pedaços menores e ocorre uma ordenação deses processos para que ao final o todo esteja em ordem	
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
		base = 3;							//pode modificar para ver se vai se o algoritmo vai ser mais rápido ou mais lento
		
		while (h < n)
		{
			h = base * h + 1;				//repetir enquanto h for menor que n (ou seja, o objetivo é ser maior q n)
		}									//variável h vai tomar como base o trecho do algoritmo que será ordenado
											//vai determinar pedaços desse vetor para fazer o processo de ordenação
		
		
		
		
		
		while (h > 0)
		{	
			h = (int) Math.floor(h/base);	// a cada execução o valor desse h vai diminuindo de acordo com o valor da base 
			
			for (i = h; i < n; i++)			//h = resultado da divisão => i
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