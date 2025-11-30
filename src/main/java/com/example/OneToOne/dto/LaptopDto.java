package com.example.OneToOne.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaptopDto {
    private Integer id;
    private String brand;
    private String model;
    private Integer ram;
}
