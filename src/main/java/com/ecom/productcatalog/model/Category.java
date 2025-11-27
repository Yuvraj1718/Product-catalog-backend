package com.ecom.productcatalog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category",
               cascade = CascadeType.ALL,
               fetch = FetchType.LAZY)
//    @JsonManagedReference
//    @JsonIgnoreProperties({"category"})
    @JsonIgnore
    private Set<Product> products;

    public Category(String name) {
        this.name = name;
    }

}