package view;

import model.Funcionario;
import model.Docente;
import model.Tecnico;
import model.Terceiro;
import java.util.*;

public class Main {
    public static void main(String[] arg) {
        int opmenu = 0;
        String nome;
    	String cpf;
        String endereco;
        String data;
        String titulacao;
        double salario;
    	String siape;
    	String area;
    	String departamento;
    	String dataFim;
    	String funcao;
        String tipo;

        Funcionario f1 = new Funcionario("nome","123.456.789-00");
        
        Scanner leitor = new Scanner(System.in);
        
        while(opmenu!=9) {
        	System.out.println(" --------- Menu ---------");
            System.out.println(" 1 - Cadastro de funcionários.");
            System.out.println(" 2 - Pesquisar funcionário.");
            System.out.println(" 3 - Listar funcionários.");
            System.out.println("");
            
            System.out.print("Digite uma opção: ");
            opmenu = leitor.nextInt();
			
            switch (opmenu) {
				case 1: {
					System.out.println(" Digite o tipo de funcionário a ser cadastrado: ");
					tipo = leitor.nextLine();
					
					if(tipo.equals("Docente") || tipo.equals("docente")) {
						System.out.print(" Nome: ");
						nome = leitor.nextLine();
						System.out.print(" CPF: ");
						cpf = leitor.nextLine();
						System.out.print(" SIAPE: ");
						siape = leitor.nextLine();
						System.out.print(" Área Vinculada: ");
						area = leitor.nextLine();
						System.out.print(" Endereço: ");
						endereco = leitor.nextLine();						
						System.out.print(" Data de admissão: ");
						data = leitor.nextLine();
						System.out.print(" Titulação: ");
						titulacao = leitor.nextLine();
						System.out.print(" Salário Base: ");
						salario = leitor.nextDouble();
					}
					else
					if(tipo.equals("Tecnico") || tipo.equals("tecnico")) {
						System.out.print(" Nome: ");
						nome = leitor.nextLine();
						System.out.print(" CPF: ");
						cpf = leitor.nextLine();
						System.out.print(" SIAPE: ");
						siape = leitor.nextLine();
						System.out.print("Departamento: ");
						departamento = leitor.nextLine();
						System.out.print(" Endereço: ");
						endereco = leitor.nextLine();
						System.out.print(" Data de admissão: ");
						data = leitor.nextLine();
						System.out.print(" Titulação: ");
						titulacao = leitor.nextLine();
						System.out.print(" Salário Base: ");
						salario = leitor.nextDouble();	
					}
					else
					if(tipo.equals("Terceiro") || tipo.equals("Terceiro")) {
						System.out.print(" Nome: ");
						nome = leitor.nextLine();
						System.out.print(" CPF: ");
						cpf = leitor.nextLine();
						System.out.print(" Endereço: ");
						endereco = leitor.nextLine();
						System.out.print("Função: ");
						funcao = leitor.nextLine();
						System.out.print(" Data de admissão: ");
						data = leitor.nextLine();
						System.out.print(" Data de fim de contrato: ");
						dataFim = leitor.nextLine();
						System.out.print(" Titulação: ");
						titulacao = leitor.nextLine();
						System.out.print(" Salário Base: ");
						salario = leitor.nextDouble();
					}
				break;
				}
				case 2: {
					if(tipo.equals("Docente") || tipo.equals("docente")) {
						System.out.println(" ");
					}
					else
					if(tipo.equals("Tecnico") || tipo.equals("tecnico")) {
						
					}
					else
					if(tipo.equals("Tereiro") || tipo.equals("terceiro")) {
						
					}
					
				break;
				}
				case 3: {
					
				break;
				}
            }
		}
    }
}
