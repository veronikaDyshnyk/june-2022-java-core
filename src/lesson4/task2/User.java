package lesson4.task2;

import lesson2.task4.Car;
import lesson2.task4.Gender;
import lesson2.task4.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class User implements Comparable<User>{
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills = new ArrayList<Skill>();
    private Car car;

    public <T> User(int i, String name, String surname, String s, int i1, Gender female, List<T> asList) {
    }


    @Override
    public int compareTo(User o) {
        return this.skills.size()- o.skills.size();
    }
}
