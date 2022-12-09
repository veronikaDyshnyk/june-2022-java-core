package lesson2.task2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Workstation extends PC {
    private String  extraFech;

    public Workstation(Monitor monitor, Cpu cpu, Rum rum, String extraFeach) {
        super(monitor, cpu, rum);
        this.extraFech = extraFeach;
    }
}
