package Concrete;

import java.rmi.RemoteException;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService CustomerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.CustomerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		
		try {
			if(CustomerCheckService.checkIfRealPerson(customer)) {
				System.out.println("Veritaban�na kaydedildi : " + customer.getFirstName());
			
			}
			else {
				System.out.println("Ge�ersiz kullan�c�");
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
