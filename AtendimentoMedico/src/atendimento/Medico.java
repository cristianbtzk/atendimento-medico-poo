package atendimento;

public class Medico {
	private String nome;
	private Boolean disponivel;
	
	public Medico(String nome) {
		setNome(nome);
		this.disponivel = true;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [nome=");
		builder.append(nome);
		builder.append(", disponivel=");
		builder.append(disponivel);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
