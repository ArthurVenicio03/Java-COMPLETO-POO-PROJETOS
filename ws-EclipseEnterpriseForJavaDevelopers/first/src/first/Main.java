package first;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double y= 32.89997;
		System.out.printf("%.2f%n", y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", y);
	}	
}
