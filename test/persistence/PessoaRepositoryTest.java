package persistence;

import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaRepositoryTest {

	@Test
	public void testAdicionaPessoa() {
		PessoaRepository pessoaRepository = new PessoaRepository();
		pessoaRepository.salvar(null);
	}

}
