package lesson1;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String surname;
    private String dateOfBirth;
    private String nationality;
    private String sex;
    private String countryCode;
    private String passportNo;
    private char type;
    private String dateOfIssue;
    private String dateOfExpiry;


}
