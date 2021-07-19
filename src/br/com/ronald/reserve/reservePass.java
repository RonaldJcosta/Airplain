package br.com.ronald.reserve;

import java.util.Scanner;

import br.com.ronald.database.database;
import br.com.ronald.menus.menus;
import br.com.ronald.models.User;
import br.com.ronald.user.saveReserve;

public class reservePass {
	public void reservepass() {
		
		database userList = new database();
		Scanner in = new Scanner(System.in);
		String cpf;
	
		int opcao = 0;
		saveReserve savereserve = new saveReserve();
		menus menu = new menus();
		System.out.println("Escolha uma das opções");
		menu.menuRotas();
		opcao = in.nextInt();
		System.out.println(opcao);
		savereserve.saveReserveUser(opcao);		
			
		
		
	}
}
