package br.com.ronald.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.ronald.database.database;
import br.com.ronald.interfaces.ICreate;
import br.com.ronald.models.User;

public class CreateUser implements ICreate {
	database connectionUser = new database();
	@SuppressWarnings("unused")
	@Override
	public void createUser() {
		Scanner in = new Scanner(System.in);
		String name;
		String cpf;
		
		System.out.println("Cadastro de usuario");
		System.out.println("Digite o nome do usuario: ");
		name = in.nextLine();
		System.out.println("Digite o cpf do usuario: ");
		cpf = in.nextLine();
		User user = new User(name, cpf);

		connectionUser.addUser(user);
		}

}
