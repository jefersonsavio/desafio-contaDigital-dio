
public abstract class Conta implements IConta{
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	private static final int AGENCIA_PADRAO = 00001;
	
	private static int SEQUENCIAL = 1;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	protected void informacoesDaConta() {
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("agencia: %d", this.agencia));
		System.out.println(String.format("numero: %d", this.numero));
		System.out.println(String.format("saldo: %.2f", this.saldo));
	}

	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	
	}

	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	
	

}
