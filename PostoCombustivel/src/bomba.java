import java.util.Scanner;
public class bomba {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		sistema b1;
		String meth;
		
		
		b1 = new sistema("Gasolina",b1.abastecerValor(),b1.abastecerLitro(),10.25);
		
		meth = x.next();
		
		if(meth == "Litro") {
			b1.abastecerLitro();
		}
		else {
			b1.abastecerValor();
		}
		
		
		System.out.println(b1.exibirRecibo());
		
		x.close();
	}
}
