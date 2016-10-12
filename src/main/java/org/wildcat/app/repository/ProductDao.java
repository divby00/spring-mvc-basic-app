package org.wildcat.app.repository;

import org.wildcat.app.domain.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProductList();
    void saveProduct(Product prod);
}
