
public class Principal {
	
	
	
	public static void main(String[] args) {
		NotaFiscal notaFiscal = new NotaFiscal(122379);
						
		StatusBranco statusBranco = new StatusBranco();
		statusBranco.processar(notaFiscal);
		System.out.println(notaFiscal);
		
		StatusFinalizado statusFinalizado = new StatusFinalizado();
		statusFinalizado.processar(notaFiscal);
		System.out.println(notaFiscal);
		
		StatusCancelado statusCancelado = new StatusCancelado();
		statusCancelado.processar(notaFiscal);
		System.out.println(notaFiscal);
	
	}

}
