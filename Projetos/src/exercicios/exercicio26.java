package exercicios;
import java.util.Scanner;					//a diferença entre esse e o anterior: o anterior vai invertendo o primeiro valor até ficar certo
public class exercicio26{					//e esse muda de uma vez pois o menor valor fica armazenado em min
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i, j, n, c, min;
		
		System.out.println("Digite o total de repetições: ");
		n = input.nextInt();
		
		int v [] = new int [n];
		
		for (i = 0; i < n; i++)
		{
			System.out.println("Digite o " + (i+1) + "° número: ");
			v[i] = input.nextInt();
		}
		
		for (i = 0; i < (n-1); i++)
		{
			min = i;						// Define min como a posição atual i
			for (j = i+1; j < n; j++)		// Loop para encontrar o índice do menor elemento no subarray não ordenado
			{								
				if (v[min] > v[j])			// Verifica se o elemento na posição i é maior que o elemento na posição j
				{
					min = j;				// Se sim, atualiza min para j
				}
			}
			c = v[min]; 					// Armazena o valor do menor elemento encontrado na variável c
            v[min] = v[i]; 					// Substitui o menor elemento encontrado pelo elemento na posição i
            v[i] = c;						// Substitui o elemento na posição i pelo valor armazenado em c (menor elemento)
		}
		
		for (i = 0; i < n; i++)
		{
			System.out.print(v[i] + ", ");
		}
		
		input.close();
	}
}