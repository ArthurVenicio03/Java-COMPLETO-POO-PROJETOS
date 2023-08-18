package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Ex1_resolvido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Double Largura = sc.nextDouble();
		Double Comprimento = sc.nextDouble();
		Double MetroQuadrado = sc.nextDouble();
		sc.close();
		Double area = Largura * Comprimento;
		Double valorTotal = area * MetroQuadrado;
		
		System.out.printf("Area : %.2f%n", area);
		System.out.printf("preco : %.2f%n", valorTotal);
	}

}
