package com.myProject.Service;

import com.myProject.Entity.Department;
import com.myProject.Error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department findDepartmentByID(Long departmentID) throws DepartmentNotFoundException;

    public void deleteDepartmentByID(Long departmentID);

    public Department updateDepartmentByID(Long departmentID, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
