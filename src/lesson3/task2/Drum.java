package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drum  implements Instrument{
    private int size;


    @Override
    public void play() {
        System.out.println("now is playing drum with diameter of " + this.size);
    }
}
