package ar.edu.unlam.pb2.ea1;

public class Ingrediente {

	private String nombre;
	private Integer cantidadSal;
	private Integer cantidadAzucar;

	public Ingrediente(String nombre, Integer cantidadSal,
			Integer cantidadAzucar) {
		this.nombre = nombre;
		this.cantidadSal = cantidadSal;
		this.cantidadAzucar = cantidadAzucar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadSal() {
		return cantidadSal;
	}

	public void setCantidadSal(Integer cantidadSal) {
		this.cantidadSal = cantidadSal;
	}

	public Integer getCantidadAzucar() {
		return cantidadAzucar;
	}

	public void setCantidadAzucar(Integer cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}

}
