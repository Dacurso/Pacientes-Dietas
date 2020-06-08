package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PacienteTest {
	
	Paciente diabetico = new Diabetico("Emi", "D", 12345, 10);
	Paciente hipertenso = new Hipertenso("Ian", "E", 54321, 15, 8);
	DietaDiaria dietaApta = new DietaDiaria(3, 25);

	@Test
	public void testQueUnDiabeticoIngesteDietaAptaParaDiabetico() {
		
		Plato ensalada = new Plato("ensalada");
		Plato churrasco = new Plato("churrasco");
		Ingrediente lechuga = new Ingrediente("lechuga", 3, 1);
		Ingrediente tomate = new Ingrediente("tomate", 1, 2);
		Ingrediente carne = new Ingrediente("carne", 10, 2);

		ensalada.agregarIngrediente(lechuga);
		ensalada.agregarIngrediente(tomate);
		dietaApta.agregarPlato(ensalada);
		churrasco.agregarIngrediente(carne);
		dietaApta.agregarPlato(churrasco);
		
		assertTrue(diabetico.esDietaApta(dietaApta));

	}
	
	@Test
	public void testQueUnDiabeticoNoIngesteDietaAptaParaDiabetico() {
		
		
		Plato postre = new Plato("postre");
		Ingrediente chocolate = new Ingrediente("chocolate", 0, 26);
		
		postre.agregarIngrediente(chocolate);
		dietaApta.agregarPlato(postre);
		
		assertFalse(diabetico.esDietaApta(dietaApta));
		
	}

	
	@Test
	public void testQueUnHipertendoIngesteDietaAptaParaHipertenso() {
		
		Plato almuerzo = new Plato("almuerzo");
		Plato cena = new Plato("cena");
		Ingrediente pollo = new Ingrediente("pollo", 1, 2);
		Ingrediente zanahoria = new Ingrediente("zanahoria", 1, 5);
		Ingrediente papas = new Ingrediente("papas", 1, 8);
		
		almuerzo.agregarIngrediente(pollo);
		dietaApta.agregarPlato(almuerzo);
		cena.agregarIngrediente(zanahoria);
		cena.agregarIngrediente(papas);
		dietaApta.agregarPlato(cena);
		
		assertTrue(hipertenso.esDietaApta(dietaApta));

	}
	
	
	@Test
	public void testQueUnHipertendoNoIngesteDietaAptaParaHipertenso() {
		Plato merienda = new Plato("merienda");
		Ingrediente bizcochos = new Ingrediente("bizcochos", 20, 0);
		
		merienda.agregarIngrediente(bizcochos);
		dietaApta.agregarPlato(merienda);
		
		assertFalse(hipertenso.esDietaApta(dietaApta));

	}
}
