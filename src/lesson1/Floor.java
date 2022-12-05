package lesson1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Floor {
    private double size;
    private String colour;
    private String material;
    private boolean available;

}
