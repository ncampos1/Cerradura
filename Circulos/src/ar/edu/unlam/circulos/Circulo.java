package ar.edu.unlam.circulos;

public class Circulo {
	
	
	private double radio;
	
	
	
	
	public  Circulo(double radio ){
		this.radio=radio;
	}
		
	
	
	public double GetPerimetro (){
		return 3.14 * 2 * this.radio;
		
	}
	
	public double getRadio (){
		return this.radio;
	}


	
	
	
	
	
	
	
	

}
