
public class ContaCorrente extends Conta {
	private double limite;
	private int servico;
	
	public final static int MIN_SERVICO=1;
	public final static int MAX_SERVICO=2;
	
	public ContaCorrente(double valor,double limite){
		this(valor,limite,MIN_SERVICO);
	}
	
	public ContaCorrente(double valor,double limite,int servico){
		super(valor);
		
		this.servico=servico;
		this.limite=limite;
	}

	@Override
	public void sacar(double valor) {
		if(valor>0 && (saldo+limite)>=valor){
			saldo-=valor;
		}
		
	}

	@Override
	protected void gerarTaxa() {
		if(saldo<0){
			saldo-=(-1*saldo)*0.01;
		}
		
		if(servico==MIN_SERVICO){
			saldo-=7.5;
		}else{
			saldo-=15;
		}
		
	}
	
	
	
}
