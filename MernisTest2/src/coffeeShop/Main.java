package coffeeShop;


import java.util.Calendar;
import java.util.Date;

import coffeeShop.abstracts.BaseCustomerManager;
import coffeeShop.concretes.NeroCustomerManager;
import coffeeShop.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1234,"Ahmet", "Kavuş", new Date(1995,Calendar.JULY,10) , "53515354838"));
		
		
	}

}
