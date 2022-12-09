package lesson2.task2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Laptop extends PC {
    private Touchpad touchpad;

    public Laptop(Monitor monitor, Cpu cpu, Rum rum, Touchpad touchpad) {
        super(monitor, cpu, rum);
        this.touchpad = touchpad;
    }
}
