package atendimento;

public class Fila {
	private Paciente inicio;
	private Paciente fim;
	private Paciente aux;
	
	public void adicionarPaciente(Paciente paciente) {
		if(inicio == null) {
			inicio = paciente;
			fim = paciente;
			paciente.setProximo(null);
		}else {
			aux = inicio;
			while(aux != null){
				if(aux == inicio && paciente.getGravidade() > aux.getGravidade()) {
					paciente.setProximo(aux);
					inicio = paciente;
					aux = null;

				}else {
					if(aux.getProximo() == null || aux.getProximo().getGravidade() < paciente.getGravidade()) {
						paciente.setProximo(aux.getProximo());
						aux.setProximo(paciente);
						aux = null;
					}else {
						aux = aux.getProximo();
					}
				}
			}
		}
		
		System.out.println(paciente.getNome()+" entrou na fila.");
	}
	
	public void exibirFila(){
		if (inicio == null){
			System.out.println("Não há pacientes na fila.");
		}
		else
		{
			System.out.println("Pacientes na fila: ");
			aux = inicio;
			while(aux != null){
				System.out.print(aux.getNome()+" ");
				aux = aux.getProximo();
			}
		}
	}
	
	public Paciente remover() {
		if(inicio == null) {
			return null;
		}else {
			System.out.println(inicio.getNome()+ " saiu da fila e será atendido.");
			aux = inicio;
			inicio = inicio.getProximo();
			return aux;
		}
	}
}
