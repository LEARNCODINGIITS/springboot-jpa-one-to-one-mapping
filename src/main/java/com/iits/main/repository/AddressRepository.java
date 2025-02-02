package com.iits.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iits.main.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
