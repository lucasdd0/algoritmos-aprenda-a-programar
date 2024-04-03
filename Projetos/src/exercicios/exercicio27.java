package exercicios;
import java.util.Scanner;
public class exercicio27{							//compara de dois em dois deixando o maior valor em ultimo e e quando atualizar o u vai diminuir os indices até chegar a 1		
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int u, iu, j, n, c;
		
		System.out.println("Digite o total de repetições: ");
		n = input.nextInt();
		
		int v[] = new int [n];
		
		for (j = 0; j < n; j++)
		{
			System.out.println("Digite o " + (j + 1) + "° número: ");
			v[j] = input.nextInt();
		}
		
		u = n;
		
		while(u > 1)								//vai repetindo até q o menor valor seja o primeiro
		{
			iu = 0;									//variavel começa valendo 0
			for (j = 0; j < u - 1; j++)
			{				//u - 1 => como j + 1 vai ser o ultimo número, então j terá que analisar o penultimo número (u - 1)
				if (v[j] > v[j + 1])				//compara um elemento com o próximo 1 e 2, 2 e 3, 3 e 4...
				{
					c = v[j];
					v[j] = v [j + 1];
					v [j + 1] = c;
					iu = j;							//armazena a ultima troca
				}
			}
			u = iu;									//atualiza o valor de u (não vai valer n novamente pois n está fora do laço de repetição)	
		}
		
		for (j = 0; j < n; j++)
		{
			System.out.print(v[j] + " ");
		}
		
		input.close();
	}
}