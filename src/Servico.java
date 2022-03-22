
public class Servico {
	private String tipoServico;
	
	Servico(int tipoServico) {
		
		switch(tipoServico) {
		case 1:
			this.tipoServico = "Hospedagem";
			break;
		case 2:
			this.tipoServico = "Creche";
			break;
		case 3:
			this.tipoServico = "Pet Sitter";
			break;
		default:
			this.tipoServico = "Outro servi�o";
		}
	}

	public String getTipoServico() {
		return tipoServico;
	}
	
	public void imprimirServico(Servico servico) {
		System.out.println("Dados do tipo de Servi�o: ");
		System.out.println("Servi�o escolhido: " + servico.getTipoServico());
		System.out.println("\n");
	}
	
}
