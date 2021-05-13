package coffeeShops.concretes;

import coffeeShops.abstracts.BaseCustomerManager;
import coffeeShops.abstracts.CustomerCheckService;
import coffeeShops.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Not a valid person.");
		}
	}
	

}
