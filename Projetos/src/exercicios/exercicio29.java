package exercicios;
import java.util.Scanner;
public class exercicio29 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n, valor, achei, i;
		
		System.out.println("Digite o tamanho do array: ");
		n = input.nextInt();
		
		int v [] = new int [n];
		
		
		for (i = 0; i < n; i++)
		{
			System.out.println("Digite o " + (i + 1) + "º elemento: ");
			v[i] = input.nextInt();	
		}
		
		System.out.println("Digite o valor a ser buscado: ");
		valor = input.nextInt();
		
		
		achei = 0;					// começa valendo 0 e quando valer 1 o while será encerrado
		i = 0;						// começa com 0 e vai adicionando +1 no indice até achar o elemento
		
		while (i < n && achei == 0)
		{
			if (v[i] == valor)
			{
				achei = 1;			// encehrra o while porque a estrutura de repetição tem o 'achei' valendo 0
			}
			else
			{
				i++;				// ou i = i + 1;
			}
		}
		
		if (achei == 1) 			// quando valer 1, executar essa parte onde imprime o valor que deseja encontrar
		{
			System.out.println("O valor " + valor + " foi encontrado no indice " + i + " do array"); // lembrando que o array começa sempre com 0		
		}
		else
		{
			System.err.println("O valor " + valor + " não foi encontrado!");
		}
		
		input.close();
	}

}
