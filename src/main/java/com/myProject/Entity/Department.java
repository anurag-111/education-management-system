package com.myProject.Entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long departmentID;

    @NotBlank(message = "Department name cannot be null.")
    @Column(name = "department_name")
    public String departmentName;

    @Column(name = "department_address")
    public String departmentAddress;

    @Column(name = "department_code")
    public String departmentCode;
}
