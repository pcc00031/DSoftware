package Modelo.Persona;

import java.util.Vector;
import Pr�ctica_4___Dise�o_de_la_persistencia_de_datos.Modelo.Servicio.Reserva2;
import Pr�ctica_4___Dise�o_de_la_persistencia_de_datos.Modelo.Servicio.Favorito;

public class Lector2 extends Usuario2 {
	private String _direcci�n;
	private boolean _estado;
	private int _tiempoPenalizaci�n;
	public Vector<Reserva2> _realiza = new Vector<Reserva2>();
	public Vector<Favorito> _tiene = new Vector<Favorito>();
}