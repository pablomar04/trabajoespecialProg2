package tpe;

import java.util.Vector;

public class Coleccion {
	
	private Vector <Pista> pistas;

	public Coleccion() {
		super();
		this.pistas = new Vector <Pista>();
	}
	
	public void addPista (Pista p){
		
		
		pistas.add(p);
	}
	
	
	

}
