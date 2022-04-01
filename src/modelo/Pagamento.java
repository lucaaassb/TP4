package modelo;

public abstract class Pagamento {
		
	private float valorServico;
	
	Pagamento(float valorServico) {
		this.valorServico = valorServico;
	}
	
	public void inserirValor(float valorServico) {
		this.valorServico = valorServico;
	}

	public float getValorServico() {
		return valorServico;
	}

}



