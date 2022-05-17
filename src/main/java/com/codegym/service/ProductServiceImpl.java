package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<Integer, Product>();
        products.put(1, new Product(1, "iPhone13 Pro Max", 1500, 100));
        products.put(2, new Product(2, "iPhone13", 1000, 100));
        products.put(3, new Product(3, "iPhone 13 Mini", 800, 80));
        products.put(4, new Product(4, "iPhone 12 Pro Max", 1400, 90));
        products.put(5, new Product(5, "iPhone 12", 900, 100));
        products.put(6, new Product(6, "iPhone 12 Mini", 700, 80));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
