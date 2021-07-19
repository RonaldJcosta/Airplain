package br.com.ronald.interfaces;

import java.util.List;

import br.com.ronald.models.Reserve;
import br.com.ronald.models.User;

public interface IDatabase {
	public abstract List<User> getUsers();
	public abstract List<User> addUser(User user);	
	public abstract List<Reserve> ReserveList(Reserve reserve);
}
