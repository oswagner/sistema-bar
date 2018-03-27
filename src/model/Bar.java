package model;

import java.util.ArrayList;
import java.util.List;

public class Bar {
	
	private List<Pessoa> clientes;
	
	public Bar() {
		super();
		this.clientes = new ArrayList<Pessoa>();
	}

	public List<Pessoa> getClientes() {
		return clientes;
	}

	public void setClientes(List<Pessoa> clientes) {
		this.clientes = clientes;
	}
}
