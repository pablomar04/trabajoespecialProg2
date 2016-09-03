package tpe;

import java.util.Vector;

public class Playlist extends Elemento {
	
	
	String nombre;
	Vector <Elemento> elementos;
	
	
	
	public Playlist() {
		super();
		elementos = new Vector<Elemento>();
	}

	public Playlist(Vector<Elemento> elementos, String nombre) {
		super();
		this.elementos = elementos;
		this.nombre= nombre;
	}
	
	public int getTime(){
		int suma=0;
		for (int i=0;i<elementos.size();i++){
			Elemento ei= (Elemento) elementos.elementAt(i);
			suma = suma + ei.getTime();
		}
		return suma;
	}
	

	

}
