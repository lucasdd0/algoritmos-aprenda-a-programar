package exercicios;
import java.util.Scanner;
public class exercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i, j, c;
		
		int v [] = {5, 12, 2, 17, 23, 1};			//total de elementos
		
		for (i = 0 ; i < (v.length-1) ; i++)		//for (i) controla cada uma das posições com a variável i. Visa localizar o menor número e leva-lo para a posição correta. Quando pegar o primeiro número, vai partir para o segundo e leva-lo para a posição correta.
		{						//-1 é para ter certeza que não vai dar erro
			for (j = i+1 ; j < v.length ; j++)		//for (j) posição que vai resceber o elemento.
			{		//i + 1 vai analisar o segundo, terceiro, quarto... termo
				if (v[i] > v[j])
				{									//troca entre os elementos 
					c = v[i];						//c = v[i] 			A variável c é usada como uma variável temporária para armazenar o valor do elemento na posição i do vetor v.
					v[i] = v[j];					//v[i] = v[j] 		o valor do elemento na posição j é movido para a posição i
					v[j] = c;						//v[j] = c			O valor armazenado temporariamente em c (que era originalmente o valor do elemento na posição i) é atribuído à posição j. Isso significa que o valor do elemento originalmente na posição i é movido para a posição j.  
				}
			}
		}
		for (i = 0 ; i < v.length ; i++)
		{
			System.out.print(v[i] + ", ");
		}
		
		input.close();
	}

}
