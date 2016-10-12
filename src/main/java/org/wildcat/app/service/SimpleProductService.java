package org.wildcat.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.wildcat.app.domain.Product;
import org.wildcat.app.repository.ProductDao;

import java.util.List;


@Component
public class SimpleProductService implements ProductService {

    @Autowired
    private ProductDao productDao;

    private List<Product> products;

    @Override
    public void increasePrice(int percentage) {
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * (100 + percentage)/100;
                product.setPrice(newPrice);
                productDao.saveProduct(product);
            }
        }
    }

    @Override
    public List<Product> getProducts() {
        return productDao.getProductList();
    }

}
