package lesson4.task2;


import lesson2.task4.Car;
import lesson2.task4.Gender;
import lesson2.task4.Skill;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<User> userHashSet = new HashSet<>();
        userHashSet.add(new User(1,
                "name",
                "surname",
                "email.com",
                20,
                Gender.FEMALE,
                Arrays.asList(new Skill("js",2),
                        new Skill("java",2)),
                new Car("sx",1999,200)
        ));

        Iterator<User> iterator = userHashSet.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getGender().equals(Gender.MALE)){
                iterator.remove();
            }
        };

        TreeSet<User> treeSet= new TreeSet<>();
        treeSet.add(new User(1,
                "name",
                "surname",
                "email.com",
                20,
                Gender.FEMALE,
                Arrays.asList(new Skill("js",2),
                        new Skill("java",2)),
                new Car("sx",1999,200)
        ));




    }
}


