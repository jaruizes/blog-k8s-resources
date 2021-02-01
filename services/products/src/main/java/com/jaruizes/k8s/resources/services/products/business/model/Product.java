package com.jaruizes.k8s.resources.services.products.business.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class Product {

    private long id;
    private String name;
    private double price;
    private List<String> labels;
}
