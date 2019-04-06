package pl.sda.intermediate16.users;

import lombok.Getter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Getter
public class UserDAO { //DATA ACCESS OBJECT - klasa dostepowa do zrodla danych
    private final String path = "C:/projects/users_data.txt";
    private List<User> userList = new ArrayList<>();

    public void saveUser(User user) {
        userList.add(user);
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(userList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
