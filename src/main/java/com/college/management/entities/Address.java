package com.college.management.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address_line1", nullable = false, length = 2000)
    private String addressLine1;

    @Column(name = "address_line2", length = 2000)
    private String addressLine2;

    @Column(name = "state", length = 100)
    private String state;

    @Column(name = "pincode", length = 20)
    private Integer pincode;

}