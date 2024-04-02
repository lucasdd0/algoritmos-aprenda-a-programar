package exercicios;
import java.util.Scanner;
public class exercicio22 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		int i, j;
		
		int matriz [][] = new int [3][3];
		
		for (i = 0; i < 3; i ++) {
			for (j = 0; j < 3; j ++) {
				System.out.println("Informe o valor [" + (i + 1) + "][" + (j + 1) + "]: ");
				matriz [i][j] = input.nextInt();
			}
		}
		
		System.out.println("Sua matriz é");
		for (i = 0; i < 3; i ++) {
			for (j = 0; j < 3; j ++) {
				System.out.print("  " + matriz [i][j]);
			}
			System.out.println();
		}
		
		
		input.close();
	}
}

