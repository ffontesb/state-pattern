
public class NotaFiscal {
	public int numero;
	public Status status;
	
	public NotaFiscal(int numero){
		this.numero = numero;
		this.status = new StatusBranco();
		processar();
	}

	
	public void setStatus(Status status) {
		this.status = status;
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
