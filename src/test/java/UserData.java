import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@EqualsAndHashCode (exclude = "status")
public class UserData {
    @Getter private String login;
    @Getter private String password;
    @Getter private String status;

    public UserData(){
        this.login = DataGeneration.getLogin();
        this.password = DataGeneration.getPassword();
        this.status = DataGeneration.getRandomStatus();
    }
}
