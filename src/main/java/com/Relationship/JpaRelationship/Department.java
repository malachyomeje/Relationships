package com.Relationship.JpaRelationship;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String duty;
    @OneToMany(mappedBy = "department")
    private List<Employee>employee;

}
