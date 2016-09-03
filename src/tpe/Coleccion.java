package tpe;

import java.util.Vector;

public class Coleccion  {
	
	private Vector <Pista> pistas;
	private Vector <Elemento> playlists;
	
	public Coleccion() {
		super();
		this.pistas = new Vector <Pista>();
		this.playlists = new Vector <Elemento>();
	}
	
	public void addPista (Pista p){
		
		
		pistas.add(p);
	}
	
	
	public int getTimeColeccion(){
		int suma=0;
		Pista aux;
		for (int i=0;i<pistas.size();i++){
			aux= (Pista)pistas.elementAt(i);
			suma+=aux.getDuracion();
		}
		return suma;
	}
	
	
	

}
