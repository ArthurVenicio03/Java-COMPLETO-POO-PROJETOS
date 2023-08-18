package exercicios;
import java.util.Scanner;
public class exercicio2_cursoJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double firstNum = sc.nextDouble();
		double secondNum = sc.nextDouble();
		sc.close();
		double soma = firstNum + secondNum;
		System.out.printf("Soma: %.2f%n", soma);
		
		
		

	}

}
