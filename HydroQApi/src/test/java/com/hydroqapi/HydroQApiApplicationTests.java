package com.hydroqapi;

import com.hydroqapi.Repository.EmployeeRepository;
import com.hydroqapi.Repository.PowerOutageRepository;
import com.hydroqapi.controller.EmployeeController;
import com.hydroqapi.controller.PowerOutageController;
import com.hydroqapi.models.Employee;
import com.hydroqapi.models.PowerOutage;
import com.hydroqapi.services.EmployeeService;
import com.hydroqapi.services.PowerOutageService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes ={Employee.class,EmployeeRepository.class,EmployeeController.class,EmployeeService.class,PowerOutage.class,PowerOutageController.class,PowerOutage.class,PowerOutageService.class} )
@SpringBootTest(classes = {Employee.class,EmployeeRepository.class,EmployeeController.class,EmployeeService.class,PowerOutage.class,PowerOutageController.class,PowerOutage.class,PowerOutageService.class})
@ExtendWith(SpringExtension.class)
class HydroQApiApplicationTests {/*

    @Autowired
    EmployeeService employeeService;
   @Autowired
    PowerOutageService powerOutageService;

    @Test
    void contextLoads() {
    }*/


}
