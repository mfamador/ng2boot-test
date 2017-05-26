package com.github.mfamador.ng2boot;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends
    MongoRepository<Employee, String> {


}
