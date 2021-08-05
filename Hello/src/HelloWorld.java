import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Hello World");
		int a;
		System.out.println("Digite o valor de a: ");
		a = x.nextInt();
		System.out.println("Voce digitou " + a);
		x.close();
	}
}
