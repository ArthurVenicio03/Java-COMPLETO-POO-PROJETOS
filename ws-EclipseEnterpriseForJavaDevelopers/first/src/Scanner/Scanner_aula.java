package Scanner;



import java.util.Scanner;

public class Scanner_aula {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	String x;
	int y;
	double z; 
	
	x = sc.next();/*  *  *  */y = sc.nextInt();/*** ****  **/  z = sc.nextDouble();
	
	System.out.println("Voce digitou: " + x +" " + y +  " "  + z);
	sc.close();

	}

}
