package tpe;

public class programa {

	public static void main(String[] args) {
		
		Pista p1 = new Pista(1,"El tiempo no para",311,"Bersuit Vergarabat","De la cabeza",2002,"Rock Nacional","");
		Pista p2 = new Pista(2,"Mi caramelo",311,"Bersuit Vergarabat","De la cabeza",2002,"Rock Nacional","");
		Pista p3 = new Pista(3,"Party rock anthem",408,"LMFAO","Sorry for Party Rocking",2011,"Electro pop","");
		Pista p4 = new Pista(4,"Sorry for Party Rocking",421,"LMFAO","Sorry for Party Rocking",2011,"Electro pop","");
		Pista p5 = new Pista(5,"Fix you",255,"Coldplay","X&Y",2005,"Rock Alternativo","");
		Pista p6 = new Pista(6,"Speed of Sound",455,"Coldplay","x&Y",2005,"Rock Alternativo","");
		Pista p7 = new Pista(7,"Viva la vida",320,"Coldplay","Viva la vida",2008,"Rock Alternativo","");
		Pista p8 = new Pista(8,"Whit or whitout you",360,"U2","The Joshua Tree",1987,"Rock","");
		Pista p9 = new Pista(9,"Vertigo",355,"U2","How to Dismantle an Atomic Bomb",2004,"Rock","");
		Pista p10 = new Pista(10,"City of Blinding Lights",284,"U2","How to Dismantle an Atomic Bomb",2004,"Rock","");
		Pista p11 = new Pista(11,"A la luz de la luna",438,"El Indio Solari","Pajaritos, bravos muchachitos",2013,"Rock Nacional","");
		Pista p12 = new Pista(12,"Yo Canibal",311,"Patricio rey y sus redonditos de ricota","Lobo Suelto, Cordero atado",1993,"Rock Nacional","");
		
		Coleccion c1 = new Coleccion();
		
		c1.addPista(p1);
		c1.addPista(p2);
		c1.addPista(p3);
		c1.addPista(p4);
		c1.addPista(p5);
		c1.addPista(p6);
		c1.addPista(p7);
		c1.addPista(p8);
		c1.addPista(p9);
		c1.addPista(p10);
		c1.addPista(p11);
		c1.addPista(p12);
		
		System.out.println("Tama�o de la coleccion: "+c1.getTimeColeccion());
		
		Playlist lomejor = new Playlist();
		Elemento e1= new ElementoLista(3,408);
		Elemento e2= new ElementoLista(4,421);
		Elemento e3= new ElementoLista(7,320);
		Elemento e4= new ElementoLista(12,311);
		Elemento e5= new ElementoLista(11,438);
		
		lomejor.addElemento(e1);
		lomejor.addElemento(e2);
		lomejor.addElemento(e3);
		lomejor.addElemento(e4);
		
		
		
		System.out.println("Tama�o playlist 'Lo mejor': "+lomejor.getTime());
		
		lomejor.addElemento(e5);
		
		System.out.println("Tama�o playlist 'Lo mejor': "+lomejor.getTime());
		lomejor.eliminarElemento(11);
		lomejor.eliminarElemento(4);
		System.out.println("Tama�o playlist 'Lo mejor': "+lomejor.getTime());
		c1.delPista(4);//Esto esta borrando la posicion 4 del vector "CORREGIR"
		System.out.println("Tama�o de la coleccion: "+c1.getTimeColeccion());
		/*	Playlist lomejorymas = new Playlist();
		Elemento e5= new ElementoLista(1,311);
		lomejorymas.addElemento(e5);
		lomejorymas.addElemento(lomejor);
		
		System.out.println(lomejorymas.getTime());
		
		c1.delPista(1);
		System.out.println(lomejorymas.getTime());

	lomejor.addElemento(3);
		lomejor.addElemento(4);
		lomejor.addElemento(7);
		lomejor.addElemento(12);
		//lomejor.imprimirLista();*/
		

	}

}
