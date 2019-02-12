
public abstract class Conta {
	protected double saldo;
	
	public Conta(double saldo){
		this.saldo=saldo;
	}
	
	public double verificarSaldo(){
		return saldo;
	}
	
	public abstract void sacar(double valor);
	
	protected abstract void gerarTaxa();
}
