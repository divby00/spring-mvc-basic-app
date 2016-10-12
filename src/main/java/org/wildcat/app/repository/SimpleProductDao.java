package org.wildcat.app.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.wildcat.app.domain.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository(value = "productDao")
public class SimpleProductDao implements ProductDao {

    @PersistenceContext(unitName = "appPU")
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public List<Product> getProductList() {
        return em.createQuery("select p from Products p").getResultList();
    }

    @Override
    @Transactional(readOnly = false)
    public void saveProduct(Product product) {
        em.merge(product);
    }
}
