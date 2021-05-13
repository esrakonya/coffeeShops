package coffeeShops;

import coffeeShops.abstracts.BaseCustomerManager;
import coffeeShops.adapters.MernisServiceAdapter;
import coffeeShops.concretes.StarbucksCustomerManager;
import coffeeShops.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Esra", "Konya", 1999, 11111111111L));
	}

}
