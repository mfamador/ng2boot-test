package com.github.mfamador.ng2boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  EmployeeDBRepository employeeDBRepository;
  @Autowired
  EmployeeRepository employeeRepository;


  @RequestMapping(method = RequestMethod.POST)
  public Employee create(@RequestBody Employee employee) {

    logger.debug("create: " + employee);

    Employee result = employeeRepository.save(employee);

    Employee resultDB = employeeDBRepository.save(employee);

    logger.debug("result: " + result);
    logger.debug("resultDB: " + resultDB);

    return result;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{employeeId}")
  public Employee get(@PathVariable String employeeId) {

    logger.debug("get info : " + employeeId);

    logger.debug("employee count : " + employeeRepository.count());
    logger.debug("employeeDB count : " + employeeDBRepository.count());

    List<Employee> employees = employeeRepository.findAll();
    employees.forEach(e -> logger.debug(" e: " + e));

    List<Employee> employeesDB = employeeDBRepository.findAll();
    employeesDB.forEach(e -> logger.debug(" edb: " + e));

    logger.debug("employee found : " + employeeRepository.findOne(employeeId));
    return employeeRepository.findOne(employeeId);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/{employeeId}")
  public void delete(@PathVariable String employeeId) {

    logger.debug("delete employeeId : " + employeeId);

    employeeRepository.delete(employeeId);
  }

}
