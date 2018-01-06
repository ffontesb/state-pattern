
public class StatusBranco implements Status {

	@Override
	public void processaStatus(NotaFiscal notaFiscal) {
		System.out.println("Recebeu a interface.");
		System.out.println(notaFiscal);
		notaFiscal.setStatus(new StatusFinalizado());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "STATUS BRANCO";
	}

}
