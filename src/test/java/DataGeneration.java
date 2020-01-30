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

    public static String getRandomStatus() {
        Random random = new Random();
        int statusIndex = random.nextInt(2);
        if (statusIndex == 0) {
            return UserStatus.ACTIVE.toString();
        } else return UserStatus.BLOCKED.toString();
    }
}