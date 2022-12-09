package lesson2.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comics extends Book {
    private String pictures;

    public Comics(String cover, int page, String pictures) {
        super(cover, page);
        this.pictures = pictures;
    }

    public Comics(String paper, String ink, String cover, int page, String pictures) {
        super(paper, ink, cover, page);
        this.pictures = pictures;
    }
}
