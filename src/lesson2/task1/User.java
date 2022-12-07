package lesson2.task1;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private int id;
    private String name;
    private String userName;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}
