package model;

import java.util.*;

public class RH extends Funcionario {
	String nome;
	String cpf;
	String endereco;
	String data;
	String titulacao;
	double salario;
	int siape;
	String area;
	String departamento;
	String dataFim;
	String funcao;
	String tipo;
	int i;

	Scanner leitor = new Scanner(System.in);
	ArrayList<Funcionario> cadastro = new ArrayList<>();

	Funcionario f1 = new Funcionario("", "");
	Docente d1 = new Docente("", "");
	Tecnico t1 = new Tecnico("", "");
	Terceiro t2 = new Terceiro("", "");

	public RH(String nome, String cpf) {
		super(nome, cpf);
	}

	public void Cadastrar() {

		System.out.print(" Digite o tipo de funcion�rio a ser cadastrado: ");
		tipo = leitor.nextLine();
		System.out.print("");

		if (tipo.equals("Docente") || tipo.equals("docente")) {
			System.out.print(" Nome: ");
			nome = leitor.nextLine();
			d1.setNome(nome);
			System.out.print(" CPF: ");
			cpf = leitor.nextLine();
			d1.setCpf(cpf);
			System.out.print(" SIAPE: ");
			siape = leitor.nextInt();
			d1.setSiape(siape);
			System.out.print(" Area Vinculada: ");
			area = leitor.nextLine();
			d1.setAreaVinculada(area);
			System.out.print(" Endere�o: ");
			endereco = leitor.nextLine();
			d1.setEndereco(endereco);
			System.out.print(" Data de admiss�o: ");
			data = leitor.nextLine();
			d1.setData(data);
			System.out.print(" Titula��o: ");
			titulacao = leitor.nextLine();
			d1.setTitulacao(titulacao);
			System.out.print(" Sal�rio Base: ");
			salario = leitor.nextDouble();
			d1.setSalario(salario);
			System.out.println("");
			
			cadastro.add(f1);
			
		} else if (tipo.equals("Tecnico") || tipo.equals("tecnico")) {
			System.out.print(" Nome: ");
			nome = leitor.nextLine();
			t1.setNome(nome);
			System.out.print(" CPF: ");
			cpf = leitor.nextLine();
			t1.setCpf(cpf);
			System.out.print(" SIAPE: ");
			siape = leitor.nextInt();
			t1.setSiape(siape);
			System.out.print("Departamento: ");
			departamento = leitor.nextLine();
			t1.setDepartamento(departamento);
			System.out.print(" Endere�o: ");
			endereco = leitor.nextLine();
			t1.setEndereco(endereco);
			System.out.print(" Data de admiss�o: ");
			data = leitor.nextLine();
			t1.setData(data);
			System.out.print(" Titula��o: ");
			titulacao = leitor.nextLine();
			t1.setTitulacao(titulacao);
			System.out.print(" Sal�rio Base: ");
			salario = leitor.nextDouble();
			t1.setSalario(salario);
			System.out.println("");
			
			cadastro.add(f1);
		} else if (tipo.equals("Terceiro") || tipo.equals("Terceiro")) {
			System.out.print(" Nome: ");
			nome = leitor.nextLine();
			t2.setNome(nome);
			System.out.print(" CPF: ");
			cpf = leitor.nextLine();
			t2.setCpf(cpf);
			System.out.print(" Endere�o: ");
			endereco = leitor.nextLine();
			t2.setEndereco(endereco);
			System.out.print("Fun��o: ");
			funcao = leitor.nextLine();
			t2.setFuncao(funcao);
			System.out.print(" Data de admiss�o: ");
			data = leitor.nextLine();
			t2.setData(data);
			System.out.print(" Data de fim de contrato: ");
			dataFim = leitor.nextLine();
			t2.setDataFim(dataFim);
			System.out.print(" Titula��o: ");
			titulacao = leitor.nextLine();
			t2.setTitulacao(titulacao);
			System.out.print(" Sal�rio Base: ");
			salario = leitor.nextDouble();
			t2.setSalario(salario);
			System.out.println("");
			
			cadastro.add(f1);
		}
	}

	public void Pesquisar() {

	}

	public void Mostrar() {
			
		for ( Funcionario f1: cadastro ) {
			if (tipo.equals("Docente") || tipo.equals("docente")) {
				System.out.println(" Nome: " + d1.getNome());
				System.out.println(" CPF: " + d1.getCpf());
				System.out.println(" SIAPE: " + d1.getSiape());
				System.out.println(" Area Vinculada: " + d1.getAreaVinculada());
				System.out.println(" Endere�o: " + d1.getEndereco());
				System.out.println(" Data de admiss�o: " + d1.getData());
				System.out.println(" Titula��o: " + d1.getTitulacao());
				System.out.println(" Sal�rio Base: " + d1.getSalario());
				System.out.println(" Sal�rio total: " + d1.calculaSalario(salario));
				System.out.println("");
			} else if (tipo.equals("Tecnico") || tipo.equals("tecnico")) {
				System.out.println(" Nome: " + t1.getNome());
				System.out.println(" CPF: " + t1.getCpf());
				System.out.println(" SIAPE: " + t1.getSiape());
				System.out.println(" Departamento: " + t1.getDepartamento());
				System.out.println(" Endere�o: " + t1.getEndereco());
				System.out.println(" Data de admiss�o: " + t1.getData());
				System.out.println(" Titula��o: " + t1.getTitulacao());
				System.out.println(" Sal�rio Base: " + t1.getSalario());
				System.out.println(" Sal�rio total: " + t1.calculaSalario(salario));
				System.out.println("");
			} else if (tipo.equals("Terceiro") || tipo.equals("Terceiro")) {
				System.out.println(" Nome: " + t2.getNome());
				System.out.println(" CPF: " + t2.getCpf());
				System.out.println(" Endere�o: " + t2.getEndereco());
				System.out.println(" Fun��o: " + t2.getFuncao());
				System.out.println(" Data de admiss�o: " + t2.getData());
				System.out.println(" Data de fim de contrato: " + t2.getDataFim());
				System.out.println(" Titula��o: " + t2.getTitulacao());
				System.out.println(" Sal�rio Base: " + t2.getSalario());
				System.out.println(" Sal�rio total: " + t2.calculaSalario(salario));
				System.out.println("");
			}
		}
	}
}