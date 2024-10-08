package ie.atu.week2_refresher_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Week2RefresherTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week2RefresherTestApplication.class, args);
    }

}
