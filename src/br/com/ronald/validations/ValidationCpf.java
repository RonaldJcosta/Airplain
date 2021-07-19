package br.com.ronald.validations;

import java.util.Scanner;

import br.com.ronald.interfaces.IAuthenticate;

public class ValidationCpf implements IAuthenticate{
  
	@Override
	public String validationCpf(String cpf) {
		Scanner in = new Scanner(System.in);
			
		try {
			while(!cpf.matches("[0-9]{3}[0-9]{3}[0-9]{3}[0-9]{2}")) {
				System.out.println("cpf invalido, Digite novamente: ");
				cpf = in.nextLine();
			}
				
			
		} catch (NumberFormatException | NullPointerException e) {
			System.out.println("Esse cpf é invalido\n\n\n\n");
		}
			

		return cpf;
	}
}
