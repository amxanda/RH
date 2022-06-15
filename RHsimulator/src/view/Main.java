package view;

import model.Funcionario;

import java.util.*;

import model.Docente;
import model.Tecnico;
import model.Terceiro;
import model.RH;

public class Main {
	public static void main(String[] arg) {
		int opmenu = 0;
		String nome;

		Scanner leitor = new Scanner(System.in);
		Funcionario f1 = new Funcionario("", "");
		RH rh = new RH("", "");

		do {
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
				rh.Cadastrar();
				break;
			}
			case 2: {
				System.out.println("Digite o nome do funcion�rio a ser pesquisado: ");
				nome = leitor.nextLine();
				break;
			}
			case 3: {
				rh.Mostrar();
				break;
			}
			default:
				System.out.println(" Op��o Inv�lida, tente novamente.");
			}
		} while (opmenu != 4);
	}
}
