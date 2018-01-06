
public class StatusFinalizado implements Status {

	@Override
	public void processaStatus(NotaFiscal notaFiscal) {
		System.out.println("Processo e finalizou a nota");
		notaFiscal.setStatus(this);

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "STATUS FINALIZADO";
	}

}
