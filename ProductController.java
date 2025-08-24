package com.example.DataWebProject.Controller;

import com.example.DataWebProject.Model.ProductsData;
import com.example.DataWebProject.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/")
    public String home(){
        return "Home";
    }
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<ProductsData> getProducts() {
        return productService.getProducts();
    }
    @RequestMapping("/products/{productId}")
    public ProductsData getProductById(@PathVariable int productId) {
        return productService.getProductsById(productId);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody ProductsData productsData) {
        productService.addProduct(productsData);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody ProductsData productsData) {
        productService.updateProduct(productsData);
    }
    @DeleteMapping("/products/{productId}")
    public void deleteProductById(@PathVariable int productId) {
        productService.deleteProduct(productId);
    }
}
