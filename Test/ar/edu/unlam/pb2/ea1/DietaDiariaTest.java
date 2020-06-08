package ar.edu.unlam.pb2.ea1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import org.junit.Test;

public class DietaDiariaTest {
	
	DietaDiaria dietaDiaria = new DietaDiaria(3, 25);
	Plato almuerzo = new Plato("almuerzo");
	Plato cena = new Plato("cena");
	Ingrediente carne = new Ingrediente("carne", 2, 0);

	@Test
	public void testQueNosePuedanAgregarPlatoRepetidos() {

		DietaDiaria dieta = new DietaDiaria(100, 100);

		dieta.agregarPlato(cena);
		HashSet<Plato> platosFinales = dieta.getPlatos();
		dieta.agregarPlato(cena);

		assertEquals(platosFinales, dieta.getPlatos());
	}
	
	
	@Test
	public void testQueDietaDiariaSeaAptaHipertenso() {
		
		Ingrediente pollo = new Ingrediente("lechuga", 1, 0);

		almuerzo.agregarIngrediente(pollo);
		dietaDiaria.agregarPlato(almuerzo);
		cena.agregarIngrediente(carne);
		dietaDiaria.agregarPlato(cena);
		
		assertTrue(dietaDiaria.aptaHipertenso());

	}

	@Test
	public void testQueDietaDiariaNoSeaAptaHipertenso() {
		
		Ingrediente sal = new Ingrediente("sal", 50, 0);
		
		cena.agregarIngrediente(carne);
		cena.agregarIngrediente(sal);
		dietaDiaria.agregarPlato(cena);
		
		assertFalse(dietaDiaria.aptaHipertenso());

	}

	@Test
	public void testQueDietaDiariaSeaAptaDiabetico() {
		Ingrediente pescado = new Ingrediente("pescado", 2, 25);
		
		almuerzo.agregarIngrediente(carne);
		dietaDiaria.agregarPlato(almuerzo);
		cena.agregarIngrediente(pescado);
		dietaDiaria.agregarPlato(cena);
		
		assertTrue(dietaDiaria.aptaDiabetico());

	}
	
	@Test
	public void testQueDietaDiariaNoSeaAptaDiabetico() {
		
		Ingrediente azucar = new Ingrediente("azucar", 0, 26);
		
		almuerzo.agregarIngrediente(carne);
		dietaDiaria.agregarPlato(almuerzo);
		cena.agregarIngrediente(azucar);
		dietaDiaria.agregarPlato(cena);
		
		assertFalse(dietaDiaria.aptaDiabetico());
		
	}
}
