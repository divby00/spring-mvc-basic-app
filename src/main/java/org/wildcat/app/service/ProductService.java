package org.wildcat.app.service;

import org.wildcat.app.domain.Product;

import java.io.Serializable;
import java.util.List;

public interface ProductService extends Serializable {
    void increasePrice(int percentage);
    List<Product> getProducts();
}
