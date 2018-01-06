
public class Principal {
	
	
	
	public static void main(String[] args) {
		NotaFiscal notaFiscal = new NotaFiscal(122379);
		 				
		System.out.println(notaFiscal);
		
		StatusFinalizado statusFinalizado = new StatusFinalizado();
		statusFinalizado.processaStatus(notaFiscal);
		System.out.println(notaFiscal);
		
		StatusCancelado statusCancelado = new StatusCancelado();
		statusCancelado.processaStatus(notaFiscal);
		System.out.println(notaFiscal);
	
	}

}
