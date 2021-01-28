package guru.springframework.msscbrewery.web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.msscbrewery.services.CustomerService;
import guru.springframework.msscbrewery.web.model.CustomerDto;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

	
	private CustomerService customerService;
	
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("id") UUID id) {
		return new ResponseEntity<>(customerService.getById(id), HttpStatus.OK);
	
	}
	
	@PostMapping
	public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto){
		CustomerDto dto = customerService.saveCustomer(customerDto);
		HttpHeaders headers = new HttpHeaders();
				headers.add("location", "http://localhost:8080//api/v1/customer/" + dto.getId());
		
		return new ResponseEntity<CustomerDto>(headers,HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CustomerDto> updateCustomer(@PathVariable UUID id,@RequestBody CustomerDto customerDto){
		customerService.updateCustomerById(id,customerDto);
		return new ResponseEntity<CustomerDto>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<CustomerDto> deleteCustomer(@PathVariable UUID id){
		customerService.deleteCustomerById(id);
		return new ResponseEntity<CustomerDto>(HttpStatus.NO_CONTENT);
	}
	
}
