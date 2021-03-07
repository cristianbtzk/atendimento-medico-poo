package atendimento;

import java.util.ArrayList;
import java.util.List;

public class ListaMedicos {
	private List<Medico> medicos = new ArrayList<Medico>();
	
	public void adicionarMedico(Medico medico) {
		medicos.add(medico);
	}
	
	public void mostrarDisponibilidade() {
		System.out.println("Medicos/disponibilidade: ");

		for (Medico medico : medicos) {
			System.out.println(medico.toString());
		}
	}
	
	public Medico selecionar(String nome) {
		for (Medico medico : medicos) {
			if(nome.equals(medico.getNome())) {
				return medico;
			}
		}
		
		return null;
	}
}
