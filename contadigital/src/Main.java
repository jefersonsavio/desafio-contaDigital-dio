
public class Main {

	public static void main(String[] args) {
		
		Cliente jeferson = new Cliente();
		jeferson.setNome("JEFERSON");
		
		Conta corrente = new ContaCorrente(jeferson);
		corrente.depositar(100);
		corrente.informacoesDaConta();

		Conta poupanca = new ContaPoupanca(jeferson);
		corrente.transferir(poupanca, 100);
		
		corrente.informacoesDaConta();
		poupanca.informacoesDaConta();
	}

}
