package lv.tanja.rocketshop.ecommerce.controller;

import com.sun.istack.NotNull;
import lv.tanja.rocketshop.ecommerce.repository.Product;
import lv.tanja.rocketshop.ecommerce.repository.ProductRepository;
import lv.tanja.rocketshop.ecommerce.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    // productService constructor injection
@Autowired
    ProductServiceImpl productService;


    @GetMapping(value = { "", "/" })
    public
    Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
}