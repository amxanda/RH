package view;

import java.util.*;

import model.Funcionario;
import model.Docente;
import model.Tecnico;
import model.Terceiro;
import model.RH;

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
			System.out.println("1 - Cadastro de funcion�rios.");
			System.out.println("2 - Pesquisar funcion�rios.");
			System.out.println("3 - Listar funcion�rios.");
			System.out.println("4 - Sair.");
			System.out.println("");

			System.out.print("Digite uma op��o: ");
			opmenu = leitor.nextInt();

			switch (opmenu) {
			case 1: {
				rh.Cadastrar(f1);
				break;
			}
			case 2: {
				rh.Pesquisar(nome);
				break;
			}
			case 3: {
				rh.Mostrar();
				break;
			}
			default:
				System.out.println("Op��o Inv�lida, tente novamente.");
			}
		} while (opmenu != 4);
	}
}
