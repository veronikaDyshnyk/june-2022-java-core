package lesson3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Printable {
    private String name;
    private int pages;
    private Genre genre;

    @Override
    public void print() {
        System.out.println(this.toString());

    }
}
