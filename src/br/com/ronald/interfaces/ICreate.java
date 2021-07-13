package br.com.ronald.interfaces;

import br.com.ronald.Models.User;

public abstract interface ICreate {
	
	public abstract User createUser(String name, String cpf);
	
}
