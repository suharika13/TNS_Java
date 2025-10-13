package com.example.Shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Shopping.model.Shop;

public interface ShopRepo extends JpaRepository<Shop, Integer> {
}
