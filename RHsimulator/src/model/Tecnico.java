package model;

public class Tecnico extends Funcionario{
    public int siape;
    public String departamento;
    
    public Tecnico(String nome, String cpf){
    	super(nome,cpf);
    }
    
    public void setSiape(int siape){
        this.siape = siape;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public int getSiape(){
        return this.siape;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
    
    public double calculaSalario(double salario){
        double result=0;
        
        if (titulacao.equals("M") || titulacao.equals("m")){
            result = salario + (salario*0.15);
        }
        else
        if (titulacao.equals("D") || titulacao.equals("d")){
        	result = salario + (salario*0.30);
        }
            	
    	return result;
    }
}
