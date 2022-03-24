import java.util.Scanner;

public class DogInn {
	public static void main(String[] args) {
//		Cliente cliente = new Cliente("Lucas", "Soares Barros", "lucassb395@gmail.com", "Quadra TESTE Conjunto TESTE", "senha123", "(61)92222-2222");
//		PagamentoPIX pagPIX = new PagamentoPIX(50, "436.994.620-48");
//		PagamentoCartaoDeCredito pagCred = new PagamentoCartaoDeCredito(50, "VISA", "Lucas Soares Barros", "5307 7236 7790 6360", "09/2022", "589");
//		Pet pet = new Pet("Pinscher", "Pequeno", "Macho", "Bob", 10);
//		PetSitter babaPet = new PetSitter("Filipe", "Barros", "emailteste@teste.com", "Quadra teste", "123senha", "(61)91111-1111");
//		Servico servico = new Servico(1);
		

//		Imprimindo dados do usuario
//		cliente.imprimirCliente(cliente);
//		=================================================================================================
//		
//		Imprimindo dados do valor do pagamento e da CHAVE PIX
//		pagPIX.imprimirChavePIX(pagPIX);
//		=================================================================================================
//		
//		Imprimindo dados do valor do pagamento e do cartao de credito
//		pagCred.imprimirCartaoDeCredito(pagCred);
//		=================================================================================================
//		
//		Imprimindo dados do pet 
//		pet.imprimirPet(pet);
//		=================================================================================================
//		
//		Imprimindo dados do Pet Sitter
//		babaPet.imprimirBaba(babaPet);
//		=================================================================================================
//		
//		Imprimindo dados do tipo de servico
//		servico.imprimirServico(servico);
//		=================================================================================================
	}
	
	public static void cadastrarCliente() {
		
		Scanner ler = new.Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		this.nomeCliente = ler.nextLine();
		
		System.out.println("Digite o sobrenome: ");
		this.sobrenomeCliente = ler.nextLine();
		
		System.out.println("Digite o email: ");
		emailCliente = ler.nextLine();
		
		System.out.println("Digite o endereco: ");
		enderecoCliente = ler.nextLine();
		
		System.out.println("Digite a senha: ");
		senhaCliente = ler.nextLine();
		
		System.out.println("Digite o numero de celular: ");
		celularCliente = ler.nextLine();
	}
	
	public static void cadastrarPet() {
		Scanner ler = new.Scanner(System.in);
		String raca, tamanho, sexo, nome;
		double peso;
		
		System.out.println("Digite a raça do pet: ");
		raca = ler.nextLine();
		
		System.out.println("Digite o tamanho do pet: ");
		tamanho = ler.nextLine();
		
		System.out.println("Digite o sexo do pet: ");
		sexo = ler.nextLine();
		
		System.out.println("Digite o nome do pet: ");
		nome = ler.nextLine();
		
		System.out.println("Digite o peso do pet: ");
		peso = ler.nextDouble();
	}
	
	public static void cadastrarCartao() {
		Scanner ler = new.Scanner(System.in);
		private String bandeiraCartao, numeroCartao, dataValidade, titularCartao, codigoSeguranca;
		
		System.out.println("Digite a bandeira do cartao: ");
		bandeiraCartao = ler.nextLine();
		
		System.out.println("Digite o numero do cartao: ");
		numeroCartao = ler.nextLine();
		
		System.out.println("Digite a data de validade: ");
		dataValidade = ler.nextLine();
		
		System.out.println("Digite o nome do titular do cartao: ");
		titularCartao = ler.nextLine();
		
		System.out.println("Digite o codigo de seguranca do cartao: ");
		codigoSeguranca = ler.nextLine();
	}
	
	public static void cadastrarSitter() {
		Scanner ler = new.Scanner(System.in);
		String nomePetSitter, sobrenomePetSitter, emailPetSitter, enderecoPetSitter, senhaPetSitter, celularPetSitter;
		
		System.out.println("Digite o nome do sitter: ");
		nomePetSitter = ler.nextLine();
		
		System.out.printl("Digite o sobrenome do sitter: ");
		sobrenomePetSitter = ler.nextLine();
		
		System.out.println("Digite o email do sitter: ");
		emailPetSitter = ler.nextLine();
		
		System.out.println("Digite o endereco do sitter: ");
		enderecoPetSitter = ler.nextLine();
		
		System.out.println("Digite a senha: ");
		senhaPetSitter = ler.nextLine();
		
		System.out.println("Digite o numero de celular do sitter: ");
		celularPetSitter = ler.nextLine();
	}
	
}

