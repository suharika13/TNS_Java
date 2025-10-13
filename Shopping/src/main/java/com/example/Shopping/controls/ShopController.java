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

    @PostMapping("/add")     //http://localhost:8099/shop/add
    public Shop addShop(@RequestBody Shop shop) {
        return shopServices.addShop(shop);
    }

    @GetMapping("/all")       //http://localhost:8099/shop/all 
    public List<Shop> getAllShops() {
        return shopServices.getAllShops();
    }

    @GetMapping("/{id}")     //http://localhost:8099/shop/1
    public Shop getShopById(@PathVariable int id) {
        return shopServices.getShopById(id);
    }
    

    @PutMapping("/update/{id}")
    public Shop updateShop(@PathVariable int shopId, @RequestBody Shop shop) {
        shop.setShopId(shopId); // Ensure the ID from the path is set in the Shop object
        return shopServices.updateShop(shop);
    }


    @DeleteMapping("/delete/{id}")          //http://localhost:8099/shop/delete/1 
    public String deleteShop(@PathVariable int id) {
        shopServices.deleteShop(id);
        return "Shop deleted successfully with ID: " + id;
    }
}
