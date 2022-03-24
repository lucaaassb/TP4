public class Pet {
	String raca, tamanho, sexo, nome;
	double peso;
	Cliente cliente;
	
	Pet(String raca, String tamanho, String sexo, String nome, double peso){
		this.nome = nome;
		this.raca = raca;
		this.tamanho = tamanho;
		this.sexo = sexo;
		this.peso = peso;
	}

	public Pet() {
		
	}

	public String getRaca() {
		return raca;
	}

	public String getTamanho() {
		return tamanho;
	}

	public String getSexo() {
		return sexo;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void imprimirPet(Pet pet) {
		System.out.println("Dados do PET teste: ");
		System.out.println("Nome do pet: " + pet.getNome());
		System.out.println("Ra�a do pet: " + pet.getRaca());
		System.out.println("Tamanho do pet: " + pet.getTamanho());
		System.out.println("Sexo do pet: " + pet.getSexo());
		System.out.println("Peso do pet: " + pet.getPeso() + " kg");
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("\n");
	}
	
}




	