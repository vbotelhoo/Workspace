
public class Folha {
	public static void main(String[] args) {
		
		RH p1, p2, p3;
		 
		p1 = new RH(123, "Vitor", "vitor@email.com", 1250.00);
		p2 = new RH(321, "Pedro", "pedro@email.com", 2500.00);
		p3 = new RH(147, "Joao", "joao@email.com", 5500.00);
		
// -----------------------------------------------------------------
//		p1.setNumeroFuncional(123);
//		p1.setNome("Vitor");
//		p1.setEmail("vitor@email.com");
//		p1.setSalario(1250.00);
//		
//		p2.setNumeroFuncional(321);
//		p2.setNome("Pedro");
//		p2.setEmail("pedro@email.com");
//		p2.setSalario(2500);
//		
//		p3.setNumeroFuncional(147);
//		p3.setNome("Joao");
//		p3.setEmail("joao@email.com");
//		p3.setSalario(5500.00);
// -----------------------------------------------------------------		
		
		System.out.println(p1.exibirInfo());
		System.out.println(p2.exibirInfo());
		System.out.println(p3.exibirInfo());
		
		p1.reajustarSalario();
		p2.reajustarSalario();
		p3.reajustarSalario();
		
		System.out.println("_________________________________________________");
		System.out.println("             REAJUSTE SALARIAL");
		System.out.println("_________________________________________________");
		System.out.println(p1.exibirInfo());
		System.out.println(p2.exibirInfo());
		System.out.println(p3.exibirInfo());
	}
}
