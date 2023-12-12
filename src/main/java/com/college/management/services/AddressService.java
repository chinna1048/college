package com.college.management.services;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.MergedAnnotation.Adapt;
import org.springframework.stereotype.Service;

import com.college.management.entities.Address;
import com.college.management.repositories.AddressRepository;

@Service
public class AddressService {

	
	@Autowired
	private AddressRepository addressRepo;
	
	
	public Address addAddress(Address address) {
		Address result = addressRepo.save(address);
		//In address entity id is null, once we saved that record in db and that result is stored in result var, 
		//id also will get updated
		return result;
	}

	public List<Address> getAddressList() {
		List<Address> result = addressRepo.findAll();
		return result;
	}

	public Address getAddressById(long id) throws Exception {
		// first we need to test the id is existing in db or not
		Optional<Address> entity = addressRepo.findById(id);
		//Optional is 1.8 feature
		if(entity.isPresent()) {
			return entity.get();//return the address entity
		}else {
			// here we can throw an exception bcz that id is not present db but ui dev was asking.
	          throw new Exception("Addess id not present in db");
		}
	}

}
