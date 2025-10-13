package com.example.Shopping.controls;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Shopping.model.Shop;
import com.example.Shopping.services.ShopServices;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopServices shopServices;

    @PostMapping("/add")
    public Shop addShop(@RequestBody Shop shop) {
        return shopServices.addShop(shop);
    }

    @GetMapping("/all")
    public List<Shop> getAllShops() {
        return shopServices.getAllShops();
    }

    @GetMapping("/{id}")
    public Shop getShopById(@PathVariable int id) {
        return shopServices.getShopById(id);
    }
    
 // ✏️ UPDATE with PathVariable
    @PutMapping("/update/{id}")
    public Shop updateShop(@PathVariable int shopId, @RequestBody Shop shop) {
        shop.setShopId(shopId); // Ensure the ID from the path is set in the Shop object
        return shopServices.updateShop(shop);
    }


    // ❌ DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteShop(@PathVariable int id) {
        shopServices.deleteShop(id);
        return "Shop deleted successfully with ID: " + id;
    }
}
