package pl.sda.intermediate16.users;

import java.util.HashMap;
import java.util.Map;

public class UserValidationService {
    public Map<String, String> validate(UserRegistrationDTO userRegistrationDTO){
        Map<String, String> errorMap = new HashMap<>();
        String firstName = userRegistrationDTO.getFirstName();
        if (firstName.length() <3){
            errorMap.put("firstNameValRes", "Powinny być przynajmniej 3 znaki");
        }
        return errorMap;
    }
}
