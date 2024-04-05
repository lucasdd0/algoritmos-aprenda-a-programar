package exercicios;
import java.util.Scanner;
public class exercicio31 {								//só vai funcionar se os números estiverem em ordem!!!
	public static void main(String[] args) {			//nessa caso é só a estrutura que facilita a busca: BUSCA BINÁRIA
		Scanner input = new Scanner (System.in);
		
		int n, buscando, i;
		
		System.out.println("Digite o tamanho do array: ");
		n = input.nextInt();
		
		int v [] = new int [n];
		
		
		for (i = 0; i < n; i++)
		{
			System.out.println("Digite o " + (i + 1) + "º elemento: ");
			v[i] = input.nextInt();	
		}
		
		System.out.println("Digite o valor a ser buscado: ");
		buscando = input.nextInt();
		
		boolean achou = false;
		int inicio = 0;
		int fim = n - 1;				//o vetor começa com 0, logo se são, por exemplo, 8 posições, a ultima vai ser a 7
		int meio;
		int contador = 0;
		
		while (inicio <= fim)						
		{
			meio = (int) ((inicio + fim)/2);		//vai pegar apenas a parte inteira dos índices, exemplo: 7 + 0/ 2 = 3,5 arredonda para baixo = 3		
			contador++;								//conta quantos teste a busca fez 		(NAO PRECISA DESSA PARTE)
			if (v[meio] == buscando)				//vai dividindo até que o meio se torne o buscado
			{
				achou = true;
				break;
			}
			else if (v[meio] < buscando)
			{
				inicio = meio + 1;
			}
			else
			{
				fim = meio - 1;
			}
		}
		
		System.out.println("Quantidade de testes: " + contador);	//NAO PRECSISA DESSA PARTE
		
		if (achou == true) 
		{
			System.out.println("O valor " + buscando + " foi encontrado no indice " + i + " do array"); // lembrando que o array começa sempre com 0		
		}
		else
		{
			System.err.println("O valor " + buscando + " não foi encontrado!");
		}
		
		
		input.close();
	}

}
