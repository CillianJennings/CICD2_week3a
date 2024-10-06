package ie.atu.week2_refresher_test;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "external-service", url = "http://localhost:8081")
public interface Interface {

}
