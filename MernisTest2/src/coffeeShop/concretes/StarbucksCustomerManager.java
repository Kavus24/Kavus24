package coffeeShop.concretes;

import coffeeShop.abstracts.BaseCustomerManager;
import coffeeShop.abstracts.CustomerCheckService;
import coffeeShop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (customerCheckService.CheckIfRealPerson(customer)) {

			super.save(customer);

		} else {

			System.out.println("Not a valid person");
		}

	}

}
