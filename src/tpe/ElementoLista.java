package tpe;

public class ElementoLista extends Elemento{
	
	public int ID;
	public int duracion;
	
	public ElementoLista (int id, int duracion){
		
		this.ID=id;
		this.duracion=duracion;
	}
	
	@Override
	public int getTime() {
		
		return duracion;
	}

	@Override
	public int contarElementos() {
		// TODO Auto-generated method stub
		return 1;
	}	

}
