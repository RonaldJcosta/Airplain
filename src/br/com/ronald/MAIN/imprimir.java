package br.com.ronald.MAIN;

import java.util.List;

import br.com.ronald.models.User;

public class imprimir {
	public void imprimi(List<User> users) {
		System.out.println("\n\n");
		if(!users.isEmpty()) {
			System.out.println("Todos os usuarios cadastrados");
		} else {
			System.out.println("Não há nenhum usuario cadastrado");
		}
		for (User user : users) {
			System.out.println("Nome: "+user.getName() + " cpf: "+ imprimeCPF(user.getCpf()) + " reservas: " + 
				user.getReserve());
		}
	}
	public void imprimiUser(User user) {
		System.out.println("\n\n");
		System.out.println("Cliente cadastrado");
		
		System.out.println("Nome: "+user.getName() + " cpf: "+ imprimeCPF(user.getCpf()) + " reservas: " + 
				user.getReserve());	

	}
	
	private String imprimeCPF(String cpf) {
	    return(cpf.substring(0, 3) + "." + cpf.substring(3, 6)
	 + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
	}
}


