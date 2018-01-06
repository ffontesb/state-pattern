
public class StatusReativada implements Status
{

	@Override
	public void processaStatus(NotaFiscal notaFiscal) {
		System.out.println("Reativou a nota");
		//notaFiscal.setStatus(this);
		System.out.println(notaFiscal);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "STATUS REATIVADO";
	}


}
