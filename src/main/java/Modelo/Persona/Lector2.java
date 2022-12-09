package Modelo.Persona;

import java.util.Vector;
import Práctica_4___Diseño_de_la_persistencia_de_datos.Modelo.Servicio.Reserva2;
import Práctica_4___Diseño_de_la_persistencia_de_datos.Modelo.Servicio.Favorito;

public class Lector2 extends Usuario2 {
	private String _dirección;
	private boolean _estado;
	private int _tiempoPenalización;
	public Vector<Reserva2> _realiza = new Vector<Reserva2>();
	public Vector<Favorito> _tiene = new Vector<Favorito>();
}