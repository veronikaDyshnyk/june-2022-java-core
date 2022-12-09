package lesson2.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Magazine extends Book {
    private String authors;
    private String photos;

    public Magazine(String cover, int page, String authors, String photos) {
        super(cover, page);
        this.authors = authors;
        this.photos = photos;
    }

    public Magazine(String paper, String ink, String cover, int page, String authors, String photos) {
        super(paper, ink, cover, page);
        this.authors = authors;
        this.photos = photos;
    }
}
