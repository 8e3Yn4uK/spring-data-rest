package com.ve3yn4uk.springboot.restcrudapihibernate.dao;

import com.ve3yn4uk.springboot.restcrudapihibernate.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by 8e3Yn4uK on 08.04.2019
 */

@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
