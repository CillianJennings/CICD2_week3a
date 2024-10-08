package ie.atu.week2_refresher_test;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @NotNull(message = "Must have a value")
    @PositiveOrZero(message = "Cannot be a negative number")
    private long id;

    @NotBlank(message = "A value need to be entered")
    @Size(min = 3, max=30, message = "Name must be between 3 to 30 characters")
    private String name;

    @PositiveOrZero(message = "Cannot be a negative number")
    @Max(value=1000, message = "Enter a smaller value")
    private double price;
}
