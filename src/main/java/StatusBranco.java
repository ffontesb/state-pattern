
public class StatusBranco implements Status {

	@Override
	public void processar(NotaFiscal notaFiscal) {
		System.out.println("Recebeu a interface.");
		notaFiscal.setStatus(this);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "STATUS BRANCO";
	}

}
