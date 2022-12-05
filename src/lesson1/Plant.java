package lesson1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plant {
    private int id;
    private String name;
    private String type;
    private String family;
    private boolean blooming;
    private boolean poisonous;
    private boolean edible;
    private int hardinessZone;
    private String rootSystem;


}
