package coffeeShop.adapters;

import coffeeShop.abstracts.CustomerCheckService;
import coffeeShop.entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		
		
		return false;
		
	}
	
	
	
}
