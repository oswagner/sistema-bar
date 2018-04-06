package business;
import java.util.ArrayList;
import java.util.List;

import model.Bar;
import model.Pessoa;
import persistence.Repository;

public class Operacoes {

	private Bar bar;
	private Repository pessoaRepository;
	
	public Operacoes(Bar bar, Repository pessoaRepository) {
		this.bar = bar;
		this.pessoaRepository = pessoaRepository;
	}
	
	public boolean novoCliente(Pessoa pessoa) throws Exception {
		if (pessoa.equals(null)) {
			throw new Exception("Pessoa invalida");
		}
		List<Pessoa> list = this.bar.getClientes();
		if (!list.contains(pessoa)) {
			list.add(pessoa);
			return true;
		}
		return false;
	}
	
	public void salvarDados() {
		ArrayList<Pessoa> list = (ArrayList<Pessoa>) bar.getClientes();
		if (!list.isEmpty()) {			
			pessoaRepository.salvar(bar.getClientes());
		}
	}
}
