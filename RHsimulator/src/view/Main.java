package view;

import java.util.*;

import model.Funcionario;
import model.Docente;
import model.Tecnico;
import model.Terceiro;

public class Main {
	public static void main(String[] arg) {
		int opmenu = 0;
		String nome = null;
		String tipo;

		Scanner leitor = new Scanner(System.in);
		Funcionario f1 = new Funcionario("","","","","",0);
		RH rh = new RH();

		do {
			System.out.println("");
			System.out.println("--------- Menu ---------");
			System.out.println("1 - Cadastro de funcionários.");
			System.out.println("2 - Pesquisar funcionários.");
			System.out.println("3 - Listar funcionários.");
			System.out.println("4 - Sair.");
			System.out.println("");

			System.out.print("Digite uma opção: ");
			opmenu = leitor.nextInt();

			switch (opmenu) {
			case 1: {
				rh.cadastrar();
				break;
			}
			case 2: {		
				System.out.println(rh.pesquisar(nome)); 
				break;
			}
			case 3: {
				System.out.println(rh.mostra());
				break;
			}
			default:
				System.out.println("Opção Inválida, tente novamente.");
			}
		} while (opmenu != 4);
	}
}
