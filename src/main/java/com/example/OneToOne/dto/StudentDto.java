package com.example.OneToOne.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Integer id;
    private String name;
    private String address;
    private Double marks;
    private LaptopDto laptop;
}
