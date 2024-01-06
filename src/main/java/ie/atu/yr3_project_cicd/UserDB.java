package ie.atu.yr3_project_cicd;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDB extends JpaRepository<User, Long> {

    User findByName(String Name);
    }

