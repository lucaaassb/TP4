
public class DogInn {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Lucas", "Soares Barros", "lucassb395@gmail.com", "Quadra TESTE Conjunto TESTE", "senha123", "(61)92222-2222");
		PagamentoPIX pagPIX = new PagamentoPIX(50, "436.994.620-48");
		PagamentoCartaoDeCredito pagCred = new PagamentoCartaoDeCredito(50, "VISA", "Lucas Soares Barros", "5307 7236 7790 6360", "09/2022", "589");
		Pet pet = new Pet("Pinscher", "Pequeno", "Macho", "Bob", 10);
		PetSitter babaPet = new PetSitter("Filipe", "Barros", "emailteste@teste.com", "Quadra teste", "123senha", "(61)91111-1111");
		Servico servico = new Servico(1);
		
		
//		Imprimindo dados do 1º usuário		
		System.out.println("Dados do usuário teste: ");
		System.out.print("Nome: " + cliente.getNomeCliente() + " ");
		System.out.println(cliente.getSobrenomeCliente());
		System.out.println("Email: " + cliente.getEmailCliente());
		System.out.println("Endereço: " + cliente.getEnderecoCliente());
		System.out.println("Senha: " + cliente.getSenhaCliente());
		System.out.println("Celular: " + cliente.getCelularCliente());
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("\n");
//		=================================================================================================
		
//		Imprimindo dados do valor do pagamento e da CHAVE PIX
		System.out.println("Dados da Chave PIX teste");
		System.out.printf("Preço: R$%.2f \nChave: %s", pagPIX.getValorServico(), pagPIX.getChavePIX());
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("\n");
//		=================================================================================================
		
//		Imprimindo dados do valor do pagamento e do cartão de Crédito	
		System.out.println("Dados do Cartão de Crédito teste: ");
		System.out.printf("Preço: R$%.2f\n", pagCred.getValorServico());
		System.out.println("Bandeira do Cartão: "+ pagCred.getBandeiraCartao());
		System.out.println("Nome do titular do cartão: " + pagCred.getTitularCartao());
		System.out.println("Número do cartão: " + pagCred.getNumeroCartao());
		System.out.println("Data de Validade: " + pagCred.getDataValidade());
		System.out.println("Código de Segurança: " + pagCred.getCodigoSegurança());
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("\n");
//		=================================================================================================
		
//		Imprimindo dados do pet teste
		System.out.println("Dados do PET teste: ");
		System.out.println("Nome do pet: " + pet.getNome());
		System.out.println("Raça do pet: " + pet.getRaca());
		System.out.println("Tamanho do pet: " + pet.getTamanho());
		System.out.println("Sexo do pet: " + pet.getSexo());
		System.out.println("Peso do pet: " + pet.getPeso() + " kg");
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("\n");
//		=================================================================================================
		
//		Imprimindo dados do Pet Sitter
		System.out.println("Dados do Pet Sitter teste: ");
		System.out.print("Nome: " + babaPet.getNomePetSitter() + " ");
		System.out.println((babaPet.getSobrenomePetSitter()));
		System.out.println("Email: " + babaPet.getEmailPetSitter());
		System.out.println("Endereço: " + babaPet.getEnderecoPetSitter());
		System.out.println("Senha: " + babaPet.getSenhaPetSitter());
		System.out.println("Celular: " + babaPet.getCelularPetSitter());
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("\n");
//		=================================================================================================
		
//		Imprimindo dados do tipo de Serviço
		System.out.println("Dados do tipo de Serviço: ");
		System.out.println("Serviço escolhido: " + servico.getTipoServico());
		System.out.println("\n");
//		=================================================================================================
	}
}

