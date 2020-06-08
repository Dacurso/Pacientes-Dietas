package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public class Plato {

	/**
	 * Por ejemplo, si para un Plato se necesitan DOS (2) tomates, se deberá agregar
	 * DOS(2) unidades de tomate.
	 */
	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	private String nombre;

	public Plato(String nombre) {
		this.ingredientes = new ArrayList<Ingrediente>();
		this.setNombre(nombre);
	}

	public void agregarIngrediente(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);
	}

	public Integer obtenerCantidadaDeSal() {
		Integer cantSal = 0;

		for (Ingrediente ingrediente : ingredientes) {
			cantSal += ingrediente.getCantidadSal();
		}

		return cantSal;
	}

	public Integer obtenerCantidadDeAzucar() {
		Integer cantAzucar = 0;

		for (Ingrediente ingrediente : ingredientes) {
			cantAzucar += ingrediente.getCantidadAzucar();
		}

		return cantAzucar;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
