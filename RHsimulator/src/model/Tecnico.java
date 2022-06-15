package model;

public class Tecnico extends Funcionario {
	public int siape;
	public String departamento;

	public Tecnico(String nome, String cpf) {
		super(nome, cpf);
	}

	public void setSiape(int siape) {
		this.siape = siape;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getSiape() {
		return this.siape;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public double calculaSalario(double salario) {
		double result = 0;

		if (titulacao.equals("Mestre") || titulacao.equals("mestre")) {
			result = salario + (salario * 0.15);
		} else if (titulacao.equals("Doutor") || titulacao.equals("doutor")) {
			result = salario + (salario * 0.30);
		}

		return result;
	}
}
