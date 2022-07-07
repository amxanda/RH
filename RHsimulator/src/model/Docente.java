package model;

public class Docente extends Funcionario {
	//atributos
	private int siape;
	private String areaVinculada;

	//construtor
	public Docente(String nome, String cpf, String endereco, String data, String titulacao, double salario, int siape, String areaVinculada) {
		super(nome, cpf, endereco, data, titulacao, salario);
		this.siape = siape;
		this.areaVinculada = areaVinculada;
	}

	//setters
	public void setSiape(int siape) {
		this.siape = siape;
	}

	public void setAreaVinculada(String area) {
		this.areaVinculada = area;
	}

	//getters
	public int getSiape() {
		return this.siape;
	}

	public String getAreaVinculada() {
		return this.areaVinculada;
	}

	//calculo do salario
	public double calculaSalario(double salario) {
		double result = 0;
		
		if (this.getTitulacao().equalsIgnoreCase("Mestre")) {
			result = salario + (salario * 0.20);
		} else if (this.getTitulacao().equalsIgnoreCase("Doutor")) {
			result = salario + (salario * 0.40);
		}
		return result;
	}
}
