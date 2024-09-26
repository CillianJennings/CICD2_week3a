package ie.atu.week2_refresher_test;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @NotNull
    private long id;

    @NotBlank
    @Size(min = 3, max=30, message = "Name must be between 3 to 30")
    private String name;

    @PositiveOrZero
    private double price;
}
