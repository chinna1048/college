package com.college.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entities.Address;
import com.college.management.services.AddressService;

import jakarta.websocket.server.PathParam;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService; 
	
	/*
	 * i was implementing this api using request mapping, its old way to use
	 * 
	 * method type is RequestMethod.POST here, we can change to RequestMethod.GET or else 
	 * 
	 * */
	@RequestMapping(value="add/address",method= RequestMethod.POST)
	public Address addAddress(@RequestBody Address address) {
		/* @RequestBody Address address meaning is 
		 * i was taking entire address input from UI and storing in Address variable
		 * to access this json format body in java we should use @RequestBody
		 * */
		Address result = addressService.addAddress(address);
		return result;
	}

	@GetMapping("get/address")
	public List<Address> getAddressList(){
		List<Address> result = addressService.getAddressList();
		return result;
	}
	
	//using Path variable 
	@GetMapping("/get/address/{id}")
	public Address getAddressById(@PathVariable("id") long id) throws Exception{
		// used to extract the value of the template variables and assign their value to a method variable
		Address result = addressService.getAddressById(id);
		return result;
	}
	
	//using Path param 
	@GetMapping("/get/address/by/id")
	public Address getAddressByIdUsingParam(@PathParam("id") long id) throws Exception{
		// used to extract the value of the template variables and assign their value to a method variable
		Address result = addressService.getAddressById(id);
		return result;
	}
}
