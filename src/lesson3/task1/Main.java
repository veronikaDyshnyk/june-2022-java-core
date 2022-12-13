package lesson3.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Printable> printableList = new ArrayList<>();
        printableList.add(new Book("status axiety",200, Genre.DRAMA));
        printableList.add(new Magazine("vogue",60, Publisher.PENGUIN));

        for (Printable printable : printableList) {
            printable.print();
        }
    }
}
