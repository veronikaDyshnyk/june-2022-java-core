package lesson1;

import java.util.ArrayList;

public class Cat {
    private String name;
    private int age;
    private String breed;
    private String colour;
    private ArrayList<String> specialNotes = new ArrayList<>();

    public Cat() {
    }

    public Cat(String name, int age, String breed, String colour, ArrayList<String> specialNotes) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.colour = colour;
        this.specialNotes = specialNotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public ArrayList<String> getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(ArrayList<String> specialNotes) {
        this.specialNotes = specialNotes;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                ", specialNotes=" + specialNotes +
                '}';
    }
}
