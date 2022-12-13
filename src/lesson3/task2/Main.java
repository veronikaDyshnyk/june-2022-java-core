package lesson3.task2;


//Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//        Интерфейс Инструмент содержит метод play()
//        Гитара содержит переменные класса количествоСтрун,
//        Барабан - размер, Труба - диаметр. Создать массив типа Инструмент, содержащий инструменты разного типа.
//        В цикле вызвать метод play() для каждого инструмента,
//        который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Instrument> instruments = new ArrayList<>();

        instruments.add(new Guitar(NumberOfStrings.SIX, Type.ACOUSTIC));
        instruments.add(new Drum(4));
        instruments.add(new Horn(7));

        for (Instrument instrument : instruments) {
            instrument.play();
        }


    }
}
