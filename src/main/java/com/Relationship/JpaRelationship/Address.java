package com.Relationship.JpaRelationship;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String country;
    private String state;
    private String town;
    private String streetNo;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
