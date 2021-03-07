package atendimento;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int opcao = 0;
		Fila fila = new Fila();
		ListaMedicos medicos = new ListaMedicos();
		HistoricoAtendimentos historico = new HistoricoAtendimentos();
		
		Date d = new Date();
		String h = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(d);
		Paciente p1 = new Paciente("João", 4, h);
		Paciente p2 = new Paciente("Marcos", 3, h);
		Paciente p3 = new Paciente("Paula", 2, h);
		Paciente p4 = new Paciente("Márcia", 1, h);
		Paciente p5 = new Paciente("Neusa", 2, h);
		Paciente p6 = new Paciente("Vinícius", 3, h);
		Paciente p7 = new Paciente("Gabriel", 4, h);
		Paciente p8 = new Paciente("Manoel", 1, h);
		Paciente p9 = new Paciente("Pedro", 1, h);
		Paciente p10 = new Paciente("Marcela", 2, h);
		Paciente p11 = new Paciente("Letícia", 3, h);
		Paciente p12 = new Paciente("Carlos", 4, h);
		Paciente p13 = new Paciente("Rafael", 4, h);
		Paciente p14 = new Paciente("Rafaela", 3, h);
		Paciente p15 = new Paciente("Daniel", 2, h);
		Paciente p16 = new Paciente("Fábio", 1, h);
		Paciente p17 = new Paciente("Fabiana", 2, h);
		Paciente p18 = new Paciente("Fernando", 1, h);
		Paciente p19 = new Paciente("Marta", 4, h);
		Paciente p20 = new Paciente("Lucas", 3, h);
		fila.adicionarPaciente(p1);
		fila.adicionarPaciente(p2);
		fila.adicionarPaciente(p3);
		fila.adicionarPaciente(p4);
		fila.adicionarPaciente(p5);
		fila.adicionarPaciente(p6);
		fila.adicionarPaciente(p7);
		fila.adicionarPaciente(p8);
		fila.adicionarPaciente(p9);
		fila.adicionarPaciente(p10);
		fila.adicionarPaciente(p11);
		fila.adicionarPaciente(p12);
		fila.adicionarPaciente(p13);
		fila.adicionarPaciente(p14);
		fila.adicionarPaciente(p15);
		fila.adicionarPaciente(p16);
		fila.adicionarPaciente(p17);
		fila.adicionarPaciente(p18);
		fila.adicionarPaciente(p19);
		fila.adicionarPaciente(p20);
		Medico m1 = new Medico("medico1");
		Medico m2 = new Medico("medico2");
		medicos.adicionarMedico(m1);
		medicos.adicionarMedico(m2);
		do {
			System.out.println("\nEscolha uma opção: ");
			System.out.println("1 - Entrar na fila.");
			System.out.println("2 - Exibir fila");
			System.out.println("3 - Atendimento");
			System.out.println("4 - Cadastrar médico");
			System.out.println("5 - Finalizar atendimento");
			System.out.println("6 - Mostrar histórico de pacientes atendidos.");
			System.out.println("7 - Mostrar disponibilidade dos médicos.");
			System.out.println("Outra opção - Sair");
			
			opcao = s.nextInt();
			s.nextLine();
			switch (opcao) {
			case 1: {
				System.out.println("Informe o nome do paciente: ");
				String nome = s.nextLine();
				System.out.println("Definição da gravidade. Responda as perguntas com s para sim ou n para não. ");
				System.out.println("O paciente está com sangramento intensivo, dor intensa no peito e suor, "
						+ "problemas na respitação ou fraturas emergenciais com necessidade urgencial?");
				
				char resposta = s.next().charAt(0);
				int gravidade = 0;
				
				if(resposta == 's') {
					gravidade = 4;
				}else {
					System.out.println("O paciente está apresentando problemas em formular frases, aumento da frequência "
							+ "cardíaca, dor intensa, estado de pânico ou ferimentos menores?");
					resposta = s.next().charAt(0);
					if(resposta == 's') {
						gravidade = 3;
					}else {
						System.out.println("O paciente está apresentando dores leves, vômito, diarreia ou pequenas lesões?");
						resposta = s.next().charAt(0);
						if(resposta == 's') {
							gravidade = 2;
						}else {
							gravidade = 1;
						}
					}
				}
				
				Date dataHoraAtual = new Date();
				String horaChegada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dataHoraAtual);
				
				Paciente paciente = new Paciente(nome, gravidade, horaChegada);
				fila.adicionarPaciente(paciente);

				break;
			}
			case 2:{
				fila.exibirFila();
				
				break;
			}
			case 3:{
				System.out.println("Informe o nome do médico que irá atender o próximo paciente: ");
				String nome = s.nextLine();
				
				Medico medico = medicos.selecionar(nome);
				if(medico != null) {
					if(!medico.getDisponivel()) {
						System.out.println("O médico não está disponível.");
					}else {
						Paciente paciente = fila.remover();
						if(paciente != null) {
							medico.setDisponivel(false);
							Date dataHoraAtual = new Date();
							String horaAtendimento = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dataHoraAtual);
							paciente.setHoraAtendimento(horaAtendimento);
							historico.adicionarAtendimento(medico, paciente);
						}else {
							System.out.println("Não há pacientes na fila");
						}
					}
				}else {
					System.out.println("O médico não existe");
				}
				break;
			}
			case 4:{
				System.out.println("Informe o nome do médico: ");
				String nome = s.nextLine();
				
				Medico medico = new Medico(nome);
				medicos.adicionarMedico(medico);
				
				System.out.println("Médico cadastrado no sistema. ");
				
				break;
			}
			case 5:{
				System.out.println("Informe o nome do médico que está realizando o atendimento que será finalizado: ");
				String nome = s.nextLine();
				
				Medico medico = medicos.selecionar(nome);
				
				if(medico == null) {
					System.out.println("O médico não existe.");
				}else {
					medico.setDisponivel(true);
				}
				
				break;
			}
			case 6:{
				historico.mostrarAtendimentos();
				
				break;
			}
			case 7:{
				medicos.mostrarDisponibilidade();
				
				break;
			}
			default:
				opcao = 0;			}
		}while(opcao != 0);
	}
}
