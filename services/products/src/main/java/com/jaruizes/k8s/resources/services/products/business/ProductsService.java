package com.jaruizes.k8s.resources.services.products.business;

import com.jaruizes.k8s.resources.services.products.business.model.Product;
import com.jaruizes.k8s.resources.services.products.business.ports.persistence.ProductsPersistenceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private ProductsPersistenceService productsPersistenceService;

    public ProductsService(ProductsPersistenceService productsPersistenceService) {
        this.productsPersistenceService = productsPersistenceService;
    }

    public List<Product> getProducts(List<String> labels) {
        return this.productsPersistenceService.fetchByLabels(labels);
    }
}
