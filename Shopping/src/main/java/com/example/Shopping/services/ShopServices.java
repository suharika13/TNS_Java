package com.example.Shopping.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Shopping.model.Shop;
import com.example.Shopping.repo.ShopRepo;

@Service
public class ShopServices {

    @Autowired
    private ShopRepo shopRepo;  // ✅ fixed variable name from shopRep → shopRepo (for naming consistency)

    // ➕ CREATE
    public Shop addShop(Shop shop) {
        return shopRepo.save(shop);
    }

    // 📋 READ ALL
    public List<Shop> getAllShops() {
        return shopRepo.findAll();
    }

    // 🔍 READ BY ID
    public Shop getShopById(int id) {
        return shopRepo.findById(id).orElse(null);
    }

    // ✏️ UPDATE
    public Shop updateShop(Shop shop) {
        return shopRepo.save(shop);
    }

    // ❌ DELETE
    public void deleteShop(int id) {
        if (shopRepo.existsById(id)) {
            shopRepo.deleteById(id);
        } else {
            throw new IllegalArgumentException("Shop with ID " + id + " does not exist.");
        }
    }
}
