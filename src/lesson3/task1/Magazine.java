package lesson3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine  implements Printable {
    private String name;
    private int pages;
    private Publisher publisher;


    @Override
    public void print() {
        String s = name + " " + publisher.name();
        System.out.println(s);
    }
}
