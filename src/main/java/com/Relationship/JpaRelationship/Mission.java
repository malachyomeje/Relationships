package com.Relationship.JpaRelationship;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    @ManyToMany(mappedBy = "missions")
    List<Employee> employees;
}
