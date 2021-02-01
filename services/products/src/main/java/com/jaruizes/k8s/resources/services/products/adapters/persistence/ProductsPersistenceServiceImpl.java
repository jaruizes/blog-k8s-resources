package com.jaruizes.k8s.resources.services.products.adapters.persistence;

import com.jaruizes.k8s.resources.services.products.adapters.persistence.entities.ProductEntity;
import com.jaruizes.k8s.resources.services.products.adapters.persistence.repository.ProductsRepository;
import com.jaruizes.k8s.resources.services.products.business.model.Product;
import com.jaruizes.k8s.resources.services.products.business.ports.persistence.ProductsPersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsPersistenceServiceImpl implements ProductsPersistenceService {
    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Product> fetchByLabels(List<String> labels) {
        final List<ProductEntity> productEntities = this.productsRepository.findByLabels(labels);
        final List<Product> products = new ArrayList<>(productEntities.size());
        productEntities.forEach(productEntity -> {
            products.add(Product.builder().id(productEntity.getId())
                    .name(productEntity.getName())
                    .price(productEntity.getPrice())
                    .build());
        });

        return products;
    }
}
