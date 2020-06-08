package ar.edu.unlam.pb2.ea1;

import java.util.HashSet;

public class DietaDiaria {

	/**
	 * No se permite repetir platos duarante todo el día.
	 */
	
	private HashSet<Plato> platos;
	private Integer cantMaxSal;
	private Integer cantMaxAzucar;

	public DietaDiaria(Integer cantMaxSal, Integer cantMaxAzucar) {
		this.platos = new HashSet<Plato>();
		this.cantMaxAzucar = cantMaxAzucar;
		this.cantMaxSal = cantMaxSal;
	}

	public void agregarPlato(Plato plato) {
		this.platos.add(plato);
	}

	private Integer totalDeSalEnDieta() {

		Integer totalSal = 0;
		for (Plato plato : platos) {
			totalSal += plato.obtenerCantidadaDeSal();
		}
		return totalSal;
	}

	private Integer totalDeAzucarEnDieta() {

		Integer totalAzucar = 0;
		for (Plato plato : platos) {
			totalAzucar += plato.obtenerCantidadDeAzucar();
		}
		return totalAzucar;
	}

	public Boolean aptaHipertenso() {
		return totalDeSalEnDieta() <= cantMaxSal;
	}

	public Boolean aptaDiabetico() {
		return totalDeAzucarEnDieta() <= cantMaxAzucar;
	}

	public HashSet<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(HashSet<Plato> platos) {
		this.platos = platos;
	}

	public Integer getCantMaxSal() {
		return cantMaxSal;
	}

	public void setCantMaxSal(Integer cantMaxSal) {
		this.cantMaxSal = cantMaxSal;
	}

	public Integer getCantMaxAzucar() {
		return cantMaxAzucar;
	}

	public void setCantMaxAzucar(Integer cantMaxAzucar) {
		this.cantMaxAzucar = cantMaxAzucar;
	}
}
