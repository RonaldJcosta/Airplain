package br.com.ronald.reserve;

import br.com.ronald.models.Reserve;
import br.com.ronald.database.database;
import br.com.ronald.interfaces.IReserve;

public class CreateReserve implements IReserve {

	@Override
	public void reserve(String name) {
		Reserve reserve = new Reserve(name);
		
		database connectionReserve = new database();
		
		connectionReserve.ReserveList(reserve);
	}
	
	

	
}
