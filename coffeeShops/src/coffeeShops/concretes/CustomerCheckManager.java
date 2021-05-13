package coffeeShops.concretes;

import coffeeShops.abstracts.CustomerCheckService;
import coffeeShops.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}


}
