package modelo;

public class Socios {
	private int id_socio = 0;
	private String nombre = null;
	private String apellidos = null;
	private int telefono = 0;
	private String correo = null;
	
	public Socios(int id_socio, String nombre, String apellidos, int telefono, String correo) {
		super();
		this.id_socio = id_socio;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
	}
	public int getId_socio() {
		return id_socio;
	}
	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Socios [id_socio=" + id_socio + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono="
				+ telefono + ", correo=" + correo + "]";
	}
	
	
}
