package lesson4.task1;

//
//Створити List Юзерів
//        - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//
//створити ArrayList зі словами на 15-20 елементів.
//        - відсортувати його за алфавітом .

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1,"namaste",20));
        users.add(new User(2,"sola",22));
        users.add(new User(4,"monika",30));

        users.sort(Comparator.comparingInt(User::getAge));
        users.sort((o1, o2) -> o2.getAge()- o1.getAge());
        users.sort((o1, o2) -> o1.getName().length()-o2.getName().length());

        ArrayList<String> words = new ArrayList<>();
        words.sort((o1, o2) -> o1.compareTo(o2));


    }
}



