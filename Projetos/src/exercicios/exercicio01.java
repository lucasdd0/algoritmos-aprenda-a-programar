package exercicios;
import java.util.Scanner;
public class exercicio01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int dh, mh, ah, dn, mn, an, th, tn, total;
		
		System.out.println("Digite o dia de hoje: ");
		dh = input.nextInt();
		
		System.out.println("Digite o mês de hoje: ");
		mh = input.nextInt();
		
		System.out.println("Digite o ano de hoje: ");
		ah = input.nextInt();
		
		System.out.println("Digite o dia que nasceu: ");
		dn = input.nextInt();
		
		System.out.println("Digite o mês que nasceu: ");
		mn = input.nextInt();
		
		System.out.println("Digite o ano que nasceu: ");
		an = input.nextInt();
		
		th = dh + (mh*30) + (ah*365);
		tn = dn + (mn*30) + (an*365);
		
		total = th-tn;
		
		System.out.println(total);
		
		input.close();
	}
}