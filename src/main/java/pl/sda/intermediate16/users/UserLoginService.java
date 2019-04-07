package pl.sda.intermediate16.users;

import org.apache.commons.codec.digest.DigestUtils;

public class UserLoginService {
    public boolean login(UserLoginDTO userDTO){
        UserDAO userDAO = new UserDAO();
        return userDAO.getUserList().stream()
                .filter(u -> u.getLogin().equals(userDTO.getEmail()))
                .findAny()
                .map(u -> u.getPasswordHash()
                        .equals(DigestUtils.sha512Hex(userDTO.getPassword())))
                .orElse(false);
    }
}
