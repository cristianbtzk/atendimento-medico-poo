package atendimento;

import java.util.ArrayList;
import java.util.List;

public class HistoricoAtendimentos {
	private List<Atendimento> atendimentos = new ArrayList<Atendimento>();
	
	public void adicionarAtendimento(Medico medico, Paciente paciente) {
		Atendimento atendimento = new Atendimento(medico, paciente);
		
		atendimentos.add(atendimento);
	}
	
	public void mostrarAtendimentos() {
		System.out.println("Atendimentos registrados: ");
		for(Atendimento atendimento : atendimentos) {
			System.out.println(atendimento.toString());
		}
	}
	
	
}
