package Homework5.core.concretes;

import Homework5.core.abstracts.SignUpService;
import Homework5.entities.concretes.User;

public class MainAdapter implements SignUpService{

	@Override
	public void signUp(User user) {
		System.out.println("Ba�ar�l� bir �ekilde giri� yap�ld� : " + user.getEmail());
		
	}
	
}
