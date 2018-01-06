
public class NotaFiscal {
	private int numero;
	private Status status;
	
	public NotaFiscal(int numero){
		this.numero = numero;
		setStatus(new StatusBranco());
	}

	
	public void setStatus(Status status) {
		this.status = status;
		processar();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.numero + "-" + this.status.toString() + "\n";
	}
	
	public void processar(){
		this.status.processaStatus(this);
	}
	
}
