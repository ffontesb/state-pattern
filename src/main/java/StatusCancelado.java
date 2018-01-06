
public class StatusCancelado implements Status {

	@Override
	public void processar(NotaFiscal notaFiscal) {
		System.out.println("Cancelou a nota");
		notaFiscal.setStatus(this);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "STATUS CANCELADO";
	}

}
