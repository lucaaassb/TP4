
public class PagamentoPIX extends Pagamento{

	private String chavePIX;

	
	PagamentoPIX(float valorServico, String pix) {
		super(valorServico);
		this.chavePIX = pix;
	}


	public String getChavePIX() {
		return chavePIX;
	}
}