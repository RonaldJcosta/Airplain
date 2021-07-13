package br.com.ronald.MAIN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.ronald.Models.User;
import br.com.ronald.authentications.AuthenticateCpf;
import br.com.ronald.users.CreateUser;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CreateUser createUser = new CreateUser();
		AuthenticateCpf auth = new AuthenticateCpf();
		
		String name;
		String cpf = null;
		int opcao = 1;
		ArrayList<User> userList = new ArrayList<>();
		while(opcao < 3) {
			name = in.nextLine();
			
			cpf = in.nextLine();
			userList.add(createUser.createUser(name, cpf));
			
			
			opcao++;
		}
		
		for (User user : userList) {
				System.out.println("Name: "+user.getName()+" cpf: "+ imprimeCPF(user.getCpf()));
		}

	}
	
	public static String imprimeCPF(String CPF) {
	    return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
	    CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
	}

}


