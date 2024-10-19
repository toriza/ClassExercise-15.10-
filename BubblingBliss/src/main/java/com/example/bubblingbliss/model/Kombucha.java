package com.example.bubblingbliss.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "drinks")
public class Kombucha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String flavor;
    private int quantity;

    public Kombucha(String name, String flavor, int quantity) {
        this.name = name;
        this.flavor = flavor;
        this.quantity = quantity;
    }
}
