package com.college.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.management.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
