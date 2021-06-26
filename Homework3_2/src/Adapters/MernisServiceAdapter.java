package Adapters;

import java.rmi.RemoteException;

import Abstracts.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) throws RemoteException {
        KPSPublicSoap client = new KPSPublicSoapProxy();
        return client.TCKimlikNoDogrula(
        		customer.getNationalityId(), 
        		customer.getFirstName(), 
        		customer.getLastName(), 
        		customer.getDateOfBirth());
    }
}
