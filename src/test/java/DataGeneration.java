import com.github.javafaker.Faker;
import lombok.NoArgsConstructor;

import java.util.Locale;
import java.util.Random;

@NoArgsConstructor
public class DataGeneration {
    private static Faker faker = new Faker(Locale.ENGLISH);

    public static String getLogin(){
        return faker.name().username();
    }

    public static String getPassword(){
        return faker.internet().password();
    }

    public static String setStatus(UserStatus status) {
        if (status.equals(UserStatus.ACTIVE)) {
            return UserStatus.ACTIVE.toString();
        } else return UserStatus.BLOCKED.toString();
    }
}