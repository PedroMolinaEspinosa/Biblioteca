package modelo;

import java.util.List;

public interface InterfazDAO {
	List<Socios> getListaSocios();
	List<Libros> getListaLibros();
	boolean existeSocio(Socios socio);	
	boolean actualizarSocio(Socios socio);	
	boolean addSocio(Socios socio);
	boolean addLibro(Libros libro);
	boolean addPrestamo(Prestamos prestamo);
	boolean borrarSocio(Socios socio);
	

}
