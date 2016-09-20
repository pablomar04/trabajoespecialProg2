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
	
	public void delPista (int id){
		
		if (id<pistas.size()){
			
			pistas.remove(id);
			for (int i=0; i<playlists.size();i++){
				playlists.elementAt(i).eliminarElemento(id);
				
			}
		}
		
	}
	
	public int cantidadElementos(){
		int suma=0;
		for (int i=0;i<pistas.size();i++){
			suma++;
		}
		return suma;
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
