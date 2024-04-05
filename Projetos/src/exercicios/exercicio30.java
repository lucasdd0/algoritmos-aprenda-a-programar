package exercicios;
import java.util.Scanner;
public class exercicio30 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n, valor, i;
		
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
		
		
		boolean achou = false;
		
		for (i = 0; i < n; i++)	
		{
			if (v[i] == valor)		//não precisa colocar o else nem o achou = false pois como o valor incial do achou é falso, se essa parte da estruturta não for executada o boolean não vai mudar pata true		
			{
				achou = true;
				break;
			}
		}
		
		if (achou == true) 
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
