package br.com.ronald.MAIN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.ronald.authenticates.validuser;
import br.com.ronald.database.database;
import br.com.ronald.menus.menus;
import br.com.ronald.models.User;
import br.com.ronald.reserve.reservePass;
import br.com.ronald.user.CreateUser;
import br.com.ronald.validations.ValidationCpf;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bem-vindo ao nosso sistema aéreo");
		menus menu = new menus();
		CreateUser createUser = new CreateUser();
		reservePass reservepass = new reservePass();
		database userList = new database();
		imprimir imprimir = new imprimir();
		Scanner in = new Scanner(System.in);
		validuser valuser = new validuser();
		String cpf;
		
		
		int opcao = -1;
		
		while(opcao != 0) {
			menu.menuPrincipal();
			opcao = in.nextInt();
			switch (opcao) {
			case 1:
				menu.menuRotas();
				break;
			case 2:
				createUser.createUser();
				break;
			case 3:
				if(valuser.validUser())
					reservepass.reservepass();
				break;
			case 4:
				imprimir.imprimi(userList.getUsers());
				break;
			case 5:
				imprimir.imprimiUser(userList.findUser());
				break;

			default:
				if(opcao > 5 && opcao < 0) {
					System.out.println("opcao invalida");
				}
				
				break;
				
			}
		}
		
		

	}
	
	
}


