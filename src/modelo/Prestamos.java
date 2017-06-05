package modelo;

import java.util.Date;

public class Prestamos {
	private int id_prestamo = 0;
	private String ISBN_libro = null;
	private String titulo_libro = null;
	private String nombre_socio = null;
	private int id_socio = 0;
	private Date fechaPrestamo = null;
	
	
	
	
	
	
	public Prestamos(int id_prestamo, String iSBN_libro, String titulo_libro, String nombre_socio, int id_socio,
			Date fechaPrestamo) {
		super();
		this.id_prestamo = id_prestamo;
		ISBN_libro = iSBN_libro;//deberia referenciar en el constructor las variables pertenecientes a otras clases poniendo el nombre de la clase delante?
		this.titulo_libro = titulo_libro;
		this.nombre_socio = nombre_socio;
		this.id_socio = id_socio;
		this.fechaPrestamo = fechaPrestamo;
	}
	public int getId_prestamo() {
		return id_prestamo;
	}
	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}
	public String getISBN_libro() {
		return ISBN_libro;
	}
	public void setISBN_libro(String iSBN_libro) {
		ISBN_libro = iSBN_libro;
	}
	public String getTitulo_libro() {
		return titulo_libro;
	}
	public void setTitulo_libro(String titulo_libro) {
		this.titulo_libro = titulo_libro;
	}
	public String getNombre_socio() {
		return nombre_socio;
	}
	public void setNombre_socio(String nombre_socio) {
		this.nombre_socio = nombre_socio;
	}
	public int getId_socio() {
		return id_socio;
	}
	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	
	
	
	
}
