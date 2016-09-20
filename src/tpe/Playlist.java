package tpe;

import java.util.Vector;

public class Playlist extends Elemento {
	
	
	String nombre;
	Vector <Elemento> elementos;
	
	
	
	public Playlist() {
		super();
		nombre="Lista sin nombre";
		elementos = new Vector<Elemento>();
	}

	public Playlist(Vector<Elemento> elementos, String nombre) {
		super();
		this.elementos = elementos;
		this.nombre= nombre;
	}


	
	public void addElemento (Elemento e){
		
		elementos.addElement(e);
		
	}
	
	public void eliminarElemento(int id) {
		for (int i=0;i<this.elementos.size();i++){
			if(this.elementos.elementAt(i) instanceof ElementoLista){
				ElementoLista aux = (ElementoLista)this.elementos.elementAt(i);
				if (aux.ID==id){
					this.elementos.removeElementAt(i);
				}
			}else{
			
				this.elementos.elementAt(i).eliminarElemento(id);
			}
		}
		
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
