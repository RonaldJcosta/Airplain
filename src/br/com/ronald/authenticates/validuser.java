package br.com.ronald.authenticates;

import java.util.Scanner;

import br.com.ronald.database.database;
import br.com.ronald.models.User;
import br.com.ronald.validations.ValidationCpf;

public class validuser {
	database userList = new database();
	public boolean validUser() {
		Scanner in = new Scanner(System.in);
		String cpf;
		boolean resp = false;
		System.out.println("Digite o cpf do cliente: ");
		cpf = in.nextLine();
		ValidationCpf validationCpf = new ValidationCpf();
		for (User users : userList.getUsers()) {
			
			if(users.getCpf().equals(validationCpf.validationCpf(cpf))) {
							
				resp = true;
				
			} else {
				System.out.println("Esse usuario não é cadastrado");
				resp = false;
			}
		}
		
		return resp;
		
	}

}
