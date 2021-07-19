package br.com.ronald.user;

import br.com.ronald.models.Reserve;
import br.com.ronald.models.User;

public class saveReserve {
	public void saveReserveUser(int opcao) {
		System.out.println(opcao);
		User user = new User();
		switch (opcao) {
		case 1:
			System.out.println("entrou");
			user.setReserve("Minas gerais");
			break;
		case 2:
			user.setReserve("Rio grande do sul");
			break;
		case 3:
			user.setReserve("Bahia");
			break;
		case 4:
			user.setReserve("acre");
			break;

		default:
			System.out.println("Essa opção não existe");
			break;
		}
	}

}
