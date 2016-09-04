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
	
	public void eliminarElemento(int id){
		
		if (id==this.ID){
			try {
				this.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
