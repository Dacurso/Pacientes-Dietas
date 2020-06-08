package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public abstract class Paciente {

	private String nombre;
	private String apellido;
	private Integer dni;
	private ArrayList<DietaDiaria> ingesta;

	public Paciente (String nombre, String apellido, Integer dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.ingesta=new ArrayList<DietaDiaria>();
	}
	
	public abstract void agregarDietaDiaria(DietaDiaria dieta);
	public abstract Boolean esDietaApta(DietaDiaria dieta);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public ArrayList<DietaDiaria> getIngesta() {
		return ingesta;
	}

	public void setIngesta(ArrayList<DietaDiaria> ingesta) {
		this.ingesta = ingesta;
	}
	
	
	
	
	
	
}
