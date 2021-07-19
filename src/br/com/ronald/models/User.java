package br.com.ronald.models;

import java.util.ArrayList;
import java.util.List;

import br.com.ronald.interfaces.ICreate;
import br.com.ronald.interfaces.IReserve;
import br.com.ronald.validations.ValidationCpf;

public class User extends ValidationCpf {
	private String name;
	private String cpf;
	private static List<String> reserve =  new ArrayList<String>();
	
	public List<String>  getReserve() {
		return reserve;
	}
	public void setReserve(String rotas) {
		this.reserve.add(rotas);
	}
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
		
		this.cpf = validationCpf(cpf);
	}
	
	public User(String name, String cpf) {

		this.name = name;
		this.cpf = validationCpf(cpf);
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	
		
	
}
