import java.util.*;

public class Bus {

	private Empresa administrador;
	private Collection<Viaje> viajes;
	private String patente;
	private String marca;
	private String modelo;

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}