package ar.edu.unlam.pb2.ea1;

public class Hipertenso extends Paciente {

	private Integer presionMinima;
	private Integer presionMaxima;

	public Hipertenso(String nombre, String apellido, Integer dni, Integer presionMax, Integer presionMin) {
		super(nombre, apellido, dni);
		this.presionMaxima = presionMax;
		this.presionMinima = presionMin;
	}

	@Override // Control de dieta para un Hipertenso
	public void agregarDietaDiaria(DietaDiaria dieta) {

		if (esDietaApta(dieta)) {
			this.getIngesta().add(dieta);
		}
	}
	
	
	public Boolean esDietaApta(DietaDiaria dieta) {
		return dieta.aptaHipertenso();
	}
	

	public Integer getPresionMinima() {
		return presionMinima;
	}

	public void setPresionMinima(Integer presionMinima) {
		this.presionMinima = presionMinima;
	}

	public Integer getPresionMaxima() {
		return presionMaxima;
	}

	public void setPresionMaxima(Integer presionMaxima) {
		this.presionMaxima = presionMaxima;
	}

}
