package service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.Bar;
import model.Cliente;
import model.Pessoa;

public class OperacoesTest {
	
	private Operacoes op;

	@Before
	public void setUp() throws Exception {
		Bar b = new Bar();
		this.op = new Operacoes(b);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNovoCliente() {
		Pessoa p = new Cliente("João", "01425983057", 20, 'F');
		Boolean added = this.op.novoCliente(p);
		assertTrue(added);
	}
	
	@Test
	public void testNovoClienteNullFail() {
		Boolean added = this.op.novoCliente(null);
		assertFalse(added);
	}

}
