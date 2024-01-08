package ie.atu.yr3_project_cicd;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createaccount")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        // Extracting user details from the request
        String newName = user.getName();
        String newPassword = user.getPassword();

        // Creating a new user object with extracted details
        User newAccount = new User(newName, newPassword);

        // Calling the createOrUpdateUser method
        userService.createOrUpdateUser(newAccount.getName(), newAccount.getPassword());

        // Returning a success response
        return ResponseEntity.ok("Account Created");
    }

    @PostMapping("/login")
    public ResponseEntity<String> authenticateAdmin(@RequestBody User user) {
        if (userService.isValidUser(user.getName(), user.getPassword())) {
            return ResponseEntity.ok("Login Successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid User credentials");
        }
    }
}
