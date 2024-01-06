package ie.atu.yr3_project_cicd;


import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDB userDB;

    public UserService(UserDB userDB ) {
        this.userDB = userDB;
    }

    public boolean existsByname(String name) {
        return userDB.findByName(name) != null;
    }

    public void createOrUpdateUser(String name, String password) {
       User UserInfo = new User(name, password);
        UserDB.save(UserInfo);
    }

}



}
