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

	public PetSitter() {
		
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
}
