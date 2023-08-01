package com.Relationship.JpaRelationship;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    private int age;
    private String email;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = ("department_id"))
    private Department department;
    @ManyToMany
    @JoinTable(
            name = "department_mession",
            joinColumns = @JoinColumn(name = "employee"),
            inverseJoinColumns = @JoinColumn(name = "missions")
    )

    List<Mission>missions;

}
