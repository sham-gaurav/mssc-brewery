package guru.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getById(UUID id) {
			return CustomerDto.builder().id(id).name("Gaurav Sharma").build();
	}

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		log.info(customerDto.toString());
		return CustomerDto.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateCustomerById(UUID id, CustomerDto customerDto) {
		log.info("customer is udpated {}", id);
		log.info(customerDto.toString());
		
	}

	@Override
	public void deleteCustomerById(UUID id) {
		log.info("customer is deleted {}", id);
		//log.info(customerDto.toString());
		
	}

	
}
