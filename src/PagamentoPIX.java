
public class PagamentoPIX extends Pagamento{

	private String chavePIX;

	
	PagamentoPIX(float valorServico, String pix) {
		super(valorServico);
		this.chavePIX = pix;
	}


	public String getChavePIX() {
		return chavePIX;
	}
	
	public void imprimirChavePIX(PagamentoPIX pagPIX) {
		System.out.println("Dados da Chave PIX teste");
		System.out.printf("Pre�o: R$%.2f \nChave: %s", pagPIX.getValorServico(), pagPIX.getChavePIX());
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("\n");
	}
}