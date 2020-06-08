package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlatoTest {

	Plato plato = new Plato("plato");
	Ingrediente tomate = new Ingrediente("tomate", 5, 3);
	Ingrediente carne = new Ingrediente("carne", 2, 1);
	Ingrediente huevo = new Ingrediente("huevo", 12, 3);

	@Test
	public void testQueSePuedanAgregarIngredientesIguales() {

		int cantDeIngredientes = 0;
		
		plato.agregarIngrediente(tomate);
		cantDeIngredientes++;
		plato.agregarIngrediente(tomate);
		cantDeIngredientes++;

		assertEquals(cantDeIngredientes, plato.getIngredientes().size());

	}

	@Test
	public void testQueSeObtengaLaCantidadDeSalCorrecta() {

		Integer cantCorrectaDeSal = 0;
		cantCorrectaDeSal += tomate.getCantidadSal();
		cantCorrectaDeSal += carne.getCantidadSal();
		cantCorrectaDeSal += huevo.getCantidadSal();
		
		plato.agregarIngrediente(carne);
		plato.agregarIngrediente(tomate);
		plato.agregarIngrediente(huevo);

		assertEquals(cantCorrectaDeSal, plato.obtenerCantidadaDeSal());

	}

	@Test
	public void testQueSeObtenegaLaCanidadDeAzucarCorrecta() {

		Integer cantCorrectaDeAzucar = 0;
		cantCorrectaDeAzucar += tomate.getCantidadAzucar();
		cantCorrectaDeAzucar += carne.getCantidadAzucar();
		cantCorrectaDeAzucar += huevo.getCantidadAzucar();
		
		plato.agregarIngrediente(carne);
		plato.agregarIngrediente(tomate);
		plato.agregarIngrediente(huevo);

		assertEquals(cantCorrectaDeAzucar, plato.obtenerCantidadDeAzucar());
		
	}

}
