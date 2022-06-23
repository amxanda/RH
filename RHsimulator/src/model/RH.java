package model;

import java.util.*;

public class RH {
	//atributos
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

	Scanner leitor = new Scanner(System.in);
	ArrayList<Funcionario> cadastro = new ArrayList<>();

	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setSiape(int siape) {
		this.siape = siape;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//getters
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getData() {
		return data;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public double getSalario() {
		return salario;
	}

	public int getSiape() {
		return siape;
	}

	public String getArea() {
		return area;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getDataFim() {
		return dataFim;
	}

	public String getFuncao() {
		return funcao;
	}

	public String getTipo() {
		return tipo;
	}
	
	//dados docente
	public Docente docente() {
		System.out.print("Nome: ");
		this.nome = leitor.nextLine();
		System.out.print("CPF: ");
		this.cpf = leitor.nextLine();
		System.out.print("Endereço: ");
		this.endereco = leitor.nextLine();
		System.out.print("Data de admissão: ");
		this.data = leitor.nextLine();
		System.out.print("Titulação: ");
		this.titulacao = leitor.nextLine();
		System.out.print("Salário Base: ");
		this.salario = leitor.nextDouble();
		System.out.print("SIAPE: ");
		this.siape = leitor.nextInt();
		System.out.print("Area Vinculada: ");
		this.area = leitor.nextLine();

		System.out.println("");

		Docente d = new Docente(this.nome, this.cpf, this.endereco, this.data, this.titulacao, this.salario, this.siape, this.area);
		d.calculaSalario();
		
		return d;
	}

	//dados tecnico
	public Tecnico tecnico() {
		System.out.print("Nome: ");
		this.nome = leitor.nextLine();
		System.out.print("CPF: ");
		this.cpf = leitor.nextLine();
		System.out.print("Endereço: ");
		this.endereco = leitor.nextLine();
		System.out.print("Data de admissão: ");
		this.data = leitor.nextLine();
		System.out.print("Titulação: ");
		this.titulacao = leitor.nextLine();
		System.out.print("Salário Base: ");
		this.salario = leitor.nextDouble();
		System.out.print("SIAPE: ");
		this.siape = leitor.nextInt();
		System.out.print("Departamento: ");
		this.departamento = leitor.nextLine();

		System.out.println("");
		
		Tecnico t = new Tecnico(this.nome, this.cpf, this.endereco, this.data, this.titulacao, this.salario, this.siape, this.departamento);
		t.calculaSalario(salario);
		
		return t;
	}

	//dados terceirizados
	public Terceiro terceiro() {
		System.out.print("Nome: ");
		this.nome = leitor.nextLine();
		System.out.print("CPF: ");
		this.cpf = leitor.nextLine();
		System.out.print("Endereço: ");
		this.endereco = leitor.nextLine();
		System.out.print("Data de admissão: ");
		this.data = leitor.nextLine();
		System.out.print("Titulação: ");
		this.titulacao = leitor.nextLine();
		System.out.print("Salário Base: ");
		this.salario = leitor.nextDouble();
		System.out.print("Data de fim de contrato: ");
		this.dataFim = leitor.nextLine();
		System.out.print("Função: ");
		this.funcao = leitor.nextLine();

		System.out.println("");

		Terceiro th = new Terceiro(this.nome, this.cpf, this.endereco, this.data, this.titulacao, this.salario, this.dataFim, this.funcao);
		th.calculaSalario(salario);
		
		return th;
	}

	//cadastro de funcionarios
	public void Cadastrar(Funcionario f) {
		
		System.out.print("Digite o tipo de funcionario: ");
		tipo = leitor.nextLine();
		
		if (tipo.equalsIgnoreCase("Docente")) {
			cadastro.add(docente());
			cadastro.add(f);
		} else if (tipo.equalsIgnoreCase("Tecnico")) {
			cadastro.add(tecnico());
			cadastro.add(f);
		} else if (tipo.equalsIgnoreCase("Terceiro")) {
			cadastro.add(terceiro());
			cadastro.add(f);
		}
		
	}
	
	//pesquisar por funcionarios
	public ArrayList<Funcionario> Pesquisar(String nome) {
		System.out.print("Digite o nome do funcionário a ser pesquisado: ");
		nome = leitor.nextLine();
	
		for (Funcionario f : cadastro) {
			if(f.getNome().equalsIgnoreCase(nome)){
				return cadastro;
			}
		}
		return null;		
	}

	//mostrar lista de funcionarios cadastrados
	public ArrayList<Funcionario> Mostrar() {
		return cadastro;
	}	
}
