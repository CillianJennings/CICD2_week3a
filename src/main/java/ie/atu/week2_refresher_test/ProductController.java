package ie.atu.week2_refresher_test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private List<Product> products = new ArrayList<>();

    @GetMapping("get")
    public List<Product> getAllProducts() {
        return products;
    }

    @PostMapping("add")
    public ResponseEntity<String> addProduct(@RequestBody Product productN) {
        products.add(productN);
        return new ResponseEntity<>("Product successfully created\n" + productN, HttpStatus.CREATED);
    }

}
