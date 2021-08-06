import javax.swing.JOptionPane;
public class Operacoes {
	public static void main(String[] args) {
		
		Conta c1;
		
		c1 = new Conta();
		c2 = new Conta();
		
		c1.numeroConta = 12345;
		c1.digtVerificador = 6;
		c1.titularNome = "Joao Cleber";
		c1.titularCPF = "123.456.789-0";
		c1.saldo = 1200.00;

		JOptionPane.showMessageDialog(null, c1.exibir());
		c1.deposito(50.00);
		
		if(c1.saque(150)) {
			JOptionPane.showMessageDialog(null, "Saque foi atorizado! ");
		}
		else {
			JOptionPane.showMessageDialog(null, "Saldo insuficioente");
		}
		
		JOptionPane.showMessageDialog(null, c1.exibir());
		
		c1.exibir(230.00);
		
		JOptionPane.showMessageDialog(null, c1.exibir());
	}
}
