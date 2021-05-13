package coffeeShops.abstracts;

import coffeeShops.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
