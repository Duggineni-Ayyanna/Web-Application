package com.example.DataWebProject.Repository;

import com.example.DataWebProject.Model.ProductsData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<ProductsData, Integer> {
}
