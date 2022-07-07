package model;

public class Tecnico extends Funcionario {
	//atributos
	public int siape;
	public String departamento;

	//construtor
	public Tecnico(String nome, String cpf, String endereco, String data, String titulacao, double salario, int siape, String departamento) {
		super(nome, cpf, endereco, data, titulacao, salario);
		this.siape = siape;
		this.departamento = departamento;
	}

	//setters
	public void setSiape(int siape) {
		this.siape = siape;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	//getters
	public int getSiape() {
		return this.siape;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	//calculo do salario
	public double calculaSalario(double salario) {
		double result = 0;

		if (this.getTitulacao().equalsIgnoreCase("Mestre")) {
			result = salario + (salario * 0.15);
		} else if (this.getTitulacao().equalsIgnoreCase("Doutor")) {
			result = salario + (salario * 0.30);
		}
		return result;
	}
}
