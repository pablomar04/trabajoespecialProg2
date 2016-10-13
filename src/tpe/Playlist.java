package tpe;

import java.util.Vector;

public class Playlist extends ElementoMusical {
	
	
	String nombre;
	Vector <ElementoMusical> elementos;
	
	
	
	public Playlist() {
		super();
		nombre="Lista sin nombre";
		elementos = new Vector<ElementoMusical>();
	}

	public Playlist(Vector<ElementoMusical> elementos, String nombre) {
		super();
		this.elementos = elementos;
		this.nombre= nombre;
	}


	
	public void addElemento (ElementoMusical e){
		
		elementos.addElement(e);
		
	}
	

	
	public int getTime(){
		int suma=0;
		for (int i=0;i<elementos.size();i++){
			Elemento ei= (Elemento) elementos.elementAt(i);
			suma = suma + ei.getTime();
		}
		return suma;
	}
	
	public int contarElementos(){
		int suma=0;
		for (int i=0;i<elementos.size();i++){
			Elemento ei= (Elemento) elementos.elementAt(i);
			suma = suma + ei.contarElementos();
		}
		return suma;
	}

	/*public int contarElementos() {
		int suma=0;
		for (int i=0;i<this.elementos.size();i++){
			
			if(this.elementos.elementAt(i) instanceof ElementoLista){
				suma++;
			}else{
			
				suma+=this.elementos.elementAt(i).contarElementos();
			}
		}
		
	}*/


}
