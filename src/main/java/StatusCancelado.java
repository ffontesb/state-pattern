
public class StatusCancelado implements Status {

	@Override
	public void processaStatus(NotaFiscal notaFiscal) {
		System.out.println("Cancelou a nota");
		//notaFiscal.setStatus(this);
		System.out.println(notaFiscal);
		notaFiscal.setStatus(new StatusReativada());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "STATUS CANCELADO";
	}

}
