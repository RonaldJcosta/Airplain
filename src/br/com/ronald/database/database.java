package br.com.ronald.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.ronald.interfaces.IDatabase;
import br.com.ronald.models.Reserve;
import br.com.ronald.models.User;

public class database implements IDatabase {
	private static List<User> userList = new ArrayList<User>();
	@Override
	public List<User> getUsers() {
		return userList;
	}
	public User findUser() {
		String cpf;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o cpf do cliente: ");
		cpf = in.nextLine();
		User finduser = null;
		for (User user : userList) {
			if(user.getCpf().equals(cpf)) {
				finduser = user;
				
			} 
				
		}
		return finduser;
	}



	@Override
	public List<User> addUser(User user) {
		String cpf = user.getCpf();
		int cont = 0;
		for (User users : userList) {
			if(users.getCpf().equals(cpf)) {
				cont++;
			}
		}
		
		if(cont == 0) {
			userList.add(user);
			System.out.println("Cadastrado com sucesso");
		} else {
			System.out.println("Esse usuario já esta cadastrado");
		}
						
				
		
		return userList;
	}
	
	@Override
	public List<Reserve> ReserveList(Reserve reserve) {
		List<Reserve> reserverList = new ArrayList<>();
		
		reserverList.add(reserve);
		return reserverList;
	}

}
