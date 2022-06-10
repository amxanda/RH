package model;

public class Docente extends Funcionario{
    private int siape;
    private String areaVinculada;
      
    public Docente(String nome, String cpf){
    	super(nome,cpf);
    }
    
    public void setSiape(int siape){
        this.siape = siape;
    }
    
    public void setAreaVinculada(String area){
        this.areaVinculada = area;
    }
    
    public int getSiape(){
        return this.siape;
    }
    
    public  String getAreaVinculada(){
        return this.areaVinculada;
    }
    
    public double calculaSalario(double salario){
        double result=0;
        
        if (titulacao.equals("M") || titulacao.equals("m")){
            result = salario + (salario*0.20);
        }
        else 
        if (titulacao.equals("D") || titulacao.equals("d")){
        	result = salario + (salario*0.40);
        }
            	
    	return result;
    }
}
