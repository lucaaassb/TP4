public class PetSitter {
	String nomePetSitter, sobrenomePetSitter, emailPetSitter, enderecoPetSitter, senhaPetSitter, celularPetSitter;
	
	PetSitter(String nomePetSitter, String sobrenomePetSitter, String emailPetSitter, String enderecoPetSitter, String senhaPetSitter, String celularPetSitter) {
		this.nomePetSitter = nomePetSitter;
		this.sobrenomePetSitter = sobrenomePetSitter;
		this.emailPetSitter = emailPetSitter;
		this.enderecoPetSitter = enderecoPetSitter;
		this.senhaPetSitter = senhaPetSitter;
		this.celularPetSitter = celularPetSitter;
	}

	public String getNomePetSitter() {
		return nomePetSitter;
	}

	public String getSobrenomePetSitter() {
		return sobrenomePetSitter;
	}

	public String getEmailPetSitter() {
		return emailPetSitter;
	}

	public String getEnderecoPetSitter() {
		return enderecoPetSitter;
	}

	public String getSenhaPetSitter() {
		return senhaPetSitter;
	}

	public String getCelularPetSitter() {
		return celularPetSitter;
	}
	
	public void imprimirBaba(PetSitter babaPet) {
		System.out.println("Dados do Pet Sitter teste: ");
		System.out.print("Nome: " + babaPet.getNomePetSitter() + " ");
		System.out.println((babaPet.getSobrenomePetSitter()));
		System.out.println("Email: " + babaPet.getEmailPetSitter());
		System.out.println("Endere�o: " + babaPet.getEnderecoPetSitter());
		System.out.println("Senha: " + babaPet.getSenhaPetSitter());
		System.out.println("Celular: " + babaPet.getCelularPetSitter());
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("\n");
	}
	
}
