package com.myProject.Controller;

import com.myProject.Entity.Department;
import com.myProject.Error.DepartmentNotFoundException;
import com.myProject.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping(path = "/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
            return departmentService.saveDepartment(department);
    }

    @GetMapping(path = "/departments")
    public List<Department> fetchDepartments() {
        return departmentService.fetchDepartmentList();
    }

    @GetMapping(path = "/departments/{id}")
    public Department findDepartmentByID(@PathVariable("id") Long departmentID) throws DepartmentNotFoundException {
        return departmentService.findDepartmentByID(departmentID);
    }

    @DeleteMapping(path = "/departments/{id}")
    public String deleteDepartmentByID(@PathVariable("id") Long departmentID) {
        departmentService.deleteDepartmentByID(departmentID);
        return "Deletion complete";
    }

    @PutMapping(path = "/departments/{id}")
    public Department updateDepartmentByID(@PathVariable("id") Long departmentID,
                                           @RequestBody Department department) {
        return departmentService.updateDepartmentByID(departmentID, department);
    }

    @GetMapping(path = "/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
        return departmentService.fetchDepartmentByName(departmentName);
    }

}
