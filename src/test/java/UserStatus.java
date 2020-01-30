import com.github.javafaker.Faker;
import lombok.NoArgsConstructor;

import java.util.Locale;
import java.util.Random;

public enum UserStatus {
    ACTIVE {
        @Override
        public String toString() {
            return "active";
        }
    },
    BLOCKED {
        @Override
        public String toString() {
            return "blocked";
        }
    };
}
