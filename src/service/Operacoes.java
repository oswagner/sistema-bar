package service;
import java.util.List;

import model.Bar;
import model.Pessoa;

public class Operacoes {

	private Bar bar;
	
	public Operacoes(Bar bar) {
		this.bar = bar;		
	}
	
	public boolean novoCliente(Pessoa pessoa) {
		List<Pessoa> list = this.bar.getClientes();
		if (!list.contains(pessoa)) {
			list.add(pessoa);
			return true;
		}
		return false;
	}
}
