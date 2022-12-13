package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guitar implements Instrument{
    private NumberOfStrings numberOfStrings;
    private Type type;



    @Override
    public void play() {
        System.out.println("now is playing a " + " " + type.name() + " guitar with " + numberOfStrings.name() + " strings");
    }
}
