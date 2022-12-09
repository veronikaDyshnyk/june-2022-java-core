package lesson2.task2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ultrabook extends Laptop {
private double weight;

    public Ultrabook(Touchpad touchpad, double weight) {
        super(touchpad);
        this.weight = weight;
    }

    public Ultrabook(Monitor monitor, Cpu cpu, Rum rum, Touchpad touchpad, double weight) {
        super(monitor, cpu, rum, touchpad);
        this.weight = weight;
    }
}
