package Abstracts;

import java.rmi.RemoteException;

import Entities.Customer;

public interface CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer) throws RemoteException;
}
