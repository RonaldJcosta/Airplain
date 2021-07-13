package br.com.ronald.users;


import br.com.ronald.Models.User;
import br.com.ronald.authentications.AuthenticateCpf;
import br.com.ronald.interfaces.ICreate;

public class CreateUser implements ICreate {

	@Override
	public User createUser(String name, String cpf) {
		User user = new User(name, cpf);
		return user;
	}

}
