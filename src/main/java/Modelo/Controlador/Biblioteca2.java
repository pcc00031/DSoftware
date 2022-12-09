package Modelo.Controlador;

import java.util.Vector;
import Práctica_4___Diseño_de_la_persistencia_de_datos.Modelo.Persona.Usuario2;
import PaqueteLector.ControladorLector;
import PaqueteAdministrador.ControladorAdministrador;
import Bibliotecario.ControladorBibliotecario;
import Práctica_4___Diseño_de_la_persistencia_de_datos.Modelo.Material.Libro2;
import Práctica_4___Diseño_de_la_persistencia_de_datos.Modelo.Servicio.Préstamo2;

public class Biblioteca2 {
	public Vector<Usuario2> _accede_a = new Vector<Usuario2>();
	public ControladorLector _unnamed_ControladorLector_;
	public ControladorAdministrador _unnamed_ControladorAdministrador_;
	public ControladorBibliotecario _unnamed_ControladorBibliotecario_;
	public ObservadorActualizar _unnamed_ObservadorActualizar_;
	public ObservadorEliminar _unnamed_ObservadorEliminar_;
	public Vector<Libro2> _contiene = new Vector<Libro2>();
	public Vector<Préstamo2> _tramita = new Vector<Préstamo2>();

	public boolean autenticacion() {
		throw new UnsupportedOperationException();
	}

	public void addLibro(Object aData) {
		throw new UnsupportedOperationException();
	}

	public Libro getLibro() {
		throw new UnsupportedOperationException();
	}

	public boolean buscarLibro(Object aISBN) {
		throw new UnsupportedOperationException();
	}

	public void actualizarLibro(Object aData) {
		throw new UnsupportedOperationException();
	}

	public void eliminarLibro() {
		throw new UnsupportedOperationException();
	}

	public boolean getLibroBorrado() {
		throw new UnsupportedOperationException();
	}

	public list<Prestamo> pedirPrestamos() {
		throw new UnsupportedOperationException();
	}

	public date pedirFecha() {
		throw new UnsupportedOperationException();
	}

	public date pedirFechaTope() {
		throw new UnsupportedOperationException();
	}

	public date pedirFechaDev() {
		throw new UnsupportedOperationException();
	}
}