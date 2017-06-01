package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClaseDAO implements InterfazDAO {
	
	private static Connection conexion = Conexion.getInstance();
	
	@Override
	public List<Socios> getListaSocios() {
		// select * from user order by login;
		List<Socios> listaSocios = new ArrayList<>();
		String sql = "SELECT * FROM socios ORDER BY id_socio";
		try {
			Statement statement = conexion.createStatement();
			ResultSet resulset = statement.executeQuery(sql);
			while(resulset.next()){
				int id_socio = resulset.getInt("id_socio");
				String nombre = resulset.getString("nombre");
				String apellidos = resulset.getString("apellidos");
				int telefono = resulset.getInt("telefono");
				String correo = resulset.getString("correo");
				Socios socio = new Socios(id_socio, nombre, apellidos, telefono, correo);
				listaSocios.add(socio);
			}
		} catch (SQLException e) {
			System.out.println("Error en la lectura de la BD");
		}
		return listaSocios;
	}
	public static void main(String[] args) {
		ClaseDAO c1 = new ClaseDAO();
		System.out.println(c1.getListaSocios());
	}
	
	@Override
	public List<Libros> getListaLibros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existeSocio(Socios socio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizarSocio(Socios socio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addSocio(Socios socio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addLibro(Libros libro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPrestamo(Prestamos prestamo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean borrarSocio(Socios socio) {
		// TODO Auto-generated method stub
		return false;
	}

}
