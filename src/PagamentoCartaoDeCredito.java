
public class PagamentoCartaoDeCredito extends Pagamento{
	private String bandeiraCartao, numeroCartao, dataValidade, titularCartao, codigoSeguranca;
	
	PagamentoCartaoDeCredito(float valorServico, String bandeiraCartao, String titularCartao, String numeroCartao, String dataValidade, String codigoSeguranca) {
		super(valorServico);
		this.bandeiraCartao = bandeiraCartao;
		this.titularCartao = titularCartao;
		this.numeroCartao = numeroCartao;
		this.dataValidade = dataValidade;
		this.codigoSeguranca = codigoSeguranca;
	}

	public String getBandeiraCartao() {
		return bandeiraCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public String getTitularCartao() {
		return titularCartao;
	}

	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}
	
	public void imprimirCartaoDeCredito(PagamentoCartaoDeCredito pagCred) {
		System.out.println("Dados do Cart�o de Cr�dito teste: ");
		System.out.printf("Pre�o: R$%.2f\n", pagCred.getValorServico());
		System.out.println("Bandeira do Cart�o: "+ pagCred.getBandeiraCartao());
		System.out.println("Nome do titular do cart�o: " + pagCred.getTitularCartao());
		System.out.println("N�mero do cart�o: " + pagCred.getNumeroCartao());
		System.out.println("Data de Validade: " + pagCred.getDataValidade());
		System.out.println("C�digo de Seguran�a: " + pagCred.getCodigoSeguranca());
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("\n");
	}
}

	