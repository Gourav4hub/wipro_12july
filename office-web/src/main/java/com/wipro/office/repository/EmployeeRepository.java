package com.wipro.office.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.office.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>
{

}
