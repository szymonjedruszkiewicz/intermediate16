package pl.sda.intermediate16.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String surname;
    private String login;
    private String birthdate; //TODO LocalDate zamiast Stringa
    private String pesel;
    private String phone;
    private String passwordHash;
    private UserAddress userAddress;
}
