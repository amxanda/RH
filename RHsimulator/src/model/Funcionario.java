package model;

public class Funcionario {
	private String nome;
	private String cpf;
	private String endereco;
	private String data;
	protected String titulacao;
	private double salario;

	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

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

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public String getData() {
		return this.data;
	}

	public String getTitulacao() {
		return this.titulacao;
	}

	public double getSalario() {
		return this.salario;
	}

	public double calculaSalario() {
		return this.salario;
	}
}