package np.com.onlyrj.ems_backend.service;

import np.com.onlyrj.ems_backend.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    //create employee
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    //get employee by id
    EmployeeDTO getEmployeeById(Long employeeId);

    //get all employee in a list
    List<EmployeeDTO> getAllEmployees();

    //update employee data
    EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO updatedEmployee);

    //delete employee
    void deleteEmployee(Long employeeId);

}
