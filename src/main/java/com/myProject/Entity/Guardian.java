package com.myProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class Guardian {
    @Column(name = "guardian_name")
    private String name;

    @Column(name = "guardian_mobile")
    private String mobile;

    @Column(name = "guardian_email")
    private String email;
}
