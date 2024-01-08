package ie.atu.yr3_project_cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Yr3ProjectCicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(Yr3ProjectCicdApplication.class, args);
    }

}
