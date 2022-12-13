package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Horn implements Instrument{
    private int diameter;

    @Override
    public void play() {
        System.out.println("horn in diameter of " + this.diameter);
    }
}
