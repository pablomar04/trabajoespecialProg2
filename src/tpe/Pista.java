package tpe;

public class Pista extends ElementoMusical {
	
	private int ID;
	private String titulo;
	private int duracion;
	private String artista;
	private String album;
	private int anio;
	private String genero;
	private String comentarios;
	
	public Pista(int iD, String titulo, int duracion, String artista, String album, int anio, String genero,
			String comentarios) {
		super();
		ID = iD;
		this.titulo = titulo;
		this.duracion = duracion;
		this.artista = artista;
		this.album = album;
		this.anio = anio;
		this.genero = genero;
		this.comentarios = comentarios;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	public int getTime (){
		
		return duracion;
	}

	
	public int contarElementos() {
		
		return 1;
	}
	
	

}
