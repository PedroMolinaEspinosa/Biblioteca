package modelo;

import java.util.Date;

public class Prestamos {
	private int id_prestamo = 0;
	private String ISBN_libro = null;
	private int id_socio = 0;
	private Date fechaPrestamo = null;
	
	public Prestamos(int id_prestamo, String iSBN_libro, int id_socio, Date fechaPrestamo) {
		super();
		this.id_prestamo = id_prestamo;
		ISBN_libro = iSBN_libro;
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

	@Override
	public String toString() {
		return "Prestamos [id_prestamo=" + id_prestamo + ", ISBN_libro=" + ISBN_libro + ", id_socio=" + id_socio
				+ ", fechaPrestamo=" + fechaPrestamo + "]";
	}
	
	
}
