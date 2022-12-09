package Modelo.Material;

import java.util.Vector;
import Práctica_4___Diseño_de_la_persistencia_de_datos.Modelo.Servicio.Reserva2;

public class Ejemplar2 {
	private String _idInventario;
	private date _fechaCompra;
	private boolean _estado;
	public Libro2 _tiene;
	public Vector<Reserva2> _contiene = new Vector<Reserva2>();
}