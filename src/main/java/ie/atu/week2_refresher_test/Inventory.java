package ie.atu.week2_refresher_test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(name = "inventory-service", url = "http://localhost:8081")
public interface Inventory {
    @PostMapping("/inventory/add")
    String storeProduct(Product product);
}
