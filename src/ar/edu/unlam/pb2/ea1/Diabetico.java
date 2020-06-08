package ar.edu.unlam.pb2.ea1;

public class Diabetico extends Paciente {
	
	private Integer azucarEnSangre;

	public Diabetico(String nombre, String apellido, Integer dni, Integer azucarEnSangre) {
		super(nombre, apellido, dni);
		this.setAzucarEnSangre(azucarEnSangre);
	}
	
	
	@Override 	// Control de dieta para un Diabético
	public void agregarDietaDiaria(DietaDiaria dieta) {
		if(esDietaApta(dieta)) {
			this.getIngesta().add(dieta);
		}

	}
	
	public Boolean esDietaApta(DietaDiaria dieta) {
		return dieta.aptaDiabetico();
	}

	public Integer getAzucarEnSangre() {
		return azucarEnSangre;
	}


	public void setAzucarEnSangre(Integer azucarEnSangre) {
		this.azucarEnSangre = azucarEnSangre;
	}
}
