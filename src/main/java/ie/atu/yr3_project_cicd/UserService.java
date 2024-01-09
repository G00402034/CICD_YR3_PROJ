package ie.atu.yr3_project_cicd;


import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDB userDB;

    public UserService(UserDB userDB) {
        this.userDB = userDB;
    }

    public boolean isValidUser(String name, String password) {
        User user = userDB.findByName(name);
        if (user != null) {
            System.out.println(user);
            // Check both username and password
            return user.getName().equals(name) && user.getPassword().equals(password);
        }
        return false;
    }

    public void createOrUpdateUser(String name, String password) {
        User userInfo = new User(name, password);
        userDB.save(userInfo);
    }
}



