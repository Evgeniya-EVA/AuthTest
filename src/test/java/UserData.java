import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode (exclude = "status")
public class UserData {
    @Getter private String login;
    @Getter @Setter
    private String password;
    @Getter private String status;

    public UserData(){
        this.login = DataGeneration.getLogin();
        this.password = DataGeneration.getPassword();
        this.status = DataGeneration.setStatus(UserStatus.ACTIVE);
    }

    public void setBlockedStatus() {
        this.status = UserStatus.BLOCKED.toString();
    }

    public void setActiveStatus() {
        this.status = UserStatus.ACTIVE.toString();
    }
}
