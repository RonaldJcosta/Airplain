package br.com.ronald.Models;

import br.com.ronald.authentications.AuthenticateCpf;
import br.com.ronald.interfaces.ICreate;

public class User extends AuthenticateCpf {
	private String name;
	private String cpf;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		
		return cpf;
	}
	public void setCpf(String cpf) {
		
		this.cpf = authenticateCpf(cpf);
	}

	public User(String name, String cpf) {

		this.name = name;
		this.cpf = authenticateCpf(cpf);
	}			
	
}
