package tpe;

import java.util.Enumeration;
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
	
	public int getTime(){
		int res=0;
		Pista aux;
		for (Enumeration e=pistas.elements();e.hasMoreElements();){
			aux= (Pista)e.nextElement();
			res+=aux.getDuracion();
		}
		return res;
	}
	
	
	

}
