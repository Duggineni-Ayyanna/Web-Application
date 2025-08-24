package com.example.DataWebProject.Service;

import com.example.DataWebProject.Model.ProductsData;
import com.example.DataWebProject.Repository.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductsRepo repo;

//    List<ProductsData> products =new ArrayList<>(Arrays.asList(
//            new ProductsData(123,"iphone",60000),
//            new ProductsData(124,"Samsung",40000),
//            new ProductsData(125,"Google",32000)
//    ));

    public List<ProductsData> getProducts() {
        return repo.findAll();
    }



    public ProductsData getProductsById(int productId) {
        return  repo.findById(productId).get();
    }
    public void addProduct(ProductsData productsData) {
        repo.save(productsData);
    }
    public void updateProduct(ProductsData productsData) {
        repo.save(productsData);

    }
    public void deleteProduct(int productId) {
        repo.deleteById(productId);
    }
}
