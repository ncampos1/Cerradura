package ar.edu.unlam.cerradura;

public class Cerradura {
 private int clave;
 private boolean abierta;
 
public  Cerradura (int clave){
	this.clave=clave;
	this.abierta=false;
	
}

public Cerradura() {
	// TODO Auto-generated constructor stub
}

public void abrir (int clave){
	if (this.clave==clave){
	this.abierta=true;}
}
public void SaberSiEstaAbierta (int clave){
	if (this.abierta==false)
			{
				this.abierta=false;
			}
	else{
		this.abierta=true;
	}
	

}
public void Cerrar(int clave){
this.abierta=false;
}
}