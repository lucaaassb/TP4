public class Cliente {
	String nomeCliente, sobrenomeCliente, emailCliente, enderecoCliente, senhaCliente, celularCliente;

	Cliente(String nomeCliente, String sobrenomeCliente, String emailCliente, String enderecoCliente, String senhaCliente, String celularCliente) {
		this.nomeCliente = nomeCliente;
		this.sobrenomeCliente = sobrenomeCliente;
		this.emailCliente = emailCliente;
		this.enderecoCliente = enderecoCliente;
		this.senhaCliente = senhaCliente;
		this.celularCliente = celularCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public String getCelularCliente() {
		return celularCliente;
	}
	
//	public void imprimirCliente(Cliente cliente) {
//		System.out.println("Dados do usu�rio teste: ");
//		System.out.print("Nome: " + cliente.getNomeCliente() + " ");
//		System.out.println(cliente.getSobrenomeCliente());
//		System.out.println("Email: " + cliente.getEmailCliente());
//		System.out.println("Endere�o: " + cliente.getEnderecoCliente());
//		System.out.println("Senha: " + cliente.getSenhaCliente());
//		System.out.println("Celular: " + cliente.getCelularCliente());
//		System.out.println("\n");
//		System.out.println("==========================================================");
//		System.out.println("\n");
	
}