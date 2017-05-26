package com.github.mfamador.ng2boot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDBRepository extends
    JpaRepository<Employee, String> {


}
