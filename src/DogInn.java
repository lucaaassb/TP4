
public class DogInn {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Lucas", "Soares Barros", "lucassb395@gmail.com", "Quadra TESTE Conjunto TESTE", "senha123", "(61)92222-2222");
		PagamentoPIX pagPIX = new PagamentoPIX(50, "436.994.620-48");
		PagamentoCartaoDeCredito pagCred = new PagamentoCartaoDeCredito(50, "VISA", "Lucas Soares Barros", "5307 7236 7790 6360", "09/2022", "589");
		Pet pet = new Pet("Pinscher", "Pequeno", "Macho", "Bob", 10);
		PetSitter babaPet = new PetSitter("Filipe", "Barros", "emailteste@teste.com", "Quadra teste", "123senha", "(61)91111-1111");
		Servico servico = new Servico(1);

//		Imprimindo dados do usuario
		cliente.imprimirCliente(cliente);
//		=================================================================================================
		
//		Imprimindo dados do valor do pagamento e da CHAVE PIX
		pagPIX.imprimirChavePIX(pagPIX);
//		=================================================================================================
		
//		Imprimindo dados do valor do pagamento e do cartao de credito
		pagCred.imprimirCartaoDeCredito(pagCred);
//		=================================================================================================
		
//		Imprimindo dados do pet 
		pet.imprimirPet(pet);
//		=================================================================================================
		
//		Imprimindo dados do Pet Sitter
		babaPet.imprimirBaba(babaPet);
//		=================================================================================================
		
//		Imprimindo dados do tipo de servico
		servico.imprimirServico(servico);
//		=================================================================================================
	}
}

