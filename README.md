# Education Management System (Backend)

## Overview
The Education Management System backend is a comprehensive system developed using Java, Spring Boot, Hibernate, and MySQL. It provides RESTful web services to manage essential entities such as courses, students, and teachers, enhancing the overall functionality of the educational platform.

## Project Structure
The project is organized into different controllers for managing teachers and students, a department controller for handling departments, and corresponding service layers to interact with the database.

# Table of Contents
1. [Overview](#overview)
2. [Project Structure](#project-structure)
   1. [Teacher Controller](#teacher-controller)
   2. [Student Controller](#student-controller)
   3. [Department Controller](#department-controller)
3. [Entity Classes](#entity-classes)
   1. [Student Entity](#student-entity)
   2. [Teacher Entity](#teacher-entity)
   3. [Department Entity](#department-entity)
   4. [Course Entity](#course-entity)
4. [Repository Classes](#repository-classes)
   1. [Student Repository](#student-repository)
   2. [Teacher Repository](#teacher-repository)
   3. [Department Repository](#department-repository)
   4. [Course Repository](#course-repository)
5. [Service Classes](#service-classes)
   1. [Student Service](#student-service)
   2. [Teacher Service](#teacher-service)
   3. [Department Service](#department-service)
   4. [Course Service](#course-service)

### Teacher Controller
- **Get All Teachers:**
  - Endpoint: `GET /teachers`
  - Retrieve a list of all teachers.

- **Get Teacher by ID:**
  - Endpoint: `GET /teachers/{id}`
  - Retrieve a specific teacher by ID.

- **Create Teacher:**
  - Endpoint: `POST /teachers`
  - Create a new teacher.

- **Update Teacher:**
  - Endpoint: `PUT /teachers/{id}`
  - Update an existing teacher by ID.

- **Delete Teacher:**
  - Endpoint: `DELETE /teachers/{id}`
  - Delete a teacher by ID.

### Student Controller
- **Get All Students:**
  - Endpoint: `GET /students`
  - Retrieve a list of all students.

- **Get Student by ID:**
  - Endpoint: `GET /students/{id}`
  - Retrieve a specific student by ID.

- **Create Student:**
  - Endpoint: `POST /students`
  - Create a new student.

- **Update Student:**
  - Endpoint: `PUT /students/{id}`
  - Update an existing student by ID.

- **Delete Student:**
  - Endpoint: `DELETE /students/{id}`
  - Delete a student by ID.

### Department Controller
- **Save Department:**
  - Endpoint: `POST /departments`
  - Save a new department.

- **Fetch Departments:**
  - Endpoint: `GET /departments`
  - Retrieve a list of all departments.

- **Find Department by ID:**
  - Endpoint: `GET /departments/{id}`
  - Retrieve a specific department by ID.

- **Delete Department by ID:**
  - Endpoint: `DELETE /departments/{id}`
  - Delete a department by ID.

- **Update Department by ID:**
  - Endpoint: `PUT /departments/{id}`
  - Update a department by ID.

- **Fetch Department by Name:**
  - Endpoint: `GET /departments/name/{name}`
  - Retrieve a department by name.

### Entity Classes
- **Student Entity:**
  - Represents student information, including first name, last name, email address, and guardian details.

- **Teacher Entity:**
  - Represents teacher information, including first name, last name, and other relevant details.

- **Department Entity:**
  - Represents a department with a name and other details.
    
- **Course Entity:**
  - Represents a course with a name, ID and other details.

### Repository Classes
- **Student Repository:**
  - Handles database operations for the student entity.

- **Teacher Repository:**
  - Handles database operations for the teacher entity.

- **Department Repository:**
  - Handles database operations for the department entity.
    - **Find Department by Name:**
      - Method: `public Department findByDepartmentName(String departmentName);`

- **Course Repository:**
  - Handles database operations for the course entity.
    - **Find Courses by Name:**
      - Method: `Page<Course> findByCourseNameContainingIgnoreCase(String courseName, Pageable pageable);`

### Service Classes
- **Student Service:**
  - Implements business logic for student-related operations.

- **Teacher Service:**
  - Implements business logic for teacher-related operations.

- **Department Service:**
  - Implements business logic for department-related operations.

- **Course Service:**
  - Implements business logic for course-related operations.
