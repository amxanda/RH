package model;

public class Terceiro extends Funcionario {
	//atributos
	private String dataFim;
	private String funcao;

	//construtor
	public Terceiro(String nome, String cpf, String endereco, String data, String titulacao, double salario, String dataFim, String funcao) {
		super(nome, cpf, endereco, data, titulacao, salario);
		this.dataFim = dataFim;
		this.funcao = funcao;
	}

	//setters
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	//getters
	public String getDataFim() {
		return this.dataFim;
	}

	public String getFuncao() {
		return this.funcao;
	}

	//calculo do salario
	public double calculaSalario(double salario) {
		double result = 0;

		if (this.funcao.equalsIgnoreCase("Professor")) {
			if (this.getTitulacao().equalsIgnoreCase("Mestre")) {
				result = salario + 500;
			} else if (this.getTitulacao().equalsIgnoreCase("Doutor")) {
				result = salario + 1000;
			}
		}
		return result;
	}
}
