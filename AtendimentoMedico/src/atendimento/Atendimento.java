package atendimento;

public class Atendimento {
	private Medico medico;
	private Paciente paciente;
	
	public Atendimento(Medico medico, Paciente paciente) {
		setMedico(medico);
		setPaciente(paciente);
	}
	
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [medico=");
		builder.append(medico);
		builder.append(", paciente=");
		builder.append(paciente);
		builder.append("]");
		return builder.toString();
	}
	
	
}
