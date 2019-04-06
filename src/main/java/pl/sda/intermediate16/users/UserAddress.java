package pl.sda.intermediate16.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAddress {
    private String city;
    private String country;
    private String street;
    private String zipCode;
}
