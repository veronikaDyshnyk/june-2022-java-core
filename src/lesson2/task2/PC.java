package lesson2.task2;
//
//Створити та описати наступну їєрархію
//        PC-Laptop-Ultrabook
//        PC-Laptop- Workstation
//        Загальна кількість вкористаних класів - 4!


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PC {
private Monitor monitor;
private Cpu cpu;
private Rum rum;


}
