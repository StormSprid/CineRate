    package stormsprid.userservice.user;


    import org.apache.catalina.User;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class UserController {
    @GetMapping("/getUser")
       public UserEntity getUser() {
        return new UserEntity(1, "Emil", "Galiyev");
    }

    }
