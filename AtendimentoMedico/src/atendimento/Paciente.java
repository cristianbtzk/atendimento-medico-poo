package atendimento;

public class Paciente {
	private String nome;
	private int gravidade;
	private String horaChegada;
	private String horaAtendimento;
	private Paciente proximo;
	
	public Paciente(String nome, int gravidade, String horaChegada) {
		setNome(nome);
		setGravidade(gravidade);
		setHoraChegada(horaChegada);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0)
			this.nome = nome;
	}
	public int getGravidade() {
		return gravidade;
	}
	public void setGravidade(int gravidade) {
		if(gravidade > 0)
			this.gravidade = gravidade;
	}
	public String getHoraChegada() {
		return horaChegada;
	}
	public void setHoraChegada(String horaChegada) {
		if(horaChegada.length() > 0)
			this.horaChegada = horaChegada;
	}
	public String getHoraAtendimento() {
		return horaAtendimento;
	}
	public void setHoraAtendimento(String horaAtendimento) {
		if(horaAtendimento.length() > 0)
			this.horaAtendimento = horaAtendimento;
	}
	public Paciente getProximo() {
		return proximo;
	}
	public void setProximo(Paciente proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [nome=");
		builder.append(nome);
		builder.append(", gravidade=");
		builder.append(gravidade);
		builder.append(", horaChegada=");
		builder.append(horaChegada);
		builder.append(", horaAtendimento=");
		builder.append(horaAtendimento);
		builder.append("]");
		return builder.toString();
	}
	
	
}

