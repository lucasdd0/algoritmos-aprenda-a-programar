package exercicios;
import java.util.Scanner;
public class exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double hsemanais, hmes, porcentagem, dsr, total, resultado;
		
		System.out.println("Digite quantas horas você trabalha por semana: ");
		hsemanais = input.nextDouble();
		
		hmes = hsemanais * 4.5;
		porcentagem = hmes * 0.10;
		total = hmes + porcentagem;
		dsr = total /6;
		
		resultado = total + dsr;
		
		System.out.println("Seu salário é: " + String.format("%.2f", resultado));
		
		input.close();
	}
}