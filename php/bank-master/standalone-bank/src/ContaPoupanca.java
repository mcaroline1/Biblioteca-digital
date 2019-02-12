
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(double saldo){
		super(saldo);
	}
	
	public void sacar(double valor){
		if(saldo>=valor){
			saldo-=valor;
		}
	}
	
	public void gerarTaxa(){
		saldo+=saldo*0.006;//saldo*=1.006;
	}
	
	

}
