package lesson2.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Papirus{
    private String cover;
    private int page;

    public Book(String paper, String ink, String cover, int page) {
        super(paper, ink);
        this.cover = cover;
        this.page = page;
    }
}
