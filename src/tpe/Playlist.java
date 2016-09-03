package tpe;

import java.util.Enumeration;
import java.util.Vector;

public class Playlist extends Elemento {
	
	
	
	Vector <Integer> pistas;
	
	
	
	public Playlist() {
		super();
		pistas = new Vector<Integer>();
	}

	public Playlist(Vector<Integer> pistas) {
		super();
		this.pistas = pistas;
	}
	
	public void addPista(int i){
		pistas.add(i);
	}
	
	public void imprimirLista(){
		int aux;
		for (Enumeration e=pistas.elements();e.hasMoreElements();){
			aux= (Integer) e.nextElement();
			System.out.println(aux);
		}
	}
	

}
