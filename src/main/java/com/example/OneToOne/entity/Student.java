package com.example.OneToOne.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String address;
    private double marks;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "laptop_id", referencedColumnName = "id") //FK column in Student table
    private Laptop laptop;
}
