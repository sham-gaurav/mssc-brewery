package guru.springframework.msscbrewery.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDto;

public interface CustomerService {
	
	public CustomerDto getById(UUID id);

	public CustomerDto saveCustomer(CustomerDto customerDto);

	public void updateCustomerById(UUID id, CustomerDto customerDto);

	public void deleteCustomerById(UUID id); 

}
