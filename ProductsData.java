package com.example.DataWebProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Entity
public class ProductsData {



    @Id

    public int ProductId;

    public String ProductName;

    public int ProductPrice;

    public ProductsData(int productId,String productName,int productPrice) {
        ProductId = productId;
        ProductName = productName;
        ProductPrice = productPrice;
    }

}