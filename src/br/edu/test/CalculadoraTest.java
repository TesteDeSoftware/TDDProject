package br.edu.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calc;
	
	@BeforeClass
	/**
	 * Executa uma vez antes de todos os testes
	 * @throws Exception
	 */
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	/**
	 * Executa uma vez depois de todos os testes
	 * @throws Exception
	 */
	public static void tearDownAfterClass() throws Exception {
		fail("Teste não implementado!!");
	}

	@Before
	/**
	 * Executa antes de cada teste.
	 * @throws Exception
	 */
	public void setUp() throws Exception {
		calc = new Calculadora();
	}

	@After
	/**
	 * Executa depois de cada teste.
	 * @throws Exception
	 */
	public void tearDown() throws Exception {
		calc = null;
	}

	@Test
	public void testSoma() {
		assertEquals("Teste falhou!!",1,calc.soma(0, 1));
	}
	
	@Test
	public void testSubtracao(){
		assertEquals("Teste falhou!!",1,calc.subtracao(1, 0));
	}
	
	@Test
	public void testDivisao(){
		assertEquals("Teste falhou!!",2,calc.divisao(2, 1),0);
	}
	
	@Test
	public void testMultiplicacao(){
		assertEquals("Teste falhou!!",0,calc.multiplicacao(0, 1),0);
	}

}
