package br.com.ronald.authentications;

import br.com.ronald.interfaces.IAuthenticate;

public class AuthenticateCpf implements IAuthenticate{
  
	@Override
	public String authenticateCpf(String cpf) {
	
			
		try {
			if(!cpf.isEmpty() && cpf.length() == 11) {
				
			} else {
				System.out.println("cpf invalido");
			}
				
			
		} catch (NumberFormatException | NullPointerException e) {
			System.out.println("Esse cpf é invalido\n\n\n\n");
		}
			

		return cpf;
	}
}
