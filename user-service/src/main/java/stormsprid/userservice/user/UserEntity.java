package stormsprid.userservice.user;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

//@Entity
@Getter
@Setter
public class UserEntity {
    //@Id

    long id;
    String username;
    String password;
    //TODO List<Rewiew>
    LocalDateTime dateOfCreation;

    public UserEntity(long id,String username,String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        dateOfCreation = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                '}';
    }
}
