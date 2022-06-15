package model;

public class Terceiro extends Funcionario {
	private String dataFim;
	private String funcao;

	public Terceiro(String nome, String cpf) {
		super(nome, cpf);
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getDataFim() {
		return this.dataFim;
	}

	public String getFuncao() {
		return this.funcao;
	}

	public double calculaSalario(double salario) {
		double result = 0;

		if (funcao == "Professor") {
			if (titulacao.equals("Mestre") || titulacao.equals("mestre")) {
				result = salario + 500;
			} else if (titulacao.equals("Doutor") || titulacao.equals("doutor")) {
				result = salario + 1000;
			}
		}

		return result;
	}
}
