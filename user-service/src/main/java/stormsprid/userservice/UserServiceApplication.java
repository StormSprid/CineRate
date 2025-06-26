package stormsprid.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import stormsprid.userservice.user.UserEntity;

@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
        UserEntity user = new UserEntity(1,"Login","Password");
        System.out.println(user);
    }

}
