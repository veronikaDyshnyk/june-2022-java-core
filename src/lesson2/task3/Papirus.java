package lesson2.task3;


//
//Cтворити клас ланцюг наслідування:
//        Папірус-Кинга-Журнал
//        Папірус-Книга-Комікс
//        Кількість полів довільна.


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Papirus {
private String paper;
private String ink;

}
