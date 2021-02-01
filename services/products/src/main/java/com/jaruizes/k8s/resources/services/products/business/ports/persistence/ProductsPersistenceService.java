package com.jaruizes.k8s.resources.services.products.business.ports.persistence;

import com.jaruizes.k8s.resources.services.products.business.model.Product;

import java.util.List;

public interface ProductsPersistenceService {

    List<Product> fetchByLabels(List<String> labels);
}
